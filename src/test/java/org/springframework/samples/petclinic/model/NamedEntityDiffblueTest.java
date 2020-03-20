package org.springframework.samples.petclinic.model;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class NamedEntityDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    NamedEntity actualNamedEntity = new NamedEntity();

    // Assert
    assertNull(actualNamedEntity.getName());
    assertNull(actualNamedEntity.getId());
    assertTrue(actualNamedEntity.isNew());
    assertNull(actualNamedEntity.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertNull((new NamedEntity()).toString());
  }
}

