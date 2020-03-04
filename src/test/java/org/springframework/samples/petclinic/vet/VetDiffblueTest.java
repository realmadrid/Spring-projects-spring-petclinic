package org.springframework.samples.petclinic.vet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class VetDiffblueTest {
  @Test
  public void getNrOfSpecialtiesTest() {
    // Arrange
    Vet vet = new Vet();

    // Act and Assert
    assertEquals(0, vet.getNrOfSpecialties());
    assertEquals(0, vet.getNrOfSpecialties());
  }

  @Test
  public void setSpecialtiesInternalTest() {
    // Arrange
    Vet vet = new Vet();
    HashSet<Specialty> specialtySet = new HashSet<Specialty>();
    specialtySet.add(new Specialty());

    // Act
    vet.setSpecialtiesInternal(specialtySet);

    // Assert
    assertEquals(1, vet.getNrOfSpecialties());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Vet actualVet = new Vet();

    // Assert
    Set<Specialty> specialtiesInternal = actualVet.getSpecialtiesInternal();
    String actualLastName = actualVet.getLastName();
    boolean actualIsNewResult = actualVet.isNew();
    Integer actualId = actualVet.getId();
    String actualFirstName = actualVet.getFirstName();
    assertTrue(specialtiesInternal instanceof java.util.HashSet);
    assertEquals(0, actualVet.getNrOfSpecialties());
    assertEquals(0, specialtiesInternal.size());
    assertNull(actualFirstName);
    assertNull(actualId);
    assertTrue(actualIsNewResult);
    assertNull(actualLastName);
  }

  @Test
  public void addSpecialtyTest() {
    // Arrange
    Vet vet = new Vet();

    // Act
    vet.addSpecialty(new Specialty());

    // Assert
    assertEquals(1, vet.getNrOfSpecialties());
  }

  @Test
  public void getSpecialtiesTest() {
    // Arrange
    Vet vet = new Vet();

    // Act and Assert
    assertEquals(0, vet.getSpecialties().size());
    assertEquals(0, vet.getNrOfSpecialties());
  }

  @Test
  public void getSpecialtiesInternalTest() {
    // Arrange
    Vet vet = new Vet();

    // Act and Assert
    assertEquals(0, vet.getSpecialtiesInternal().size());
    assertEquals(0, vet.getNrOfSpecialties());
  }
}

