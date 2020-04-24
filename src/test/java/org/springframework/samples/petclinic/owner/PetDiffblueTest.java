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
  public void testConstructor() {
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
  public void testSetBirthDate() {
    // Arrange
    Pet pet = new Pet();
    pet.setBirthDate(null);
    pet.setId(1);
    pet.setName("name");

    // Act
    pet.setBirthDate(null);

    // Assert
    assertNull(pet.getBirthDate());
  }

  @Test
  public void testSetType() {
    // Arrange
    Pet pet = new Pet();
    pet.setBirthDate(null);
    pet.setId(1);
    pet.setName("name");
    PetType petType = new PetType();
    petType.setId(1);
    petType.setName("name");

    // Act
    pet.setType(petType);

    // Assert
    assertSame(petType, pet.getType());
  }

  @Test
  public void testSetOwner() {
    // Arrange
    Pet pet = new Pet();
    pet.setBirthDate(null);
    pet.setId(1);
    pet.setName("name");
    Owner owner = new Owner();
    owner.setAddress("42 Station Road");
    owner.setCity("London");
    owner.setFirstName("Jane");

    // Act
    pet.setOwner(owner);

    // Assert
    assertSame(owner, pet.getOwner());
  }

  @Test
  public void testGetVisitsInternal() {
    // Arrange
    Pet pet = new Pet();
    pet.setBirthDate(null);
    pet.setId(1);
    pet.setName("name");

    // Act and Assert
    assertEquals(0, pet.getVisitsInternal().size());
  }

  @Test
  public void testSetVisitsInternal() {
    // Arrange
    Pet pet = new Pet();
    pet.setBirthDate(null);
    pet.setId(1);
    pet.setName("name");
    HashSet<Visit> visitSet = new HashSet<Visit>();
    Visit visit = new Visit();
    visit.setDate(null);
    visit.setDescription("name");
    visit.setId(1);
    visitSet.add(visit);

    // Act
    pet.setVisitsInternal(visitSet);

    // Assert
    assertSame(visitSet, pet.getVisitsInternal());
  }

  @Test
  public void testGetVisits() {
    // Arrange
    Pet pet = new Pet();
    pet.setBirthDate(null);
    pet.setId(1);
    pet.setName("name");

    // Act and Assert
    assertEquals(0, pet.getVisits().size());
  }

  @Test
  public void testAddVisit() {
    // Arrange
    Pet pet = new Pet();
    pet.setBirthDate(null);
    pet.setId(1);
    pet.setName("name");
    Visit visit = new Visit();
    visit.setDate(null);
    visit.setDescription("description");
    visit.setId(1);

    // Act
    pet.addVisit(visit);

    // Assert
    assertEquals(1, visit.getPetId().intValue());
  }
}

