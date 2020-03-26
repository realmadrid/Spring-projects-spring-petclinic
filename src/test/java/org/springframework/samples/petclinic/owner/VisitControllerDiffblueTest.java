package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import org.junit.Test;
import org.springframework.web.bind.WebDataBinder;

public class VisitControllerDiffblueTest {
  @Test
  public void initNewVisitFormTest() {
    // Arrange
    VisitController visitController = new VisitController(null, null);
    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>();
    stringObjectMap.put("foo", "foo");

    // Act and Assert
    assertEquals("pets/createOrUpdateVisitForm", visitController.initNewVisitForm(123, stringObjectMap));
  }

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

