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
        assertThat(namedEntity.isNew(), is(false));
    }

    @Test
    public void getNameReturnsBella() {
        NamedEntity namedEntity = new Pet();
        namedEntity.setName("Bella");
        namedEntity.setId(1);
        assertThat(namedEntity.getName(), is("Bella"));
    }
}
