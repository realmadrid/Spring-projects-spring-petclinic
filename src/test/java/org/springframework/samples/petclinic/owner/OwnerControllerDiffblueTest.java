package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
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
public class OwnerControllerDiffblueTest {
  @Autowired
  private OwnerController ownerController;
  @Autowired
  private MockMvc mockMvc;
  @Test
  public void initFindFormTest() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/owners/find");

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(requestBuilder);

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
  @Test
  public void initCreationFormTest() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/owners/new");

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(requestBuilder);

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
  @Test
  public void showOwnerTest() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/owners/{ownerId}", 1);

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(requestBuilder);

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
  @Test
  public void processCreationFormTest() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/owners/new");

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(requestBuilder);

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
  @Test
  public void initUpdateOwnerFormTest() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/owners/{ownerId}/edit", 1);

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(requestBuilder);

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
  public void processUpdateOwnerFormTest() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/owners/{ownerId}/edit", 1);

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(requestBuilder);

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner"));
  }
  @Test
  public void processFindFormTest() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/owners");

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(requestBuilder);

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(2));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("owner", "selections"));
  }
}

