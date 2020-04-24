package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

public class PetValidatorDiffblueTest {
  @Test
  public void testValidate() {
    // Arrange
    PetValidator petValidator = new PetValidator();
    Pet pet = new Pet();
    pet.setBirthDate(null);
    pet.setId(1);
    pet.setName("name");
    BindException bindException = new BindException(pet, "objectName");
    bindException.addError(null);
    BindException bindException1 = new BindException(bindException);
    BindException bindException2 = new BindException("target", "objectName");
    bindException2.addError(null);
    bindException1.addAllErrors(bindException2);
    ObjectError objectError = new ObjectError("objectName", "defaultMessage");
    objectError.wrap(pet);
    bindException1.addError(objectError);
    BindException bindException3 = new BindException(bindException1);
    StackTraceElement stackTraceElement = new StackTraceElement("objectName", "defaultMessage", "objectName", 1);
    StackTraceElement stackTraceElement1 = new StackTraceElement("foo", "objectName", "defaultMessage", 1);
    StackTraceElement[] stackTraceElementArray = new StackTraceElement[]{stackTraceElement, stackTraceElement1,
        new StackTraceElement("foo", "foo", "objectName", 1), stackTraceElement, stackTraceElement1,
        new StackTraceElement("foo", "foo", "objectName", 1), stackTraceElement, stackTraceElement1,
        new StackTraceElement("foo", "foo", "objectName", 1), stackTraceElement};
    bindException3.setStackTrace(stackTraceElementArray);
    BindException bindException4 = new BindException(bindException);
    BindException bindException5 = new BindException(bindException);
    bindException5.addError(null);
    bindException4.addAllErrors(bindException5);
    ObjectError objectError1 = new ObjectError("objectName", "foo");
    objectError1.wrap("source");
    bindException4.addError(objectError1);
    bindException3.addAllErrors(bindException4);
    bindException3.addError(objectError);
    BindException bindException6 = new BindException(bindException3);
    bindException6.setStackTrace(stackTraceElementArray);
    bindException6.addAllErrors(bindException2);
    bindException6.addError(objectError);

    // Act
    petValidator.validate(pet, bindException6);

    // Assert
    BindingResult bindingResult = bindException6.getBindingResult();
    String actualToStringResult = ((BindException) bindingResult).toString();
    assertTrue(bindException6.getPropertyEditorRegistry() instanceof org.springframework.beans.BeanWrapperImpl);
    assertEquals("org.springframework.validation.BindException:" + " org.springframework.validation.BindException:"
        + " org.springframework.validation.BindException:"
        + " org.springframework.validation.BeanPropertyBindingResult:" + " 22 errors\n" + "null\n" + "null\n"
        + "Error in object 'objectName': codes []; arguments" + " []; default message [defaultMessage]\n" + "null\n"
        + "null\n" + "null\n" + "Error in object 'objectName': codes []; arguments"
        + " []; default message [defaultMessage]\n" + "null\n" + "Error in object 'objectName': codes []; arguments"
        + " []; default message [foo]\n" + "null\n" + "null\n" + "Error in object 'objectName': codes []; arguments"
        + " []; default message [defaultMessage]\n" + "null\n" + "null\n" + "null\n"
        + "Error in object 'objectName': codes []; arguments" + " []; default message [defaultMessage]\n" + "null\n"
        + "Error in object 'objectName': codes []; arguments" + " []; default message [foo]\n"
        + "Error in object 'objectName': codes []; arguments" + " []; default message [defaultMessage]\n" + "null\n"
        + "Error in object 'objectName': codes []; arguments" + " []; default message [defaultMessage]\n"
        + "Field error in object 'objectName' on field 'birthDate':"
        + " rejected value [null]; codes [required.objectName" + ".birthDate,required.birthDate,required.java.time"
        + ".LocalDate,required]; arguments []; default message" + " [required]", actualToStringResult);
    assertEquals(22, bindingResult.getErrorCount());
  }

  @Test
  public void testSupports() {
    // Arrange
    Class<?> clazz = Object.class;

    // Act and Assert
    assertFalse((new PetValidator()).supports(clazz));
  }
}

