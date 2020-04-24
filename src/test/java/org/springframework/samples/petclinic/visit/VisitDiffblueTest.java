package org.springframework.samples.petclinic.visit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.time.LocalDate;
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
    LocalDate ofEpochDayResult = LocalDate.ofEpochDay(1L);
    Visit visit = new Visit();

    // Act
    visit.setDate(ofEpochDayResult);

    // Assert
    assertSame(ofEpochDayResult, visit.getDate());
  }

  @Test
  public void testSetDescription() {
    // Arrange
    Visit visit = new Visit();

    // Act
    visit.setDescription("description");

    // Assert
    assertEquals("description", visit.getDescription());
  }

  @Test
  public void testSetPetId() {
    // Arrange
    Visit visit = new Visit();

    // Act
    visit.setPetId(123);

    // Assert
    assertEquals(123, visit.getPetId().intValue());
  }
}

