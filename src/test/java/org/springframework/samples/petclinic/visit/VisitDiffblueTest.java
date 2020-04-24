package org.springframework.samples.petclinic.visit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class VisitDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Visit actualVisit = new Visit();

    // Assert
    assertNull(actualVisit.getPetId());
    assertNull(actualVisit.getDescription());
    assertNull(actualVisit.getId());
    assertTrue(actualVisit.isNew());
  }

  @Test
  public void testSetDate() {
    // Arrange
    Visit visit = new Visit();
    visit.setDate(null);
    visit.setDescription("description");
    visit.setId(1);

    // Act
    visit.setDate(null);

    // Assert
    assertNull(visit.getDate());
  }

  @Test
  public void testSetDescription() {
    // Arrange
    Visit visit = new Visit();
    visit.setDate(null);
    visit.setDescription("description");
    visit.setId(1);

    // Act
    visit.setDescription("description");

    // Assert
    assertEquals("description", visit.getDescription());
  }

  @Test
  public void testSetPetId() {
    // Arrange
    Visit visit = new Visit();
    visit.setDate(null);
    visit.setDescription("description");
    visit.setId(1);

    // Act
    visit.setPetId(123);

    // Assert
    assertEquals(123, visit.getPetId().intValue());
  }
}

