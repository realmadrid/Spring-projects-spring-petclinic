package org.springframework.samples.petclinic.owner;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.time.LocalDate;
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
public class PetControllerDiffblueTest {

    @MockBean(name = "owners")
    private OwnerRepository owners;

    @MockBean(name = "pets")
    private PetRepository pets;

    @Autowired
    private PetController controller;

    @Test
    public void initCreationForm() throws Exception {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        when(owners.findById(Mockito.<Integer>any()))
            .thenReturn(owner);
        when(pets.findPetTypes())
            .thenReturn(new ArrayList<PetType>());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners/{ownerId}/pets/new", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdatePetForm"))
            .andExpect(view().name("pets/createOrUpdatePetForm"));
    }

    @Test
    public void initUpdateForm() throws Exception {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        when(owners.findById(Mockito.<Integer>any()))
            .thenReturn(owner);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        when(pets.findPetTypes())
            .thenReturn(new ArrayList<PetType>());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners/{ownerId}/pets/{petId}/edit", Integer.toString(1), Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdatePetForm"))
            .andExpect(view().name("pets/createOrUpdatePetForm"));
    }

    @Test
    public void processCreationForm() throws Exception {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        when(owners.findById(Mockito.<Integer>any()))
            .thenReturn(owner);
        when(pets.findPetTypes())
            .thenReturn(new ArrayList<PetType>());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/new", Integer.toString(1))
                .param("birthDate", LocalDate.of(2_000, 1, 1).toString())
                .param("type.name", "dog")
                .param("type.id", Integer.valueOf(1).toString())
                .param("name", "/bin/bash")
                .param("id", Integer.valueOf(1).toString()))
            .andExpect(status().is(302))
            .andExpect(redirectedUrl("/owners/1"))
            .andExpect(view().name("redirect:/owners/{ownerId}"));
    }

    @Test
    public void processUpdateForm1() throws Exception {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        when(owners.findById(Mockito.<Integer>any()))
            .thenReturn(owner);
        when(pets.findPetTypes())
            .thenReturn(new ArrayList<PetType>());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/edit", Integer.toString(1), "Bella")
                .param("birthDate", LocalDate.of(2_000, 1, 1).toString())
                .param("type.name", "dog")
                .param("type.id", Integer.valueOf(1).toString())
                .param("name", "/bin/bash")
                .param("id", Integer.valueOf(1).toString()))
            .andExpect(status().is(302))
            .andExpect(redirectedUrl("/owners/1"))
            .andExpect(view().name("redirect:/owners/{ownerId}"));
    }

    @Test
    public void processUpdateForm2() throws Exception {
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/edit", Integer.toString(0), "")
                .param("birthDate", LocalDate.of(2_000, 1, 1).toString())
                .param("type.name", "dog")
                .param("type.id", Integer.valueOf(1).toString())
                .param("name", "/bin/bash")
                .param("id", Integer.valueOf(1).toString()))
            .andExpect(status().is(404));
    }
}
