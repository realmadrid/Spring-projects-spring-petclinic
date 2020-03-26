package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import org.junit.Test;

public class OwnerControllerDiffblueTest {
  @Test
  public void initCreationFormTest() {
    // Arrange
    OwnerController ownerController = new OwnerController(null);
    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>();
    stringObjectMap.put("foo", "foo");

    // Act and Assert
    assertEquals("owners/createOrUpdateOwnerForm", ownerController.initCreationForm(stringObjectMap));
  }

  @Test
  public void initFindFormTest() {
    // Arrange
    OwnerController ownerController = new OwnerController(null);
    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>();
    stringObjectMap.put("foo", "foo");

    // Act and Assert
    assertEquals("owners/findOwners", ownerController.initFindForm(stringObjectMap));
  }
}

