package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.WebDataBinder;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class PetControllerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Autowired
  private PetController petController;
  @Autowired
  private MockMvc mockMvc;
  @Test
  public void findOwnerTest() {
    // Arrange, Act and Assert
    assertNull(this.petController.findOwner(123));
  }
  @Test
  public void initCreationFormTest() throws Exception {
    // Arrange and Act
    ResultActions actualPerformResult = this.mockMvc
        .perform(MockMvcRequestBuilders.get("/owners/{ownerId}/pets/new", 1).param("address", "a value for address")
            .param("city", "a value for city").param("telephone", "a value for telephone")
            .param("firstName", "a value for firstName").param("lastName", "a value for lastName"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(3));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("types", "owner", "pet"));
  }
  @Test
  public void initOwnerBinderTest() {
    // Arrange
    WebDataBinder webDataBinder = new WebDataBinder("!");

    // Act
    this.petController.initOwnerBinder(webDataBinder);

    // Assert
    assertEquals(1, webDataBinder.getDisallowedFields().length);
  }
  @Test
  public void initPetBinderTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    this.petController.initPetBinder(new WebDataBinder("!"));
  }
  @Test
  public void initUpdateFormTest() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/owners/{ownerId}/pets/{petId}/edit", 1,
        1);

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(requestBuilder);

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(3));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("types", "owner", "pet"));
  }
  @Test
  public void populatePetTypesTest() {
    // Arrange, Act and Assert
    assertEquals(6, this.petController.populatePetTypes().size());
  }
  @Test
  public void processCreationFormTest() throws Exception {
    // Arrange and Act
    ResultActions actualPerformResult = this.mockMvc.perform(MockMvcRequestBuilders
        .post("/owners/{ownerId}/pets/new", 1).param("address", "a value for address").param("city", "a value for city")
        .param("telephone", "a value for telephone").param("firstName", "a value for firstName")
        .param("lastName", "a value for lastName").param("birthDate", "2000-01-01").param("name", "a value for name"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(3));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("types", "owner", "pet"));
  }
  @Test
  public void processUpdateFormTest() throws Exception {
    // Arrange and Act
    ResultActions actualPerformResult = this.mockMvc
        .perform(MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/edit", 1, 1)
            .param("birthDate", "2000-01-01").param("name", "a value for name").param("address", "a value for address")
            .param("city", "a value for city").param("telephone", "a value for telephone")
            .param("firstName", "a value for firstName").param("lastName", "a value for lastName"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(3));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("types", "pet", "owner"));
  }
}

