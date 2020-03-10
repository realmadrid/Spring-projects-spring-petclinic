package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.WebDataBinder;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class PetControllerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Autowired
  private PetController petController;
  @Test
  public void findOwnerTest() {
    // Arrange, Act and Assert
    assertNull(this.petController.findOwner(123));
  }
  @Test
  public void initOwnerBinderTest() {
    // Arrange
    WebDataBinder webDataBinder = new WebDataBinder("!");

    // Act
    this.petController.initOwnerBinder(webDataBinder);

    // Assert
    assertEquals(1, webDataBinder.getDisallowedFields().length);
  }
  @Test
  public void initPetBinderTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    this.petController.initPetBinder(new WebDataBinder("!"));
  }
  @Test
  public void populatePetTypesTest() {
    // Arrange, Act and Assert
    assertEquals(6, this.petController.populatePetTypes().size());
  }
}

