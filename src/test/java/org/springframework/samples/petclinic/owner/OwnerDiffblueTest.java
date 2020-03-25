package org.springframework.samples.petclinic.owner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.time.LocalDate;
import java.util.HashSet;

import org.junit.Test;

/**
 * Unit tests for org.springframework.samples.petclinic.owner.Owner
 *
 * @author Diffblue Cover
 */

public class OwnerDiffblueTest {

    @Test
    public void addPet() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void getAddress() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getAddress(), is("280 Broadway"));
    }

    @Test
    public void getCity() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getCity(), is("New York"));
    }

    @Test
    public void getPetNameIsBellaReturnsNull() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPetsReturnsEmpty() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getTelephone() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getTelephone(), is("12345"));
    }

    @Test
    public void setId() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getAddress(), is("280 Broadway"));
        assertThat(owner.getCity(), is("New York"));
        assertThat(owner.getTelephone(), is("12345"));
        assertThat(owner.getFirstName(), is("Anna"));
        assertThat(owner.getLastName(), is("Smith"));
        assertThat(owner.getId(), is(1));
        assertThat(owner.isNew(), is(false));
    }

    @Test
    public void setPetsInternalPetsIsEmpty() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        owner.setPetsInternal(new HashSet<Pet>());
    }
}
