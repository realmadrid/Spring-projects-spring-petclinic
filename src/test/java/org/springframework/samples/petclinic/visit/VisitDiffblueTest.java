package org.springframework.samples.petclinic.visit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class VisitDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    Visit actualVisit = new Visit();

    // Assert
    assertNull(actualVisit.getPetId());
    assertNull(actualVisit.getDescription());
    assertNull(actualVisit.getId());
    assertTrue(actualVisit.isNew());
  }

  @Test
  public void setDateTest() {
    // Arrange
    Visit visit = new Visit();

    // Act
    visit.setDate(null);

    // Assert
    assertNull(visit.getDate());
  }

  @Test
  public void getDescriptionTest() {
    // Arrange, Act and Assert
    assertNull((new Visit()).getDescription());
  }

  @Test
  public void setDescriptionTest() {
    // Arrange
    Visit visit = new Visit();

    // Act
    visit.setDescription("description");

    // Assert
    assertEquals("description", visit.getDescription());
  }

  @Test
  public void getPetIdTest() {
    // Arrange, Act and Assert
    assertNull((new Visit()).getPetId());
  }

  @Test
  public void setPetIdTest() {
    // Arrange
    Visit visit = new Visit();

    // Act
    visit.setPetId(123);

    // Assert
    assertEquals(123, visit.getPetId().intValue());
  }
}

