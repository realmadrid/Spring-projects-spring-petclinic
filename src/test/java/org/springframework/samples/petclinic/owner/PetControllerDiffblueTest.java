package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;
import org.springframework.ui.ModelMap;

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
}

