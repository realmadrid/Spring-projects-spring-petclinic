package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
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
    // Arrange
    String property = System.getProperty("file.separator");
    String property1 = System.getProperty("file.separator");
    String property2 = System.getProperty("file.separator");

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(MockMvcRequestBuilders
        .get(String.join("", property, "owners", property1, "{ownerId}", property2, "pets",
            System.getProperty("file.separator"), "new"), 1)
        .param("address", "a value for address").param("city", "a value for city")
        .param("telephone", "a value for telephone").param("firstName", "a value for firstName")
        .param("lastName", "a value for lastName"));

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
  public void initUpdateFormTest() throws Exception {
    // Arrange
    String property = System.getProperty("file.separator");
    String property1 = System.getProperty("file.separator");
    String property2 = System.getProperty("file.separator");
    String property3 = System.getProperty("file.separator");

    // Act
    ResultActions actualPerformResult = this.mockMvc
        .perform(MockMvcRequestBuilders.get(String.join("", property, "owners", property1, "{ownerId}", property2,
            "pets", property3, "{petId}", System.getProperty("file.separator"), "edit"), 1, 1));

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
    // Arrange
    String property = System.getProperty("file.separator");
    String property1 = System.getProperty("file.separator");
    String property2 = System.getProperty("file.separator");
    MockHttpServletRequestBuilder paramResult = MockMvcRequestBuilders
        .post(String.join("", property, "owners", property1, "{ownerId}", property2, "pets",
            System.getProperty("file.separator"), "new"), 1)
        .param("address", "a value for address").param("city", "a value for city")
        .param("telephone", "a value for telephone").param("firstName", "a value for firstName")
        .param("lastName", "a value for lastName");
    String property3 = System.getProperty("com.zaxxer.hikari.pool_number");

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(paramResult
        .param("birthDate",
            String.join("", "2000-0", property3, "-0", System.getProperty("com.zaxxer.hikari.pool_number")))
        .param("name", "a value for name"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(3));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("types", "owner", "pet"));
  }
  @Test
  public void processUpdateFormTest() throws Exception {
    // Arrange
    String property = System.getProperty("file.separator");
    String property1 = System.getProperty("file.separator");
    String property2 = System.getProperty("file.separator");
    String property3 = System.getProperty("file.separator");
    MockHttpServletRequestBuilder postResult = MockMvcRequestBuilders.post(String.join("", property, "owners",
        property1, "{ownerId}", property2, "pets", property3, "{petId}", System.getProperty("file.separator"), "edit"),
        1, 1);
    String property4 = System.getProperty("com.zaxxer.hikari.pool_number");

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(postResult
        .param("birthDate",
            String.join("", "2000-0", property4, "-0", System.getProperty("com.zaxxer.hikari.pool_number")))
        .param("name", "a value for name").param("address", "a value for address").param("city", "a value for city")
        .param("telephone", "a value for telephone").param("firstName", "a value for firstName")
        .param("lastName", "a value for lastName"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(3));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("types", "pet", "owner"));
  }
}

