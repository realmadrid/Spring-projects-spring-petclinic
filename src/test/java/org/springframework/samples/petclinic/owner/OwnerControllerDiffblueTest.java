package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
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
  @Autowired
  private MockMvc mockMvc;
  @Test
  public void initCreationFormTest() throws Exception {
    // Arrange
    String property = System.getProperty("file.separator");

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(
        MockMvcRequestBuilders.get(String.join("", property, "owners", System.getProperty("file.separator"), "new")));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
  @Test
  public void initFindFormTest() throws Exception {
    // Arrange
    String property = System.getProperty("file.separator");

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(
        MockMvcRequestBuilders.get(String.join("", property, "owners", System.getProperty("file.separator"), "find")));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
  @Test
  public void initUpdateOwnerFormTest() throws Exception {
    // Arrange
    String property = System.getProperty("file.separator");
    String property1 = System.getProperty("file.separator");

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(MockMvcRequestBuilders.get(
        String.join("", property, "owners", property1, "{ownerId}", System.getProperty("file.separator"), "edit"), 1));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
  @Test
  public void processCreationFormTest() throws Exception {
    // Arrange
    String property = System.getProperty("file.separator");

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(
        MockMvcRequestBuilders.post(String.join("", property, "owners", System.getProperty("file.separator"), "new"))
            .param("address", "a value for address").param("city", "a value for city")
            .param("telephone", "a value for telephone").param("firstName", "a value for firstName")
            .param("lastName", "a value for lastName"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
  @Test
  public void processFindFormTest() throws Exception {
    // Arrange and Act
    ResultActions actualPerformResult = this.mockMvc.perform(MockMvcRequestBuilders
        .get(String.join("", System.getProperty("file.separator"), "owners")).param("address", "a value for address")
        .param("city", "a value for city").param("telephone", "a value for telephone")
        .param("firstName", "a value for firstName").param("lastName", "a value for lastName"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
  @Test
  public void processUpdateOwnerFormTest() throws Exception {
    // Arrange
    String property = System.getProperty("file.separator");
    String property1 = System.getProperty("file.separator");

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(MockMvcRequestBuilders
        .post(String.join("", property, "owners", property1, "{ownerId}", System.getProperty("file.separator"), "edit"),
            1)
        .param("address", "a value for address").param("city", "a value for city")
        .param("telephone", "a value for telephone").param("firstName", "a value for firstName")
        .param("lastName", "a value for lastName"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
  @Test
  public void setAllowedFieldsTest() {
    // Arrange
    WebDataBinder webDataBinder = new WebDataBinder("!");

    // Act
    this.ownerController.setAllowedFields(webDataBinder);

    // Assert
    assertEquals(1, webDataBinder.getDisallowedFields().length);
  }
  @Test
  public void showOwnerTest() throws Exception {
    // Arrange
    String property = System.getProperty("file.separator");

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(MockMvcRequestBuilders
        .get(String.join("", property, "owners", System.getProperty("file.separator"), "{ownerId}"), 1));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
}

