package org.springframework.samples.petclinic.visit;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class VisitDiffblueTest {
  @Test
  public void testSetDate() {
    // Arrange
    Visit visit = new Visit();

    // Act
    visit.setDate(null);

    // Assert
    assertNull(visit.getDate());
  }
}

