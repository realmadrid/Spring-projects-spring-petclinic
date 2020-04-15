package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.web.bind.WebDataBinder;

public class PetControllerDiffblueTest {
  @Test
  public void testInitOwnerBinder() {
    // Arrange
    PetController petController = new PetController(null, null);
    WebDataBinder webDataBinder = new WebDataBinder("!");

    // Act
    petController.initOwnerBinder(webDataBinder);

    // Assert
    assertEquals(1, webDataBinder.getDisallowedFields().length);
  }
}

