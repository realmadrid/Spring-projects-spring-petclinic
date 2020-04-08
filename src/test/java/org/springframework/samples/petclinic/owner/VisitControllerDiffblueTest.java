package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import java.util.Collections;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.samples.petclinic.visit.Visit;
import org.springframework.samples.petclinic.visit.VisitRepository;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.WebDataBinder;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@WebMvcTest(value = {org.springframework.samples.petclinic.owner.VisitController.class})
public class VisitControllerDiffblueTest {
  @MockBean
  private VisitRepository visitRepository;
  @MockBean
  private PetRepository petRepository;
  @Autowired
  private MockMvc mockMvc;
  @Autowired
  private VisitController visitController;
  @Test
  public void testInitNewVisitForm() throws Exception {
    // Arrange
    Pet pet = new Pet();
    pet.setBirthDate(null);
    pet.setName("a value for name");
    org.mockito.Mockito.<Pet>when(this.petRepository.findById(123456789)).thenReturn(pet);
    org.mockito.Mockito.<List<PetType>>when(this.petRepository.findPetTypes())
        .thenReturn(Collections.<PetType>emptyList());
    org.mockito.Mockito.<List<Visit>>when(this.visitRepository.findByPetId(123456789))
        .thenReturn(Collections.<Visit>emptyList());

    // Act
    ResultActions actualPerformResult = this.mockMvc
        .perform(MockMvcRequestBuilders.get("/owners/*/pets/{petId}/visits/new", 123456789));

    // Assert
    ResultActions resultActions = actualPerformResult.andExpect(MockMvcResultMatchers.status().isOk());
    ResultActions resultActions1 = resultActions.andExpect(MockMvcResultMatchers.model().<Object>size(2));
    resultActions1.andExpect(MockMvcResultMatchers.model().attributeExists("pet", "visit"));
  }
  @Test
  public void testSetAllowedFields() {
    // Arrange
    WebDataBinder webDataBinder = new WebDataBinder("!");

    // Act
    this.visitController.setAllowedFields(webDataBinder);

    // Assert
    assertEquals(1, webDataBinder.getDisallowedFields().length);
  }
}

