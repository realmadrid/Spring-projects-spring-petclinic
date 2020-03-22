package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.web.bind.WebDataBinder;

public class VisitControllerDiffblueTest {
  @Test
  public void setAllowedFieldsTest() {
    // Arrange
    VisitController visitController = new VisitController(null, null);
    WebDataBinder webDataBinder = new WebDataBinder("!");

    // Act
    visitController.setAllowedFields(webDataBinder);

    // Assert
    assertEquals(1, webDataBinder.getDisallowedFields().length);
  }
}

