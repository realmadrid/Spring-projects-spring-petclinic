package org.springframework.samples.petclinic.owner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for org.springframework.samples.petclinic.owner.PetType
 *
 * @author Diffblue Cover
 */

public class PetTypeDiffblueTest {

    @Test
    public void setId() {
        PetType petType = new PetType();
        petType.setName("dog");
        petType.setId(1);
        assertThat(petType.getName(), is("dog"));
        assertThat(petType.getId(), is(1));
        assertThat(petType.isNew(), is(false));
    }

    @Test
    public void getNameReturnsDog() {
        PetType petType = new PetType();
        petType.setName("dog");
        petType.setId(1);
        assertThat(petType.getName(), is("dog"));
    }

    @Test
    public void getIdReturnsOne() {
        PetType petType = new PetType();
        petType.setName("dog");
        petType.setId(1);
        assertThat(petType.getId(), is(1));
    }

    @Test
    public void setNameToEntity() {
        PetType petType = new PetType();
        petType.setName("dog");
        petType.setId(1);
        petType.setName("entity");
        assertThat(petType.getName(), is("entity"));
    }

    @Test
    public void setIdToOne() {
        PetType petType = new PetType();
        petType.setName("dog");
        petType.setId(1);
        petType.setId(1);
    }

    @Test
    public void isNewReturnsFalse() {
        PetType petType = new PetType();
        petType.setName("dog");
        petType.setId(1);
        assertThat(petType.isNew(), is(false));
    }
}
