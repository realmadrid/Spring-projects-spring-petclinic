package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PetValidatorDiffblueTest {
  @Test
  public void testSupports() {
    // Arrange
    Class<?> clazz = Object.class;

    // Act and Assert
    assertFalse((new PetValidator()).supports(clazz));
  }
}

