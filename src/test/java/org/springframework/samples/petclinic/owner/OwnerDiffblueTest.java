package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.HashSet;
import org.junit.Test;

public class OwnerDiffblueTest {
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
  public void getPetTest2() {
    // Arrange, Act and Assert
    assertNull((new Owner()).getPet("name", true));
  }

  @Test
  public void getPetsInternalTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Owner()).getPetsInternal().size());
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
  public void addPetTest() {
    // Arrange
    Owner owner = new Owner();
    Pet pet = new Pet();

    // Act
    owner.addPet(pet);

    // Assert
    assertSame(owner, pet.getOwner());
  }

  @Test
  public void getPetsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Owner()).getPets().size());
  }

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
  public void getPetTest() {
    // Arrange, Act and Assert
    assertNull((new Owner()).getPet("name"));
  }
}

