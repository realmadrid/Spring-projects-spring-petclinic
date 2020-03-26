package org.springframework.samples.petclinic.vet;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
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

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class VetControllerDiffblueTest {
  @Autowired
  private MockMvc mockMvc;
  @Test
  public void testShowResourcesVetList() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/vets");

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(requestBuilder);

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions
        .andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"));
    Matcher<String> matcher = Matchers.containsString("{\"vetList\":[{\"id\":1,\"firstName\":\"James\",\"lastName\""
        + ":\"Carter\",\"specialties\":[],\"nrOfSpecialties\":0,\"new"
        + "\":false},{\"id\":2,\"firstName\":\"Helen\",\"lastName\":"
        + "\"Leary\",\"specialties\":[{\"id\":1,\"name\":\"radiology\","
        + "\"new\":false}],\"nrOfSpecialties\":1,\"new\":false},{\"id"
        + "\":3,\"firstName\":\"Linda\",\"lastName\":\"Douglas\","
        + "\"specialties\":[{\"id\":3,\"name\":\"dentistry\",\"new\":false"
        + "},{\"id\":2,\"name\":\"surgery\",\"new\":false}],\"nrOfSpecialties"
        + "\":2,\"new\":false},{\"id\":4,\"firstName\":\"Rafael\","
        + "\"lastName\":\"Ortega\",\"specialties\":[{\"id\":2,\"name\":"
        + "\"surgery\",\"new\":false}],\"nrOfSpecialties\":1,\"new\""
        + ":false},{\"id\":5,\"firstName\":\"Henry\",\"lastName\":"
        + "\"Stevens\",\"specialties\":[{\"id\":1,\"name\":\"radiology"
        + "\",\"new\":false}],\"nrOfSpecialties\":1,\"new\":false},{"
        + "\"id\":6,\"firstName\":\"Sharon\",\"lastName\":\"Jenkins\","
        + "\"specialties\":[],\"nrOfSpecialties\":0,\"new\":false}]" + "}");
    resultActions1.andExpect(MockMvcResultMatchers.content().string(matcher));
  }
  @Test
  public void testShowVetList() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/vets.html");

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(requestBuilder);

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("vets"));
  }
}

