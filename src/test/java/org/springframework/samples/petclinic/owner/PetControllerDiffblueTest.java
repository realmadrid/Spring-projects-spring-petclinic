package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.web.bind.WebDataBinder;

public class PetControllerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
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
  @Test
  public void testInitPetBinder() {
    // Arrange
    PetController petController = new PetController(null, null);

    // Act and Assert
    thrown.expect(IllegalStateException.class);
    petController.initPetBinder(new WebDataBinder("!"));
  }
}

