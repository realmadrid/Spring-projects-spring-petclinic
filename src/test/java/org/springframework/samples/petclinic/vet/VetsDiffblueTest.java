package org.springframework.samples.petclinic.vet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class VetsDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    List<Vet> vetList = (new Vets()).getVetList();
    assertTrue(vetList instanceof java.util.ArrayList);
    assertEquals(0, vetList.size());
  }

  @Test
  public void getVetListTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Vets()).getVetList().size());
  }
}

