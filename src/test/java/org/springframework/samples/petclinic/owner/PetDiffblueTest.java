package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
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
  public void setBirthDateTest() {
    // Arrange
    Pet pet = new Pet();

    // Act
    pet.setBirthDate(null);

    // Assert
    assertNull(pet.getBirthDate());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new Pet()).getType());
  }

  @Test
  public void setTypeTest() {
    // Arrange
    Pet pet = new Pet();
    PetType petType = new PetType();

    // Act
    pet.setType(petType);

    // Assert
    assertSame(petType, pet.getType());
  }

  @Test
  public void getOwnerTest() {
    // Arrange, Act and Assert
    assertNull((new Pet()).getOwner());
  }

  @Test
  public void setOwnerTest() {
    // Arrange
    Pet pet = new Pet();
    Owner owner = new Owner();

    // Act
    pet.setOwner(owner);

    // Assert
    assertSame(owner, pet.getOwner());
  }

  @Test
  public void getVisitsInternalTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Pet()).getVisitsInternal().size());
  }

  @Test
  public void setVisitsInternalTest() {
    // Arrange
    Pet pet = new Pet();
    HashSet<Visit> visitSet = new HashSet<Visit>();
    visitSet.add(new Visit());

    // Act
    pet.setVisitsInternal(visitSet);

    // Assert
    assertSame(visitSet, pet.getVisitsInternal());
  }

  @Test
  public void getVisitsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Pet()).getVisits().size());
  }

  @Test
  public void addVisitTest() {
    // Arrange
    Pet pet = new Pet();
    Visit visit = new Visit();

    // Act
    pet.addVisit(visit);

    // Assert
    assertNull(visit.getPetId());
  }
}

