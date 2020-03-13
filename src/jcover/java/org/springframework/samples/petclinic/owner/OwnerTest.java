package org.springframework.samples.petclinic.owner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.HashSet;

import org.junit.Test;

/**
 * Unit tests for org.springframework.samples.petclinic.owner.Owner
 *
 * @author Diffblue Cover
 */

public class OwnerTest {

    @Test
    public void addPet() {
        Owner owner = new Owner();
        Pet pet = new Pet();
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
        assertThat(owner.getPets(), hasSize(1));
        assertThat(owner.getPets().get(0), sameInstance(pet));
    }

    @Test
    public void getPetNameIsBellaReturnsNull() {
        assertThat(new Owner().getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getters() {
        assertThat(new Owner().getAddress(), is(nullValue()));
        assertThat(new Owner().getCity(), is(nullValue()));
        assertThat(new Owner().getPets(), empty());
        assertThat(new Owner().getTelephone(), is(nullValue()));
    }

    @Test
    public void setAddress() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        assertThat(owner.getAddress(), is("280 Broadway"));
    }

    @Test
    public void setCity() {
        Owner owner = new Owner();
        owner.setCity("New York");
        assertThat(owner.getCity(), is("New York"));
    }

    @Test
    public void setPetsInternalPetsIsEmpty() {
        new Owner().setPetsInternal(new HashSet<Pet>());
    }

    @Test
    public void setTelephone() {
        Owner owner = new Owner();
        owner.setTelephone("12345");
        assertThat(owner.getTelephone(), is("12345"));
    }
}
