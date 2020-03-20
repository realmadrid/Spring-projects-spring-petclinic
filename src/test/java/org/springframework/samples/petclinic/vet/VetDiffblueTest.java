package org.springframework.samples.petclinic.vet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.Set;
import org.junit.Test;

public class VetDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    Vet actualVet = new Vet();

    // Assert
    Set<Specialty> specialtiesInternal = actualVet.getSpecialtiesInternal();
    assertTrue(specialtiesInternal instanceof java.util.HashSet);
    assertEquals(0, actualVet.getNrOfSpecialties());
    assertEquals(0, specialtiesInternal.size());
    assertNull(actualVet.getFirstName());
    assertNull(actualVet.getId());
    assertTrue(actualVet.isNew());
    assertNull(actualVet.getLastName());
  }

  @Test
  public void getNrOfSpecialtiesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Vet()).getNrOfSpecialties());
  }

  @Test
  public void getSpecialtiesInternalTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Vet()).getSpecialtiesInternal().size());
  }

  @Test
  public void getSpecialtiesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Vet()).getSpecialties().size());
  }
}

