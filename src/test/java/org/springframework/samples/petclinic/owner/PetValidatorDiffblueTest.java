package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;

public class PetValidatorDiffblueTest {
  @Test
  public void testValidate() {
    // Arrange
    PetValidator petValidator = new PetValidator();
    Pet pet = new Pet();
    BindException bindException = new BindException(
        new BindException(new BindException(new BindException(pet, "objectName"))));

    // Act
    petValidator.validate(pet, bindException);

    // Assert
    BindingResult bindingResult = bindException.getBindingResult();
    String actualMessage = ((BindException) bindingResult).getMessage();
    assertTrue(bindException.getPropertyEditorRegistry() instanceof org.springframework.beans.BeanWrapperImpl);
    assertEquals("org.springframework.validation.BindException:" + " org.springframework.validation.BindException:"
        + " org.springframework.validation.BeanPropertyBindingResult:" + " 3 errors\n"
        + "Field error in object 'objectName' on field 'name':" + " rejected value [null]; codes [required.objectName"
        + ".name,required.name,required.java.lang.String,required];" + " arguments []; default message [required]\n"
        + "Field error in object 'objectName' on field 'type':" + " rejected value [null]; codes [required.objectName"
        + ".type,required.type,required.org.springframework" + ".samples.petclinic.owner.PetType,required]; arguments"
        + " []; default message [required]\n" + "Field error in object 'objectName' on field 'birthDate':"
        + " rejected value [null]; codes [required.objectName" + ".birthDate,required.birthDate,required.java.time"
        + ".LocalDate,required]; arguments []; default message" + " [required]", actualMessage);
    assertEquals(3, bindingResult.getErrorCount());
  }

  @Test
  public void testSupports() {
    // Arrange
    Class<?> clazz = Object.class;

    // Act and Assert
    assertFalse((new PetValidator()).supports(clazz));
  }
}

