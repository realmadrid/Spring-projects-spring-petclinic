package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertFalse;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PetValidatorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void testSupports() {
    // Arrange
    Class<?> clazz = Object.class;

    // Act and Assert
    assertFalse((new PetValidator()).supports(clazz));
  }
  @Test
  public void testValidate() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new PetValidator()).validate("birthDate", null);
  }
}

