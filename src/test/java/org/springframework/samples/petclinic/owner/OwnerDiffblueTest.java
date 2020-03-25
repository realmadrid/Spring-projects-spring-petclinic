package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.HashSet;
import org.junit.Test;

public class OwnerDiffblueTest {
  @Test
  public void setAddressTest() {
    // Arrange
    Owner owner = new Owner();

    // Act
    owner.setAddress("42 Station Road");

    // Assert
    assertEquals("42 Station Road", owner.getAddress());
  }

  @Test
  public void setCityTest() {
    // Arrange
    Owner owner = new Owner();

    // Act
    owner.setCity("London");

    // Assert
    assertEquals("London", owner.getCity());
  }

  @Test
  public void setTelephoneTest() {
    // Arrange
    Owner owner = new Owner();

    // Act
    owner.setTelephone("01234556677");

    // Assert
    assertEquals("01234556677", owner.getTelephone());
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
  public void getPetsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Owner()).getPets().size());
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
  public void getPetTest() {
    // Arrange, Act and Assert
    assertNull((new Owner()).getPet("id"));
  }

  @Test
  public void getPetTest2() {
    // Arrange, Act and Assert
    assertNull((new Owner()).getPet("id", true));
  }
}

