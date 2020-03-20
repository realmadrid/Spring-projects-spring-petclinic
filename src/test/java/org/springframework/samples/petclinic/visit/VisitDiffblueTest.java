package org.springframework.samples.petclinic.visit;

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
}

