package org.springframework.samples.petclinic.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PersonDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Person actualPerson = new Person();

    // Assert
    assertNull(actualPerson.getLastName());
    assertNull(actualPerson.getFirstName());
    assertNull(actualPerson.getId());
    assertTrue(actualPerson.isNew());
  }

  @Test
  public void testSetFirstName() {
    // Arrange
    Person person = new Person();

    // Act
    person.setFirstName("Jane");

    // Assert
    assertEquals("Jane", person.getFirstName());
  }

  @Test
  public void testSetLastName() {
    // Arrange
    Person person = new Person();

    // Act
    person.setLastName("Doe");

    // Assert
    assertEquals("Doe", person.getLastName());
  }
}

