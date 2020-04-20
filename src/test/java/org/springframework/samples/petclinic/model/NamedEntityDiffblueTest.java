package org.springframework.samples.petclinic.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;
import org.springframework.samples.petclinic.owner.Pet;

/**
 * Unit tests for org.springframework.samples.petclinic.model.NamedEntity
 *
 * @author Diffblue Cover
 */

public class NamedEntityDiffblueTest {

    @Test
    public void setId() {
        NamedEntity namedEntity = new Pet();
        namedEntity.setName("Bella");
        namedEntity.setId(1);
        assertThat(namedEntity.getName(), is("Bella"));
        assertThat(namedEntity.getId(), is(1));
        assertThat(namedEntity.isNew(), is(false));
    }

    @Test
    public void getNameReturnsBella() {
        NamedEntity namedEntity = new Pet();
        namedEntity.setName("Bella");
        namedEntity.setId(1);
        assertThat(namedEntity.getName(), is("Bella"));
    }

    @Test
    public void getIdReturnsOne() {
        NamedEntity namedEntity = new Pet();
        namedEntity.setName("Bella");
        namedEntity.setId(1);
        assertThat(namedEntity.getId(), is(1));
    }

    @Test
    public void setNameToEntity() {
        NamedEntity namedEntity = new Pet();
        namedEntity.setName("Bella");
        namedEntity.setId(1);
        namedEntity.setName("entity");
        assertThat(namedEntity.getName(), is("entity"));
    }

    @Test
    public void setIdToOne() {
        NamedEntity namedEntity = new Pet();
        namedEntity.setName("Bella");
        namedEntity.setId(1);
        namedEntity.setId(1);
    }

    @Test
    public void isNewReturnsFalse() {
        NamedEntity namedEntity = new Pet();
        namedEntity.setName("Bella");
        namedEntity.setId(1);
        assertThat(namedEntity.isNew(), is(false));
    }
}
