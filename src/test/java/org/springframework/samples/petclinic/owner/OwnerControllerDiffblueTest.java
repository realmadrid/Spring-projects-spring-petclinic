package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.web.bind.WebDataBinder;

public class OwnerControllerDiffblueTest {
  @Test
  public void setAllowedFieldsTest() {
    // Arrange
    OwnerController ownerController = new OwnerController(null);
    WebDataBinder webDataBinder = new WebDataBinder("!");

    // Act
    ownerController.setAllowedFields(webDataBinder);

    // Assert
    assertEquals(1, webDataBinder.getDisallowedFields().length);
  }
}

