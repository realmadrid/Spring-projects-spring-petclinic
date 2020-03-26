package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertNull;
import java.util.Locale;
import org.junit.Test;

public class PetTypeFormatterDiffblueTest {
  @Test
  public void printTest() {
    // Arrange
    PetTypeFormatter petTypeFormatter = new PetTypeFormatter(null);
    PetType petType = new PetType();

    // Act and Assert
    assertNull(petTypeFormatter.print(petType, Locale.getDefault()));
  }
}

