package org.springframework.samples.petclinic.owner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.time.LocalDate;
import java.util.HashSet;

import org.junit.Test;
import org.springframework.samples.petclinic.visit.Visit;

/**
 * Unit tests for org.springframework.samples.petclinic.owner.Pet
 *
 * @author Diffblue Cover
 */

public class PetDiffblueTest {

    @Test
    public void addVisit() {
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
    public void getVisitsReturnsEmpty() {
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
}
