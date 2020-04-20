package org.springframework.samples.petclinic.owner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.time.LocalDate;
import java.util.HashSet;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.samples.petclinic.visit.Visit;

/**
 * Unit tests for org.springframework.samples.petclinic.owner.Pet
 *
 * @author Diffblue Cover
 */

public class PetDiffblueTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void setId() {
        Pet pet = new Pet();
        LocalDate birthDate = LocalDate.of(2_000, 1, 1);
        pet.setBirthDate(birthDate);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getBirthDate(), sameInstance(birthDate));
        assertThat(pet.getOwner(), is(nullValue()));
        assertThat(pet.getType(), sameInstance(type));
        assertThat(pet.getName(), is("Bella"));
        assertThat(pet.getId(), is(1));
        assertThat(pet.isNew(), is(false));
    }

    @Test
    public void getNameReturnsBella() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getName(), is("Bella"));
    }

    @Test
    public void getIdReturnsOne() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getId(), is(1));
    }

    @Test
    public void setNameToEntity() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.setName("entity");
        assertThat(pet.getName(), is("entity"));
    }

    @Test
    public void setIdToOne() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.setId(1);
    }

    @Test
    public void isNewReturnsFalse() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.isNew(), is(false));
    }

    @Test
    public void setBirthDate() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        LocalDate birthDate = LocalDate.of(2_000, 1, 1);
        pet.setBirthDate(birthDate);
        assertThat(pet.getBirthDate(), sameInstance(birthDate));
    }

    @Test
    public void getBirthDate() {
        Pet pet = new Pet();
        LocalDate birthDate = LocalDate.of(2_000, 1, 1);
        pet.setBirthDate(birthDate);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getBirthDate(), sameInstance(birthDate));
    }

    @Test
    public void getType() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getType(), sameInstance(type));
    }

    @Test
    public void setType() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type1 = new PetType();
        type1.setName("dog");
        type1.setId(1);
        pet.setType(type1);
        pet.setName("Bella");
        pet.setId(1);
        PetType type2 = new PetType();
        type2.setName("dog");
        type2.setId(1);
        pet.setType(type2);
        assertThat(pet.getType(), sameInstance(type2));
    }

    @Test
    public void getOwnerReturnsNull() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getOwner(), is(nullValue()));
    }

    @Test
    public void setOwner() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        pet.setOwner(owner);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void getVisitsInternal1() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal10() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal100() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal101() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(null);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal102() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(-1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal103() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(0);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal104() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(null);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal105() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(-1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal106() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(0);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal107() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(null);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal108() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(-1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal109() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(0);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal11() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal110() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(null);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal111() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(-1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal112() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(0);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal12() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal13() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal14() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal15() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal16() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal17() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal18() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal19() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal2() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal20() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal21() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal22() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal23() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal24() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal25() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal26() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal27() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal28() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal29() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal3() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal30() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal31() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal32() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal33() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal34() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal35() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal36() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal37() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal38() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal39() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal4() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal40() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal41() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal42() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal43() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal44() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal45() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal46() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal47() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal48() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal49() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal5() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal50() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal51() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal52() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal53() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal54() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal55() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal56() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal57() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal58() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal59() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal6() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal60() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal61() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal62() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal63() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal64() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal65() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal66() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal67() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal68() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal69() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal7() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal70() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal71() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal72() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal73() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal74() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal75() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal76() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal77() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal78() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal79() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal8() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal80() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal81() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal82() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal83() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal84() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal85() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal86() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal87() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal88() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal89() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal9() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal90() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal91() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal92() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal93() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal94() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal95() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal96() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal97() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal98() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void getVisitsInternal99() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisitsInternal(), empty());
    }

    @Test
    public void setVisitsInternalVisitsIsEmpty() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.setVisitsInternal(new HashSet<Visit>());
    }

    @Test
    public void getVisits1() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits10() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits100() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits101() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits102() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits103() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("date");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits104() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits105() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits106() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits107() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits108() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits109() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits11() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits110() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits111() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("date");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits112() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits113() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits114() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits115() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits116() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits117() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits118() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits119() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("date");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits12() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits120() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits121() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits122() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits123() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits124() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(null);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits125() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(-1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits126() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(0);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits127() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(null);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits128() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(-1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits129() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(0);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits13() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits130() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(null);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits131() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(-1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits132() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(0);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits133() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("date");
        pet.setId(null);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits134() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("date");
        pet.setId(-1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits135() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("date");
        pet.setId(0);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits136() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(null);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits137() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(-1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits138() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(0);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits14() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits15() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("date");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits16() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits17() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits18() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits19() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits2() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits20() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits21() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits22() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits23() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits24() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("date");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits25() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits26() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits27() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits28() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits29() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits3() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits30() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits31() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits32() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("date");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits33() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits34() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits35() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits36() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits37() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits38() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits39() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits4() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits40() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("date");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits41() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits42() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits43() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits44() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits45() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits46() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits47() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits48() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits49() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits5() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits50() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits51() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("date");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits52() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits53() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits54() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits55() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits56() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits57() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits58() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits59() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits6() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits60() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits61() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits62() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("date");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits63() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits64() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits65() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits66() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits67() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits68() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits69() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits7() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("date");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits70() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits71() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits72() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits73() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("date");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits74() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits75() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits76() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits77() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits78() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("date");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits79() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("date");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits8() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits80() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("date");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits81() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("date");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits82() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("date");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits83() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("date");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits84() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("date");
        type.setId(1);
        pet.setType(type);
        pet.setName("date");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits85() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("date");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits86() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("date");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits87() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("date");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits88() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("date");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits89() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits9() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits90() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits91() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits92() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits93() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits94() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits95() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("date");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits96() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits97() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits98() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void getVisits99() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        assertThat(pet.getVisits(), empty());
    }

    @Test
    public void addVisit1() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit10() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit100() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1000() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1001() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit1002() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1003() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1004() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1005() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1006() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1007() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1008() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1009() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit101() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1010() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1011() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1012() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1013() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1014() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1015() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1016() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1017() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1018() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1019() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit102() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1020() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit1021() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1022() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1023() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1024() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1025() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1026() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1027() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1028() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1029() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit103() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1030() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1031() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1032() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1033() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1034() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1035() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1036() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1037() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1038() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1039() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit104() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit1040() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1041() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1042() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1043() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1044() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1045() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1046() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1047() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1048() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1049() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit105() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1050() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1051() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1052() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1053() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1054() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit1055() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1056() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1057() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1058() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1059() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit106() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1060() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1061() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1062() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1063() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1064() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit1065() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit107() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit108() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit109() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit11() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit110() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit111() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit112() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit113() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit114() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit115() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit116() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit117() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit118() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit119() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit12() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit120() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit121() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit122() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit123() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit124() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit125() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit126() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit127() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit128() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit129() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit13() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit130() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit131() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit132() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit133() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit134() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit135() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit136() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit137() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit138() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit139() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit14() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit140() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit141() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit142() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit143() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit144() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit145() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit146() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit147() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit148() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit149() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit15() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit150() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit151() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit152() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit153() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit154() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit155() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit156() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit157() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit158() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit159() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit16() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit160() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit161() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit162() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit163() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit164() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit165() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit166() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit167() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit168() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit169() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit17() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit170() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit171() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit172() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit173() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit174() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit175() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit176() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit177() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit178() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit179() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit18() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit180() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit181() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit182() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit183() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit184() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit185() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit186() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit187() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit188() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit189() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit19() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit190() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit191() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit192() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit193() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit194() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit195() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit196() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit197() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit198() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit199() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit2() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit20() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit200() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit201() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit202() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit203() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit204() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit205() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit206() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit207() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit208() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit209() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit21() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit210() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit211() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit212() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit213() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit214() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit215() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit216() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit217() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit218() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit219() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit22() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit220() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit221() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit222() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit223() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit224() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit225() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit226() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit227() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit228() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit229() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit23() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit230() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit231() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit232() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit233() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit234() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit235() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit236() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit237() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit238() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit239() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit24() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit240() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit241() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit242() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit243() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit244() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit245() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit246() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit247() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit248() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit249() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit25() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit250() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit251() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit252() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit253() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit254() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit255() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit256() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit257() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit258() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit259() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit26() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit260() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit261() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit262() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit263() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit264() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit265() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit266() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit267() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit268() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit269() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit27() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit270() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit271() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit272() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit273() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit274() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit275() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit276() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit277() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = null;
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit278() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit279() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit28() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit280() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit281() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit282() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit283() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit284() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit285() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit286() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit287() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit288() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit289() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = null;
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit29() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit290() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit291() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit292() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit293() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit294() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit295() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit296() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit297() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit298() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit299() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit3() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit30() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit300() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit301() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = null;
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit302() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit303() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit304() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit305() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit306() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit307() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit308() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit309() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit31() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit310() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit311() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit312() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit313() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit314() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit315() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit316() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit317() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit318() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit319() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit32() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit320() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit321() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit322() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit323() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit324() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit325() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit326() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit327() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit328() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit329() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit33() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit330() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit331() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit332() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit333() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit334() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit335() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit336() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit337() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit338() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit339() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit34() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit340() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit341() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit342() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit343() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit344() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit345() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit346() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit347() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit348() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit349() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit35() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit350() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit351() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit352() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit353() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit354() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit355() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit356() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit357() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit358() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit359() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit36() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit360() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit361() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit362() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit363() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit364() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit365() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit366() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit367() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit368() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit369() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit37() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit370() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit371() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit372() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit373() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit374() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit375() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit376() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit377() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit378() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit379() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit38() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit380() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit381() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit382() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit383() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit384() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit385() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit386() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit387() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit388() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit389() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit39() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit390() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit391() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit392() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit393() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit394() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit395() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit396() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit397() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit398() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit399() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit4() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit40() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit400() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit401() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit402() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit403() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit404() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit405() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit406() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit407() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit408() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit409() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit41() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit410() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit411() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit412() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit413() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit414() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit415() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit416() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit417() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit418() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit419() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit42() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit420() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit421() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit422() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit423() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit424() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit425() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit426() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit427() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit428() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit429() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit43() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit430() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit431() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit432() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit433() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit434() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit435() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit436() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit437() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit438() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit439() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit44() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit440() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit441() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit442() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit443() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit444() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit445() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit446() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit447() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit448() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit449() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit45() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit450() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit451() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit452() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit453() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit454() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit455() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit456() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit457() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit458() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit459() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit46() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit460() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit461() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit462() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit463() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit464() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit465() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit466() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit467() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit468() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit469() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit47() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit470() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit471() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit472() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit473() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit474() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit475() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit476() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit477() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit478() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit479() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit48() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit480() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit481() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit482() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit483() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit484() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit485() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit486() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit487() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit488() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit489() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit49() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit490() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit491() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit492() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit493() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit494() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit495() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit496() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit497() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit498() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit499() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit5() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit50() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit500() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit501() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit502() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit503() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit504() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit505() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit506() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit507() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit508() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit509() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit51() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit510() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit511() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit512() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit513() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit514() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit515() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit516() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit517() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit518() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit519() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit52() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit520() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit521() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit522() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit523() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit524() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit525() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit526() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit527() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit528() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit529() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit53() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit530() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit531() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit532() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit533() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit534() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit535() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit536() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit537() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit538() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit539() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit54() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit540() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit541() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit542() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit543() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit544() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit545() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit546() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit547() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit548() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit549() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit55() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit550() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit551() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit552() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit553() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit554() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit555() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit556() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit557() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit558() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit559() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit56() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit560() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit561() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit562() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit563() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit564() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit565() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit566() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit567() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit568() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit569() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit57() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit570() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit571() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit572() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit573() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit574() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit575() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit576() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit577() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit578() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit579() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit58() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit580() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = null;
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit581() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit582() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit583() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit584() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit585() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit586() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit587() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit588() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit589() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit59() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit590() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit591() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit592() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = null;
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit593() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit594() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit595() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit596() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit597() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit598() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit599() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit6() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit60() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit600() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit601() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit602() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit603() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit604() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = null;
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit605() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit606() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit607() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit608() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit609() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit61() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit610() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit611() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit612() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit613() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit614() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit615() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit616() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit617() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit618() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit619() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit62() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit620() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit621() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit622() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit623() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit624() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit625() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit626() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit627() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit628() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit629() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit63() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit630() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit631() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit632() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit633() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit634() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit635() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit636() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit637() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit638() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit639() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit64() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit640() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit641() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit642() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit643() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit644() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit645() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit646() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit647() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit648() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit649() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit65() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit650() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit651() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit652() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit653() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit654() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit655() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit656() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit657() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit658() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit659() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit66() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit660() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit661() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit662() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit663() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit664() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit665() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit666() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit667() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit668() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit669() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit67() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit670() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit671() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit672() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit673() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit674() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit675() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit676() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit677() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit678() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit679() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit68() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit680() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit681() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit682() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit683() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit684() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit685() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit686() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit687() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit688() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit689() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit69() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit690() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit691() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit692() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit693() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit694() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit695() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit696() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit697() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit698() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit699() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit7() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit70() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit700() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit701() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit702() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit703() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit704() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit705() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit706() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit707() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit708() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit709() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit71() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit710() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit711() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit712() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit713() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit714() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit715() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit716() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit717() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit718() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit719() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = null;
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit72() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit720() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit721() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit722() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit723() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit724() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit725() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit726() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit727() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit728() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit729() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit73() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit730() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit731() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = null;
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit732() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit733() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit734() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit735() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit736() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit737() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit738() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit739() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit74() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit740() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit741() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit742() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit743() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = null;
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit744() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit745() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit746() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit747() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit748() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit749() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit75() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit750() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit751() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit752() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit753() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit754() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit755() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit756() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit757() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit758() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit759() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit76() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit760() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit761() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit762() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit763() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit764() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit765() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit766() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit767() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit768() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit769() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit77() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit770() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit771() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit772() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit773() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit774() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit775() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit776() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit777() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit778() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit779() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit78() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit780() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit781() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit782() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit783() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit784() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit785() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit786() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit787() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit788() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit789() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit79() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit790() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit791() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit792() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit793() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit794() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit795() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit796() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit797() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit798() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit799() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit8() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit80() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit800() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit801() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit802() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit803() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit804() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit805() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit806() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit807() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit808() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit809() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit81() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit810() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit811() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit812() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit813() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit814() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit815() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit816() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit817() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit818() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit819() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit82() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit820() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit821() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit822() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit823() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit824() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit825() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit826() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit827() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit828() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit829() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit83() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit830() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit831() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit832() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit833() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit834() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit835() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit836() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit837() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit838() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit839() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit84() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit840() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit841() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit842() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit843() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit844() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit845() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit846() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit847() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit848() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit849() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit85() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit850() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit851() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit852() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit853() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit854() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit855() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit856() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit857() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit858() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit859() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit86() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit860() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit861() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit862() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit863() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit864() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit865() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit866() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit867() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit868() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit869() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit87() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit870() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit871() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit872() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit873() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit874() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit875() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit876() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit877() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit878() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit879() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit88() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit880() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit881() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit882() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit883() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit884() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit885() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit886() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit887() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit888() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit889() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit89() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit890() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit891() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit892() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit893() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit894() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit895() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit896() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit897() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit898() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit899() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit9() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit90() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit900() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit901() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit902() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit903() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        pet.addVisit(null);
    }

    @Test
    public void addVisit904() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit905() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit906() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit907() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit908() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit909() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit91() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit910() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit911() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit912() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit913() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit914() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit915() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = null;
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit916() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit917() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit918() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit919() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit92() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit920() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit921() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit922() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit923() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit924() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit925() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit926() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(nullValue()));
    }

    @Test
    public void addVisit927() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = null;
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit928() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit929() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit93() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit930() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit931() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit932() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit933() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit934() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit935() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit936() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit937() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit938() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(-1));
    }

    @Test
    public void addVisit939() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = null;
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit94() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit940() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit941() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit942() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit943() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit944() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit945() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit946() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit947() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit948() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit949() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit95() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit950() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(0));
    }

    @Test
    public void addVisit951() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit952() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit953() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit954() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit955() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit956() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit957() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit958() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit959() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit96() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit960() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(null);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit961() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit962() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit963() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit964() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit965() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit966() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription(null);
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit967() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit968() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit969() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit97() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit970() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit971() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit972() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit973() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit974() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit975() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit976() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit977() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit978() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("bar");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit979() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(null);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit98() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit980() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(-1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit981() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(0);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit982() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(null);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit983() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(-1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit984() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("foo");
        visit.setPetId(1);
        visit.setId(0);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit985() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit986() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit987() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(null);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit988() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit989() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit99() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit990() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(-1);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit991() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(null);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit992() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(-1);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit993() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(0);
        visit.setId(0);
        pet.addVisit(visit);
        assertThat(visit.getPetId(), is(1));
    }

    @Test
    public void addVisit994() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName(null);
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit995() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit996() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit997() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit998() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(null);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisit999() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(null);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        pet.addVisit(visit);
    }

    @Test
    public void addVisitVisitIsNullThrowsNullPointerException1() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = null;
        thrown.expect(NullPointerException.class);
        pet.addVisit(visit);
    }

    @Test
    public void addVisitVisitIsNullThrowsNullPointerException2() {
        Pet pet = new Pet();
        pet.setBirthDate(null);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = null;
        thrown.expect(NullPointerException.class);
        pet.addVisit(visit);
    }

    @Test
    public void addVisitVisitIsNullThrowsNullPointerException3() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        pet.setType(null);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = null;
        thrown.expect(NullPointerException.class);
        pet.addVisit(visit);
    }

    @Test
    public void addVisitVisitIsNullThrowsNullPointerException4() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName(null);
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        Visit visit = null;
        thrown.expect(NullPointerException.class);
        pet.addVisit(visit);
    }
}
