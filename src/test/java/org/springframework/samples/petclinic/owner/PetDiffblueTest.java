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
  public void addVisitTest() {
    // Arrange
    Pet pet = new Pet();
    Visit visit = new Visit();

    // Act
    pet.addVisit(visit);

    // Assert
    assertNull(visit.getPetId());
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
  public void getVisitsInternalTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Pet()).getVisitsInternal().size());
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
  public void constructorTest() {
    // Arrange and Act
    Pet actualPet = new Pet();

    // Assert
    String actualName = actualPet.getName();
    String actualToStringResult = actualPet.toString();
    boolean actualIsNewResult = actualPet.isNew();
    Integer actualId = actualPet.getId();
    Owner actualOwner = actualPet.getOwner();
    PetType actualType = actualPet.getType();
    assertNull(actualName);
    Set<Visit> visitsInternal = actualPet.getVisitsInternal();
    assertTrue(visitsInternal instanceof java.util.LinkedHashSet);
    assertNull(actualPet.getBirthDate());
    assertEquals(0, visitsInternal.size());
    assertNull(actualType);
    assertNull(actualOwner);
    assertNull(actualId);
    assertTrue(actualIsNewResult);
    assertNull(actualToStringResult);
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
  public void getVisitsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Pet()).getVisits().size());
  }
}

