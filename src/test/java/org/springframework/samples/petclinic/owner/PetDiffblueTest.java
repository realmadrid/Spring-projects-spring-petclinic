package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.Set;
import org.junit.Test;
import org.springframework.samples.petclinic.visit.Visit;

public class PetDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    Pet actualPet = new Pet();

    // Assert
    assertNull(actualPet.getName());
    Set<Visit> visitsInternal = actualPet.getVisitsInternal();
    assertTrue(visitsInternal instanceof java.util.LinkedHashSet);
    assertNull(actualPet.getBirthDate());
    assertEquals(0, visitsInternal.size());
    assertNull(actualPet.getType());
    assertNull(actualPet.getOwner());
    assertNull(actualPet.getId());
    assertTrue(actualPet.isNew());
    assertNull(actualPet.toString());
  }

  @Test
  public void getVisitsInternalTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Pet()).getVisitsInternal().size());
  }

  @Test
  public void getVisitsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Pet()).getVisits().size());
  }
}

