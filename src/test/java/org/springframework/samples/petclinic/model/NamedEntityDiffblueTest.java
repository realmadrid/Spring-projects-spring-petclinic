package org.springframework.samples.petclinic.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
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
    public void getNameReturnsNull() {
        assertThat(new Pet().getName(), is(nullValue()));
    }

    @Test
    public void setName() {
        NamedEntity namedEntity = new Pet();
        namedEntity.setName("/bin/bash");
        assertThat(namedEntity.getName(), is("/bin/bash"));
    }
}
