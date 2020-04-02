package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.HashSet;
import org.junit.Test;

public class OwnerDiffblueTest {
  @Test
  public void testSetAddress() {
    // Arrange
    Owner owner = new Owner();

    // Act
    owner.setAddress("42 Station Road");

    // Assert
    assertEquals("42 Station Road", owner.getAddress());
  }

  @Test
  public void testSetCity() {
    // Arrange
    Owner owner = new Owner();

    // Act
    owner.setCity("London");

    // Assert
    assertEquals("London", owner.getCity());
  }

  @Test
  public void testSetTelephone() {
    // Arrange
    Owner owner = new Owner();

    // Act
    owner.setTelephone("01234556677");

    // Assert
    assertEquals("01234556677", owner.getTelephone());
  }

  @Test
  public void testGetPetsInternal() {
    // Arrange, Act and Assert
    assertEquals(0, (new Owner()).getPetsInternal().size());
  }

  @Test
  public void testSetPetsInternal() {
    // Arrange
    HashSet<Pet> petSet = new HashSet<Pet>();
    petSet.add(new Pet());
    Owner owner = new Owner();

    // Act
    owner.setPetsInternal(petSet);

    // Assert
    assertSame(petSet, owner.getPetsInternal());
  }

  @Test
  public void testGetPets() {
    // Arrange, Act and Assert
    assertEquals(0, (new Owner()).getPets().size());
  }

  @Test
  public void testAddPet() {
    // Arrange
    Pet pet = new Pet();
    pet.setId(1);
    Owner owner = new Owner();

    // Act
    owner.addPet(pet);

    // Assert
    assertSame(owner, pet.getOwner());
  }

  @Test
  public void testAddPet2() {
    // Arrange
    Owner owner = new Owner();
    Pet pet = new Pet();

    // Act
    owner.addPet(pet);

    // Assert
    assertSame(owner, pet.getOwner());
  }

  @Test
  public void testGetPet() {
    // Arrange, Act and Assert
    assertNull((new Owner()).getPet("id"));
  }

  @Test
  public void testGetPet2() {
    // Arrange, Act and Assert
    assertNull((new Owner()).getPet("id", true));
  }
}

