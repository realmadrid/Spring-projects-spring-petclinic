package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.WebDataBinder;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class PetControllerDiffblueTest {
  @Autowired
  private PetController petController;
  @Autowired
  private MockMvc mockMvc;
  @Test
  public void testInitCreationForm() throws Exception {
    // Arrange and Act
    this.mockMvc
        .perform(MockMvcRequestBuilders.get("/owners/{ownerId}/pets/new", 1).param("address", "a value for address")
            .param("city", "a value for city").param("telephone", "a value for telephone")
            .param("firstName", "a value for firstName").param("lastName", "a value for lastName"));
  }
  @Test
  public void testPopulatePetTypes() {
    // Arrange and Act
    Collection<PetType> actualPopulatePetTypesResult = this.petController.populatePetTypes();

    // Assert
    assertEquals(6, actualPopulatePetTypesResult.size());
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
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/owners/{ownerId}/pets/{petId}/edit", 1,
        1);

    // Act
    this.mockMvc.perform(requestBuilder);
  }
  @Test
  public void testProcessCreationForm() throws Exception {
    // Arrange and Act
    this.mockMvc.perform(MockMvcRequestBuilders.post("/owners/{ownerId}/pets/new", 1)
        .param("address", "a value for address").param("city", "a value for city")
        .param("telephone", "a value for telephone").param("firstName", "a value for firstName")
        .param("lastName", "a value for lastName").param("birthDate", "2000-01-01").param("name", "a value for name"));
  }
  @Test
  public void testProcessUpdateForm() throws Exception {
    // Arrange and Act
    this.mockMvc.perform(MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/edit", 1, 1)
        .param("birthDate", "2000-01-01").param("name", "a value for name").param("address", "a value for address")
        .param("city", "a value for city").param("telephone", "a value for telephone")
        .param("firstName", "a value for firstName").param("lastName", "a value for lastName"));
  }
}

