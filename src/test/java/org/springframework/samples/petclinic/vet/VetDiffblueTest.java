package org.springframework.samples.petclinic.vet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
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
    assertNull(actualVet.getFirstName());
    assertEquals(0, specialtiesInternal.size());
    assertNull(actualVet.getId());
    assertTrue(actualVet.isNew());
    assertNull(actualVet.getLastName());
  }

  @Test
  public void getSpecialtiesInternalTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Vet()).getSpecialtiesInternal().size());
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
    assertSame(specialtySet, vet.getSpecialtiesInternal());
  }
}

