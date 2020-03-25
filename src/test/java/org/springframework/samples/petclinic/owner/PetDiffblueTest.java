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
        new Pet().addVisit(new Visit());
    }

    @Test
    public void getters() {
        assertThat(new Pet().getBirthDate(), is(nullValue()));
        assertThat(new Pet().getOwner(), is(nullValue()));
        assertThat(new Pet().getType(), is(nullValue()));
    }

    @Test
    public void getVisitsReturnsEmpty() {
        assertThat(new Pet().getVisits(), empty());
    }

    @Test
    public void setBirthDate() {
        Pet pet = new Pet();
        LocalDate birthDate = LocalDate.of(2_000, 1, 1);
        pet.setBirthDate(birthDate);
        assertThat(pet.getBirthDate(), sameInstance(birthDate));
    }

    @Test
    public void setOwner() {
        Pet pet = new Pet();
        Owner owner = new Owner();
        pet.setOwner(owner);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void setType() {
        Pet pet = new Pet();
        PetType type = new PetType();
        pet.setType(type);
        assertThat(pet.getType(), sameInstance(type));
    }

    @Test
    public void setVisitsInternalVisitsIsEmpty() {
        new Pet().setVisitsInternal(new HashSet<Visit>());
    }
}
