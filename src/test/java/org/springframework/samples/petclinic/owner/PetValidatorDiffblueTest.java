package org.springframework.samples.petclinic.owner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import java.time.LocalDate;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.validation.Errors;

/**
 * Unit tests for org.springframework.samples.petclinic.owner.PetValidator
 *
 * @author Diffblue Cover
 */

public class PetValidatorDiffblueTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructor() {
        // pojo PetValidator
    }

    @Test
    public void supports() {
        assertThat(new PetValidator().supports(Object.class), is(false));
        assertThat(new PetValidator().supports(Pet.class), is(true));
        assertThat(new PetValidator().supports(String.class), is(false));
    }

    @Test
    public void validate1() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
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
    public void validate10() throws IllegalStateException {
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
    public void validate11() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate12() throws IllegalStateException {
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
    public void validate13() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate14() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate15() throws IllegalStateException {
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
    public void validate16() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate17() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate18() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        new PetValidator().validate(pet, null);
    }

    @Test
    public void validate19() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(null);
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
    public void validate2() throws IllegalStateException {
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
    public void validate20() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate21() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate22() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate23() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate24() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate25() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate26() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate27() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate28() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(null);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate29() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(null);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate3() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate30() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(null);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate31() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(null);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate32() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        new PetValidator().validate(pet, null);
    }

    @Test
    public void validate4() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate5() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate6() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate7() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate8() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validate9() throws IllegalStateException {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Errors errors = mock(Errors.class);
        new PetValidator().validate(pet, errors);
    }

    @Test
    public void validateObjIsFooThrowsClassCastException() throws IllegalStateException {
        Errors errors = mock(Errors.class);
        // java.lang.String cannot be cast to org.springframework.samples.petclinic.owner.Pet
        thrown.expect(ClassCastException.class);
        new PetValidator().validate("foo", errors);
    }

    @Test
    public void validateThrowsClassCastException() throws IllegalStateException {
        Errors errors = mock(Errors.class);
        // java.lang.Object cannot be cast to org.springframework.samples.petclinic.owner.Pet
        thrown.expect(ClassCastException.class);
        new PetValidator().validate(new Object(), errors);
    }
}
