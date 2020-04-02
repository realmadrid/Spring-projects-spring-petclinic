package org.springframework.samples.petclinic.vet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class VetDiffblueTest {
  @Test
  public void testConstructor() {
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
  public void testGetSpecialtiesInternal() {
    // Arrange
    Vet vet = new Vet();

    // Act and Assert
    assertEquals(0, vet.getSpecialtiesInternal().size());
    assertEquals(0, vet.getNrOfSpecialties());
  }

  @Test
  public void testSetSpecialtiesInternal() {
    // Arrange
    HashSet<Specialty> specialtySet = new HashSet<Specialty>();
    specialtySet.add(new Specialty());
    Vet vet = new Vet();

    // Act
    vet.setSpecialtiesInternal(specialtySet);

    // Assert
    assertEquals(1, vet.getNrOfSpecialties());
  }

  @Test
  public void testGetSpecialties() {
    // Arrange
    Vet vet = new Vet();

    // Act and Assert
    assertEquals(0, vet.getSpecialties().size());
    assertEquals(0, vet.getNrOfSpecialties());
  }

  @Test
  public void testGetNrOfSpecialties() {
    // Arrange
    Vet vet = new Vet();

    // Act and Assert
    assertEquals(0, vet.getNrOfSpecialties());
    assertEquals(0, vet.getNrOfSpecialties());
  }

  @Test
  public void testAddSpecialty() {
    // Arrange
    Vet vet = new Vet();

    // Act
    vet.addSpecialty(new Specialty());

    // Assert
    assertEquals(1, vet.getNrOfSpecialties());
  }
}

