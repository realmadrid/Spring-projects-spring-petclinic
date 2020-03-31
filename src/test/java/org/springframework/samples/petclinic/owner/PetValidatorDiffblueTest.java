package org.springframework.samples.petclinic.owner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import java.time.LocalDate;

import org.junit.Test;
import org.springframework.validation.Errors;

/**
 * Unit tests for org.springframework.samples.petclinic.owner.PetValidator
 *
 * @author Diffblue Cover
 */

public class PetValidatorDiffblueTest {

    @Test
    public void supports() {
        assertThat(new PetValidator().supports(Pet.class), is(true));
        assertThat(new PetValidator().supports(String.class), is(false));
    }

    @Test
    public void validate1() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate2() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate3() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate4() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate5() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }
}
