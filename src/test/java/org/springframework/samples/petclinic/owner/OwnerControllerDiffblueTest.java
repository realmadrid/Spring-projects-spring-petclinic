package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import java.util.Collection;
import java.util.Collections;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.WebDataBinder;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class OwnerControllerDiffblueTest {
  @Autowired
  private OwnerController ownerController;
  @MockBean
  private OwnerRepository ownerRepository;
  @Autowired
  private MockMvc mockMvc;
  @Test
  public void testInitCreationForm() throws Exception {
    // Arrange
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
    ResultActions actualPerformResult = this.mockMvc.perform(MockMvcRequestBuilders.get("/owners/new"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
  @Test
  public void testInitFindForm() throws Exception {
    // Arrange
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
    ResultActions actualPerformResult = this.mockMvc.perform(MockMvcRequestBuilders.get("/owners/find"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
  @Test
  public void testInitUpdateOwnerForm() throws Exception {
    // Arrange
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
        .perform(MockMvcRequestBuilders.get("/owners/{ownerId}/edit", 123456789));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
  @Test
  public void testProcessCreationForm() throws Exception {
    // Arrange
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
        .perform(MockMvcRequestBuilders.post("/owners/new").param("address", "a value for address")
            .param("city", "a value for city").param("telephone", "a value for telephone")
            .param("firstName", "a value for firstName").param("lastName", "a value for lastName"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
  @Test
  public void testProcessFindForm() throws Exception {
    // Arrange
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
        .perform(MockMvcRequestBuilders.get("/owners").param("address", "a value for address")
            .param("city", "a value for city").param("telephone", "a value for telephone")
            .param("firstName", "a value for firstName").param("lastName", "a value for lastName"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
  @Test
  public void testSetAllowedFields() {
    // Arrange
    WebDataBinder webDataBinder = new WebDataBinder("!");

    // Act
    this.ownerController.setAllowedFields(webDataBinder);

    // Assert
    assertEquals(1, webDataBinder.getDisallowedFields().length);
  }
  @Test
  public void testProcessUpdateOwnerForm() throws Exception {
    // Arrange
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
        MockMvcRequestBuilders.post("/owners/{ownerId}/edit", 123456789).param("address", "a value for address")
            .param("city", "a value for city").param("telephone", "a value for telephone")
            .param("firstName", "a value for firstName").param("lastName", "a value for lastName"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
  @Test
  public void testShowOwner() throws Exception {
    // Arrange
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
        .perform(MockMvcRequestBuilders.get("/owners/{ownerId}", 123456789));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
}

