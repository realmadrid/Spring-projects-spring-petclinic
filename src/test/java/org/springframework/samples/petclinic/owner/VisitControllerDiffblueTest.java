package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import java.io.File;
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
public class VisitControllerDiffblueTest {
  @Autowired
  private MockMvc mockMvc;
  @Autowired
  private VisitController visitController;
  @Test
  public void initNewVisitFormTest() throws Exception {
    // Arrange and Act
    ResultActions actualPerformResult = this.mockMvc
        .perform(MockMvcRequestBuilders.get(String.join("", File.separator, "owners", File.separator, "*",
            File.separator, "pets", File.separator, "{petId}", File.separator, "visits", File.separator, "new"), 1));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(2));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("pet", "visit"));
  }
  @Test
  public void setAllowedFieldsTest() {
    // Arrange
    WebDataBinder webDataBinder = new WebDataBinder("!");

    // Act
    this.visitController.setAllowedFields(webDataBinder);

    // Assert
    assertEquals(1, webDataBinder.getDisallowedFields().length);
  }
}

