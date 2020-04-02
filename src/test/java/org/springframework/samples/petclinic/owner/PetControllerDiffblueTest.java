package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.WebDataBinder;

@WebMvcTest(value = {org.springframework.samples.petclinic.owner.PetController.class})
@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
public class PetControllerDiffblueTest {
  @Autowired
  private PetController petController;
  @MockBean
  private OwnerRepository ownerRepository;
  @MockBean
  private PetRepository petRepository;
  @Autowired
  private MockMvc mockMvc;
  @Test
  public void testInitCreationForm() throws Exception {
    // Arrange
    Pet pet = new Pet();
    pet.setBirthDate(null);
    pet.setName("a value for name");
    org.mockito.Mockito.<Pet>when(this.petRepository.findById(123456789)).thenReturn(pet);
    org.mockito.Mockito.<List<PetType>>when(this.petRepository.findPetTypes())
        .thenReturn(Collections.<PetType>emptyList());
    org.mockito.Mockito.<Collection<Owner>>when(this.ownerRepository.findByLastName("value"))
        .thenReturn(Collections.<Owner>emptyList());
    Owner owner = new Owner();
    owner.setAddress("a value for address");
    owner.setCity("a value for city");
    owner.setTelephone("a value for telephone");
    owner.setFirstName("a value for firstName");
    owner.setLastName("a value for lastName");
    org.mockito.Mockito.<Owner>when(this.ownerRepository.findById(123456789)).thenReturn(owner);

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(
        MockMvcRequestBuilders.get("/owners/{ownerId}/pets/new", 123456789).param("address", "a value for address")
            .param("city", "a value for city").param("telephone", "a value for telephone")
            .param("firstName", "a value for firstName").param("lastName", "a value for lastName"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(3));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("types", "owner", "pet"));
  }
  @Test
  public void testPopulatePetTypes() {
    // Arrange, Act and Assert
    assertEquals(0, this.petController.populatePetTypes().size());
  }
  @Test
  public void testFindOwner() {
    // Arrange, Act and Assert
    assertNull(this.petController.findOwner(123));
  }
  @Test
  public void testInitOwnerBinder() {
    // Arrange
    WebDataBinder webDataBinder = new WebDataBinder("!");

    // Act
    this.petController.initOwnerBinder(webDataBinder);

    // Assert
    assertEquals(1, webDataBinder.getDisallowedFields().length);
  }
  @Test
  public void testInitUpdateForm() throws Exception {
    // Arrange
    Pet pet = new Pet();
    pet.setBirthDate(null);
    pet.setName("a value for name");
    org.mockito.Mockito.<Pet>when(this.petRepository.findById(123456789)).thenReturn(pet);
    org.mockito.Mockito.<List<PetType>>when(this.petRepository.findPetTypes())
        .thenReturn(Collections.<PetType>emptyList());
    org.mockito.Mockito.<Collection<Owner>>when(this.ownerRepository.findByLastName("value"))
        .thenReturn(Collections.<Owner>emptyList());
    Owner owner = new Owner();
    owner.setAddress("a value for address");
    owner.setCity("a value for city");
    owner.setTelephone("a value for telephone");
    owner.setFirstName("a value for firstName");
    owner.setLastName("a value for lastName");
    org.mockito.Mockito.<Owner>when(this.ownerRepository.findById(123456789)).thenReturn(owner);

    // Act
    ResultActions actualPerformResult = this.mockMvc
        .perform(MockMvcRequestBuilders.get("/owners/{ownerId}/pets/{petId}/edit", 123456789, 123456789));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(3));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("types", "owner", "pet"));
  }
  @Test
  public void testProcessCreationForm() throws Exception {
    // Arrange
    Pet pet = new Pet();
    pet.setBirthDate(null);
    pet.setName("a value for name");
    org.mockito.Mockito.<Pet>when(this.petRepository.findById(123456789)).thenReturn(pet);
    org.mockito.Mockito.<List<PetType>>when(this.petRepository.findPetTypes())
        .thenReturn(Collections.<PetType>emptyList());
    org.mockito.Mockito.<Collection<Owner>>when(this.ownerRepository.findByLastName("value"))
        .thenReturn(Collections.<Owner>emptyList());
    Owner owner = new Owner();
    owner.setAddress("a value for address");
    owner.setCity("a value for city");
    owner.setTelephone("a value for telephone");
    owner.setFirstName("a value for firstName");
    owner.setLastName("a value for lastName");
    org.mockito.Mockito.<Owner>when(this.ownerRepository.findById(123456789)).thenReturn(owner);

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(
        MockMvcRequestBuilders.post("/owners/{ownerId}/pets/new", 123456789).param("address", "a value for address")
            .param("city", "a value for city").param("telephone", "a value for telephone")
            .param("firstName", "a value for firstName").param("lastName", "a value for lastName")
            .param("birthDate", "2000-01-01").param("name", "a value for name"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(3));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("types", "owner", "pet"));
  }
  @Test
  public void testProcessUpdateForm() throws Exception {
    // Arrange
    Pet pet = new Pet();
    pet.setBirthDate(null);
    pet.setName("a value for name");
    org.mockito.Mockito.<Pet>when(this.petRepository.findById(123456789)).thenReturn(pet);
    org.mockito.Mockito.<List<PetType>>when(this.petRepository.findPetTypes())
        .thenReturn(Collections.<PetType>emptyList());
    org.mockito.Mockito.<Collection<Owner>>when(this.ownerRepository.findByLastName("value"))
        .thenReturn(Collections.<Owner>emptyList());
    Owner owner = new Owner();
    owner.setAddress("a value for address");
    owner.setCity("a value for city");
    owner.setTelephone("a value for telephone");
    owner.setFirstName("a value for firstName");
    owner.setLastName("a value for lastName");
    org.mockito.Mockito.<Owner>when(this.ownerRepository.findById(123456789)).thenReturn(owner);

    // Act
    ResultActions actualPerformResult = this.mockMvc
        .perform(MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/edit", 123456789, 123456789)
            .param("birthDate", "2000-01-01").param("name", "a value for name").param("address", "a value for address")
            .param("city", "a value for city").param("telephone", "a value for telephone")
            .param("firstName", "a value for firstName").param("lastName", "a value for lastName"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(3));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("types", "pet", "owner"));
  }
}

