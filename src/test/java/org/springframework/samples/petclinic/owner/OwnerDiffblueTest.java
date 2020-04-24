package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class OwnerDiffblueTest {
  @Test
  public void testSetAddress() {
    // Arrange
    Owner owner = new Owner();
    owner.setAddress("42 Station Road");
    owner.setCity("London");
    owner.setFirstName("Jane");

    // Act
    owner.setAddress("42 Station Road");

    // Assert
    assertEquals("42 Station Road", owner.getAddress());
  }

  @Test
  public void testSetCity() {
    // Arrange
    Owner owner = new Owner();
    owner.setAddress("42 Station Road");
    owner.setCity("London");
    owner.setFirstName("Jane");

    // Act
    owner.setCity("London");

    // Assert
    assertEquals("London", owner.getCity());
  }

  @Test
  public void testSetTelephone() {
    // Arrange
    Owner owner = new Owner();
    owner.setAddress("42 Station Road");
    owner.setCity("London");
    owner.setFirstName("Jane");

    // Act
    owner.setTelephone("01234556677");

    // Assert
    assertEquals("01234556677", owner.getTelephone());
  }

  @Test
  public void testGetPetsInternal() {
    // Arrange
    Owner owner = new Owner();
    owner.setAddress("42 Station Road");
    owner.setCity("London");
    owner.setFirstName("Jane");

    // Act and Assert
    assertEquals(0, owner.getPetsInternal().size());
  }

  @Test
  public void testSetPetsInternal() {
    // Arrange
    Owner owner = new Owner();
    owner.setAddress("42 Station Road");
    owner.setCity("London");
    owner.setFirstName("Jane");
    HashSet<Pet> petSet = new HashSet<Pet>();
    Pet pet = new Pet();
    pet.setBirthDate(null);
    pet.setId(1);
    pet.setName("Jane");
    petSet.add(pet);

    // Act
    owner.setPetsInternal(petSet);

    // Assert
    assertSame(petSet, owner.getPetsInternal());
  }

  @Test
  public void testGetPets() {
    // Arrange
    Owner owner = new Owner();
    owner.setAddress("42 Station Road");
    owner.setCity("London");
    owner.setFirstName("Jane");

    // Act and Assert
    assertEquals(0, owner.getPets().size());
  }

  @Test
  public void testAddPet() {
    // Arrange
    Owner owner = new Owner();
    owner.setAddress("42 Station Road");
    owner.setCity("London");
    owner.setFirstName("Jane");
    Pet pet = new Pet();
    pet.setBirthDate(null);
    pet.setId(1);
    pet.setName("London");

    // Act
    owner.addPet(pet);

    // Assert
    assertSame(owner, pet.getOwner());
  }

  @Test
  public void testGetPet() {
    // Arrange
    Owner owner = new Owner();
    owner.setAddress("42 Station Road");
    owner.setCity("London");
    owner.setFirstName("Jane");

    // Act and Assert
    assertNull(owner.getPet("id"));
  }

  @Test
  public void testGetPet2() {
    // Arrange
    Owner owner = new Owner();
    owner.setAddress("42 Station Road");
    owner.setCity("London");
    owner.setFirstName("Jane");

    // Act and Assert
    assertNull(owner.getPet("id", true));
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    Owner actualOwner = new Owner();

    // Assert
    assertNull(actualOwner.getLastName());
    assertNull(actualOwner.getAddress());
    Set<Pet> petsInternal = actualOwner.getPetsInternal();
    assertTrue(petsInternal instanceof java.util.HashSet);
    assertNull(actualOwner.getCity());
    assertEquals(0, petsInternal.size());
    assertNull(actualOwner.getTelephone());
    assertNull(actualOwner.getFirstName());
    assertNull(actualOwner.getId());
    assertTrue(actualOwner.isNew());
  }
}

