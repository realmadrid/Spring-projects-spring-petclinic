package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import org.junit.Test;
import org.springframework.web.bind.WebDataBinder;

public class OwnerControllerDiffblueTest {
  @Test
  public void testSetAllowedFields() {
    // Arrange
    OwnerController ownerController = new OwnerController(null);
    WebDataBinder webDataBinder = new WebDataBinder("!");

    // Act
    ownerController.setAllowedFields(webDataBinder);

    // Assert
    assertEquals(1, webDataBinder.getDisallowedFields().length);
  }

  @Test
  public void testInitCreationForm() {
    // Arrange
    OwnerController ownerController = new OwnerController(null);
    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>();
    stringObjectMap.put("foo", "foo");

    // Act and Assert
    assertEquals("owners/createOrUpdateOwnerForm", ownerController.initCreationForm(stringObjectMap));
  }

  @Test
  public void testInitFindForm() {
    // Arrange
    OwnerController ownerController = new OwnerController(null);
    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>();
    stringObjectMap.put("foo", "foo");

    // Act and Assert
    assertEquals("owners/findOwners", ownerController.initFindForm(stringObjectMap));
  }
}

