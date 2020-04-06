package org.springframework.samples.petclinic.system;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(value = {org.springframework.samples.petclinic.system.WelcomeController.class})
@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
public class WelcomeControllerDiffblueTest {
  @Autowired
  private MockMvc mockMvc;
  @Test
  public void testWelcome() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(requestBuilder);

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(0));
  }
  @Test
  public void testWelcome2() {
    // Arrange, Act and Assert
    assertEquals("welcome", (new WelcomeController()).welcome());
  }
}

