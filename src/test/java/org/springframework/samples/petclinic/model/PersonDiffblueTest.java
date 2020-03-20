package org.springframework.samples.petclinic.model;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PersonDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    Person actualPerson = new Person();

    // Assert
    assertNull(actualPerson.getLastName());
    assertNull(actualPerson.getFirstName());
    assertNull(actualPerson.getId());
    assertTrue(actualPerson.isNew());
  }
}

