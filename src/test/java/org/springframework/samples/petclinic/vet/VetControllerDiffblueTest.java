package org.springframework.samples.petclinic.vet;

import java.util.Collection;
import java.util.Collections;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(value = {org.springframework.samples.petclinic.vet.VetController.class})
@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
public class VetControllerDiffblueTest {
  @MockBean
  private VetRepository vetRepository;
  @Autowired
  private MockMvc mockMvc;
  @Test
  public void testShowResourcesVetList() throws Exception {
    // Arrange
    org.mockito.Mockito.<Collection<Vet>>when(this.vetRepository.findAll()).thenReturn(Collections.<Vet>emptyList());

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(MockMvcRequestBuilders.get("/vets"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions
        .andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"));
    Matcher<String> matcher = Matchers.containsString("{\"vetList\":[]}");
    resultActions1.andExpect(MockMvcResultMatchers.content().string(matcher));
  }
  @Test
  public void testShowVetList() throws Exception {
    // Arrange
    org.mockito.Mockito.<Collection<Vet>>when(this.vetRepository.findAll()).thenReturn(Collections.<Vet>emptyList());

    // Act
    ResultActions actualPerformResult = this.mockMvc.perform(MockMvcRequestBuilders.get("/vets.html"));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(1));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("vets"));
  }
}

