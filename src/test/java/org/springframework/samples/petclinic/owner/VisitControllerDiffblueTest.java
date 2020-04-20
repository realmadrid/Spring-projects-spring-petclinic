package org.springframework.samples.petclinic.owner;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.time.LocalDate;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.samples.petclinic.visit.VisitRepository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Unit tests for org.springframework.samples.petclinic.owner.VisitController
 *
 * @author Diffblue Cover
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = VisitController.class)
public class VisitControllerDiffblueTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @MockBean(name = "pets")
    private PetRepository pets;

    @MockBean(name = "visits")
    private VisitRepository visits;

    @Autowired
    private VisitController controller;

    @Test
    public void initNewVisitForm1() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners/*/pets/{petId}/visits/new", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void initNewVisitForm2() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners/*/pets/{petId}/visits/new", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void initNewVisitForm3() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners/*/pets/{petId}/visits/new", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void initNewVisitForm4() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners/*/pets/{petId}/visits/new", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void initNewVisitFormThrowsNestedServletException1() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners/*/pets/{petId}/visits/new", Integer.toString(1)));
    }

    @Test
    public void initNewVisitFormThrowsNestedServletException2() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners/*/pets/{petId}/visits/new", Integer.toString(-1)));
    }

    @Test
    public void initNewVisitFormThrowsNestedServletException3() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners/*/pets/{petId}/visits/new", Integer.toString(0)));
    }

    @Test
    public void initNewVisitFormThrowsNestedServletException4() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners/*/pets/{petId}/visits/new", Integer.toString(2)));
    }

    @Test
    public void processNewVisitForm1() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm10() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm100() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm101() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm102() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm103() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm104() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm105() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm106() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm107() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm108() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm109() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm11() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm110() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm111() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm112() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm113() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm114() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm115() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm116() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm117() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm118() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm119() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm12() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm120() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm121() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm122() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm123() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm124() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm125() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm126() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm127() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm128() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm129() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm13() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm130() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm131() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm132() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm133() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm134() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm135() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm136() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm137() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm138() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm139() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm14() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm140() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm141() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm142() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm143() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm144() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm145() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm146() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm147() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm148() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm149() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm15() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm150() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm151() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm152() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm153() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm154() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm155() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm156() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm157() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm158() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm159() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm16() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm160() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm161() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm162() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm163() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm164() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm165() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm166() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm167() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm168() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm169() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm17() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm170() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm171() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm172() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm173() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm174() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm175() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm176() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm177() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm178() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm179() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm18() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm180() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm181() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm182() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm183() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm184() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm185() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm186() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm187() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm188() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm189() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm19() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm190() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm191() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm192() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm193() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm194() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm195() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm196() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm197() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm198() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm199() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm2() throws org.springframework.dao.DataAccessException, Exception {
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().is(404));
    }

    @Test
    public void processNewVisitForm20() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm200() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm201() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm202() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm203() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm204() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm205() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm206() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm207() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm208() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm209() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm21() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().is(404));
    }

    @Test
    public void processNewVisitForm210() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm211() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm212() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm213() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm214() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm215() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm216() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm217() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm218() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm219() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm22() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm220() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm221() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm222() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm223() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm224() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm225() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm226() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm227() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm228() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm229() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm23() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm230() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm231() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm232() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm233() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm234() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm235() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm236() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm237() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm238() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm239() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm24() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm240() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm241() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm242() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm243() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm244() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm245() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm246() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm247() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm248() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm249() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm25() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm250() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm251() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm252() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm253() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm254() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm255() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm256() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm257() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm258() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm259() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm26() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().is(404));
    }

    @Test
    public void processNewVisitForm260() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm261() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm262() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm263() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm264() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm265() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm266() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm267() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm268() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm269() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm27() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm270() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm271() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm272() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm273() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm274() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm275() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm276() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm277() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm278() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm279() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm28() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm280() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm281() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm282() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm283() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm284() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm285() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm286() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm287() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm288() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm289() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm29() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm290() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm291() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm292() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm293() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm294() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm295() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm296() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm297() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm298() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm299() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm3() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm30() throws org.springframework.dao.DataAccessException, Exception {
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(-1)))
            .andExpect(status().is(404));
    }

    @Test
    public void processNewVisitForm300() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm301() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm302() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm303() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm304() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm305() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm306() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm307() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm308() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm309() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm31() throws org.springframework.dao.DataAccessException, Exception {
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(0)))
            .andExpect(status().is(404));
    }

    @Test
    public void processNewVisitForm310() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm311() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm312() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm313() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm314() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm315() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm316() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm317() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm318() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm319() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm32() throws org.springframework.dao.DataAccessException, Exception {
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(2)))
            .andExpect(status().is(404));
    }

    @Test
    public void processNewVisitForm320() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm321() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm322() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm323() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm324() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm325() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm326() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm327() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm328() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm329() throws org.springframework.dao.DataAccessException, Exception {
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
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm33() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm330() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm331() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm332() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm333() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm334() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm335() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm336() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm337() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm338() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm339() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm34() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm340() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm341() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm342() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm343() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm344() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm345() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm346() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm347() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm348() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm349() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm35() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm350() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm351() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm352() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm353() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm354() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm355() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm356() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm357() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm358() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm359() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm36() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm360() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm361() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm362() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm363() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm364() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm365() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm366() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm367() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm368() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm369() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm37() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm370() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm371() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm372() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm373() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm374() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm375() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm376() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm377() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm378() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm379() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm38() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm380() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm381() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm382() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm383() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm384() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm385() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm386() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm387() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm388() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm389() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm39() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm390() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm391() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm392() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm393() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm394() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm395() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm396() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm397() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm398() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm399() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm4() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm40() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm400() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm401() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm402() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm403() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm404() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm405() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm406() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm407() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm408() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm409() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm41() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm410() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm411() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm412() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm413() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm414() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm415() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm416() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm417() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm418() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm419() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm42() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm420() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm421() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm422() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm423() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm424() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm425() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm426() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm427() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm428() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm429() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm43() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm430() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm431() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm432() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm433() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm434() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm435() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm436() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm437() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm438() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm439() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm44() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm440() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm441() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm442() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm443() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm444() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm445() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm446() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm447() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm448() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm449() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm45() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().is(404));
    }

    @Test
    public void processNewVisitForm450() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm451() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm452() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm453() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm454() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm455() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm456() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm457() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm458() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm459() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm46() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm460() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm461() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm462() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm463() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm464() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm465() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm466() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm467() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm468() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm469() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm47() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm470() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm471() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm472() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm473() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm474() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm475() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm476() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm477() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm478() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm479() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm48() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm480() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm481() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm482() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm483() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm484() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm485() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm486() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm487() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm488() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm489() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm49() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm490() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm491() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm492() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm493() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm494() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm495() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm496() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm497() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm498() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm499() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm5() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm50() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().is(404));
    }

    @Test
    public void processNewVisitForm500() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm501() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm502() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm503() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm504() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm505() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm506() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm507() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm508() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm509() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm51() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm510() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm511() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm512() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm513() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm514() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm515() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm516() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm517() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm518() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm519() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm52() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm520() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm521() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm522() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm523() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm524() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm525() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm526() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm527() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm528() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm529() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm53() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm530() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm531() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm532() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm533() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm534() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm535() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm536() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm537() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm538() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm539() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm54() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm540() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm541() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm542() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm543() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm544() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm545() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm546() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm547() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm548() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm549() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm55() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm550() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm551() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm552() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm553() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm554() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm555() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm556() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm557() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm558() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm559() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm56() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm560() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm561() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm562() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm563() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm564() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm565() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm566() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm567() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm568() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm569() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm57() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm570() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm571() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm572() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm573() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm574() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm575() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm576() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm577() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm578() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm579() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm58() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm580() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm581() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm582() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm583() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm584() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm585() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm586() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm587() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm588() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm589() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm59() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm590() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm591() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm592() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm593() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm594() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm595() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm596() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm597() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm598() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm599() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm6() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm60() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm600() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm601() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm602() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm603() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm604() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm605() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm606() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm607() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm608() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm609() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm61() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm610() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm611() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm612() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm613() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm614() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm615() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm616() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm617() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm618() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm619() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm62() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm620() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm621() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm622() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm623() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm624() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm625() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm626() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm627() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm628() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm629() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm63() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm630() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm631() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm632() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm633() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm634() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm635() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm636() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm637() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm638() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm639() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm64() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm640() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm641() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm642() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm643() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm644() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm645() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm646() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm647() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm648() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm649() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm65() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm650() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm651() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm652() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm653() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm654() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm655() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm656() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm657() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm658() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm659() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm66() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().is(404));
    }

    @Test
    public void processNewVisitForm660() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm661() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm662() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm663() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm664() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm665() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm666() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm667() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm668() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm669() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm67() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm670() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm671() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm672() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm673() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm674() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm675() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm676() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm677() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm678() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm679() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm68() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm680() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm681() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm682() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm683() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm684() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm685() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm686() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm687() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm688() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm689() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm69() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm690() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm691() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm692() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm693() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm694() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm695() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm696() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm697() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm698() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm699() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm7() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pet");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm70() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm700() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm701() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm702() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm703() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm704() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm705() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm706() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm707() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm708() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm709() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm71() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().is(404));
    }

    @Test
    public void processNewVisitForm710() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm711() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm712() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm713() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm714() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm715() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm716() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm717() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm718() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm719() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm72() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm720() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm721() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm722() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm723() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm724() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm725() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm726() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm727() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm728() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm729() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm73() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm730() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm731() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm732() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm733() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm734() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm735() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm736() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm737() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm738() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm739() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm74() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm740() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm741() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm742() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm743() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm744() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm745() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm746() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm747() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm748() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm749() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm75() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm750() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm751() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm752() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm753() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm754() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm755() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm756() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm757() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm758() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm759() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm76() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm760() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm761() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm762() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm763() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm764() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm765() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm766() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm767() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm768() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm769() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm77() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm770() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm771() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm772() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm773() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm774() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm775() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm776() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm777() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm778() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm779() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm78() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm780() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm781() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm782() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm783() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm784() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm785() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm786() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm787() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm788() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm789() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm79() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm790() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm791() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm792() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm793() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm794() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm795() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm796() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm797() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm798() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm799() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm8() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("pets/createOrUpdateVisitForm");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm80() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm800() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm801() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm802() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm803() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm804() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm805() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm806() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm807() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm808() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm809() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm81() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("id");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm810() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm811() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm812() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm813() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm814() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm815() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm82() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pet");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm83() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("pets/createOrUpdateVisitForm");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm84() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm85() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm86() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(2);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm87() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm88() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm89() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm9() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm90() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm91() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pet", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm92() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "pets/createOrUpdateVisitForm", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm93() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm94() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm95() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm96() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm97() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm98() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(2);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm99() throws org.springframework.dao.DataAccessException, Exception {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("id");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(pet);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitFormThrowsNestedServletException1() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)));
    }

    @Test
    public void processNewVisitFormThrowsNestedServletException10() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(2)));
    }

    @Test
    public void processNewVisitFormThrowsNestedServletException11() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(-1)));
    }

    @Test
    public void processNewVisitFormThrowsNestedServletException12() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(0)));
    }

    @Test
    public void processNewVisitFormThrowsNestedServletException13() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(2)));
    }

    @Test
    public void processNewVisitFormThrowsNestedServletException14() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(-1)));
    }

    @Test
    public void processNewVisitFormThrowsNestedServletException15() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(0)));
    }

    @Test
    public void processNewVisitFormThrowsNestedServletException16() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(2)));
    }

    @Test
    public void processNewVisitFormThrowsNestedServletException2() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(1)));
    }

    @Test
    public void processNewVisitFormThrowsNestedServletException3() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "foo", Integer.toString(1)));
    }

    @Test
    public void processNewVisitFormThrowsNestedServletException4() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "id", Integer.toString(1)));
    }

    @Test
    public void processNewVisitFormThrowsNestedServletException5() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(-1)));
    }

    @Test
    public void processNewVisitFormThrowsNestedServletException6() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(0)));
    }

    @Test
    public void processNewVisitFormThrowsNestedServletException7() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(2)));
    }

    @Test
    public void processNewVisitFormThrowsNestedServletException8() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(-1)));
    }

    @Test
    public void processNewVisitFormThrowsNestedServletException9() throws org.springframework.dao.DataAccessException, Exception {
        // Handler dispatch failed; nested exception is com.diffblue.jcover.MissingMockException
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "bar", Integer.toString(0)));
    }
}
