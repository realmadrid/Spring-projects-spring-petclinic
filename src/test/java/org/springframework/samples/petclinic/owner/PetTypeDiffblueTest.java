package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PetTypeDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    PetType actualPetType = new PetType();

    // Assert
    assertNull(actualPetType.getName());
    assertNull(actualPetType.getId());
    assertTrue(actualPetType.isNew());
    assertNull(actualPetType.toString());
  }
}

