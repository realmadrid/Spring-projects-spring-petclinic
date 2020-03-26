package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import org.junit.Test;

public class VisitControllerDiffblueTest {
  @Test
  public void initNewVisitFormTest() {
    // Arrange
    VisitController visitController = new VisitController(null, null);
    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>();
    stringObjectMap.put("foo", "foo");

    // Act and Assert
    assertEquals("pets/createOrUpdateVisitForm", visitController.initNewVisitForm(0, stringObjectMap));
  }
}

