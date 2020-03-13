package org.springframework.samples.petclinic.owner;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Unit tests for org.springframework.samples.petclinic.owner.PetController
 *
 * @author Diffblue Cover
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = PetController.class)
public class PetControllerTest {

    @MockBean(name = "owners")
    private OwnerRepository owners;

    @MockBean(name = "pets")
    private PetRepository pets;

    @Autowired
    private PetController controller;

    @Test
    public void initCreationForm() throws Exception {
        when(owners.findById(Mockito.<Integer>any()))
            .thenReturn(new Owner());
        when(pets.findPetTypes())
            .thenReturn(new ArrayList<PetType>());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners/{ownerId}/pets/new", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdatePetForm"))
            .andExpect(view().name("pets/createOrUpdatePetForm"));
    }

    @Test
    public void initUpdateForm() throws Exception {
        when(owners.findById(Mockito.<Integer>any()))
            .thenReturn(new Owner());
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(new Pet());
        when(pets.findPetTypes())
            .thenReturn(new ArrayList<PetType>());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners/{ownerId}/pets/{petId}/edit", Integer.toString(0), Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdatePetForm"))
            .andExpect(view().name("pets/createOrUpdatePetForm"));
    }

    @Test
    public void processCreationForm1() throws Exception {
        when(owners.findById(Mockito.<Integer>any()))
            .thenReturn(new Owner());
        when(pets.findPetTypes())
            .thenReturn(new ArrayList<PetType>());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/new", Integer.toString(0))
                .param("birthDate", java.time.LocalDate.of(2_000, 1, 1).toString())
                .param("type.name", "int")
                .param("type.id", Integer.valueOf(1).toString())
                .param("name", "")
                .param("id", Integer.valueOf(1).toString()))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdatePetForm"))
            .andExpect(view().name("pets/createOrUpdatePetForm"));
    }

    @Test
    public void processCreationForm2() throws Exception {
        when(owners.findById(Mockito.<Integer>any()))
            .thenReturn(new Owner());
        when(pets.findPetTypes())
            .thenReturn(new ArrayList<PetType>());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/new", Integer.toString(0))
                .param("birthDate", java.time.LocalDate.of(2_000, 1, 1).toString())
                .param("type.name", "int")
                .param("type.id", Integer.valueOf(1).toString())
                .param("name", "bar")
                .param("id", Integer.valueOf(1).toString()))
            .andExpect(status().is(302))
            .andExpect(redirectedUrl("/owners/0"))
            .andExpect(view().name("redirect:/owners/{ownerId}"));
    }

    @Test
    public void processUpdateForm1() throws Exception {
        when(owners.findById(Mockito.<Integer>any()))
            .thenReturn(new Owner());
        when(pets.findPetTypes())
            .thenReturn(new ArrayList<PetType>());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/edit", Integer.toString(0), "Bella")
                .param("birthDate", java.time.LocalDate.of(2_000, 1, 1).toString())
                .param("type.name", "int")
                .param("type.id", Integer.valueOf(1).toString())
                .param("name", "")
                .param("id", Integer.valueOf(1).toString()))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdatePetForm"))
            .andExpect(view().name("pets/createOrUpdatePetForm"));
    }

    @Test
    public void processUpdateForm2() throws Exception {
        when(owners.findById(Mockito.<Integer>any()))
            .thenReturn(new Owner());
        when(pets.findPetTypes())
            .thenReturn(new ArrayList<PetType>());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/edit", Integer.toString(0), "Bella")
                .param("birthDate", java.time.LocalDate.of(2_000, 1, 1).toString())
                .param("type.name", "int")
                .param("type.id", Integer.valueOf(1).toString())
                .param("name", "bar")
                .param("id", Integer.valueOf(1).toString()))
            .andExpect(status().is(302))
            .andExpect(redirectedUrl("/owners/0"))
            .andExpect(view().name("redirect:/owners/{ownerId}"));
    }
}
