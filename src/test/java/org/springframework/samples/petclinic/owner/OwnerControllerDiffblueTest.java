package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
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
public class OwnerControllerDiffblueTest {
  @Autowired
  private OwnerController ownerController;
  @Autowired
  private MockMvc mockMvc;
  @Test
  public void initCreationFormTest() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/owners/new");

    // Act
    this.mockMvc.perform(requestBuilder);
  }
  @Test
  public void initFindFormTest() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/owners/find");

    // Act
    this.mockMvc.perform(requestBuilder);
  }
  @Test
  public void initUpdateOwnerFormTest() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/owners/{ownerId}/edit", 1);

    // Act
    this.mockMvc.perform(requestBuilder);
  }
  @Test
  public void processCreationFormTest() throws Exception {
    // Arrange and Act
    this.mockMvc.perform(MockMvcRequestBuilders.post("/owners/new").param("address", "a value for address")
        .param("city", "a value for city").param("telephone", "a value for telephone")
        .param("firstName", "a value for firstName").param("lastName", "a value for lastName"));
  }
  @Test
  public void processFindFormTest() throws Exception {
    // Arrange and Act
    this.mockMvc.perform(MockMvcRequestBuilders.get("/owners").param("address", "a value for address")
        .param("city", "a value for city").param("telephone", "a value for telephone")
        .param("firstName", "a value for firstName").param("lastName", "a value for lastName"));
  }
  @Test
  public void processUpdateOwnerFormTest() throws Exception {
    // Arrange and Act
    this.mockMvc
        .perform(MockMvcRequestBuilders.post("/owners/{ownerId}/edit", 1).param("address", "a value for address")
            .param("city", "a value for city").param("telephone", "a value for telephone")
            .param("firstName", "a value for firstName").param("lastName", "a value for lastName"));
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
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/owners/{ownerId}", 1);

    // Act
    this.mockMvc.perform(requestBuilder);
  }
}

