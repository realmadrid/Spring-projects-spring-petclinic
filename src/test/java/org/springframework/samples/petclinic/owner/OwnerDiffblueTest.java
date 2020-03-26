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
  public void setAddressTest() {
    // Arrange
    Owner owner = new Owner();

    // Act
    owner.setAddress("id");

    // Assert
    assertEquals("id", owner.getAddress());
  }

  @Test
  public void setCityTest() {
    // Arrange
    Owner owner = new Owner();

    // Act
    owner.setCity("id");

    // Assert
    assertEquals("id", owner.getCity());
  }

  @Test
  public void setTelephoneTest() {
    // Arrange
    Owner owner = new Owner();

    // Act
    owner.setTelephone("id");

    // Assert
    assertEquals("id", owner.getTelephone());
  }

  @Test
  public void getPetsInternalTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Owner()).getPetsInternal().size());
  }

  @Test
  public void setPetsInternalTest() {
    // Arrange
    Owner owner = new Owner();
    HashSet<Pet> petSet = new HashSet<Pet>();
    petSet.add(new Pet());

    // Act
    owner.setPetsInternal(petSet);

    // Assert
    assertSame(petSet, owner.getPetsInternal());
  }

  @Test
  public void addPetTest() {
    // Arrange
    Owner owner = new Owner();
    Pet pet = new Pet();
    pet.setId(1);

    // Act
    owner.addPet(pet);

    // Assert
    assertSame(owner, pet.getOwner());
  }

  @Test
  public void addPetTest2() {
    // Arrange
    Owner owner = new Owner();
    Pet pet = new Pet();

    // Act
    owner.addPet(pet);

    // Assert
    assertSame(owner, pet.getOwner());
  }

  @Test
  public void constructorTest() {
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

