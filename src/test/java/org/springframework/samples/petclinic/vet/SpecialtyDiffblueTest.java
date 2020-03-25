package org.springframework.samples.petclinic.vet;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SpecialtyDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Specialty actualSpecialty = new Specialty();

    // Assert
    assertNull(actualSpecialty.getName());
    assertNull(actualSpecialty.getId());
    assertTrue(actualSpecialty.isNew());
    assertNull(actualSpecialty.toString());
  }
}

