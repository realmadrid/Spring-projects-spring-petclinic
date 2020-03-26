package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;

public class PetControllerDiffblueTest {
  @Test
  public void initCreationFormTest() {
    // Arrange
    PetController petController = new PetController(null, null);
    Owner owner = new Owner();
    ModelMap modelMap = new ModelMap();
    modelMap.put("foo", "foo");

    // Act and Assert
    assertEquals("pets/createOrUpdatePetForm", petController.initCreationForm(owner, modelMap));
    assertSame(owner, ((Pet) modelMap.get("pet")).getOwner());
  }

  @Test
  public void initOwnerBinderTest() {
    // Arrange
    PetController petController = new PetController(null, null);
    WebDataBinder webDataBinder = new WebDataBinder("!");

    // Act
    petController.initOwnerBinder(webDataBinder);

    // Assert
    assertEquals(1, webDataBinder.getDisallowedFields().length);
  }
}

