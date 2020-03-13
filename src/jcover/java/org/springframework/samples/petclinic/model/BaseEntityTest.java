package org.springframework.samples.petclinic.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;
import org.springframework.samples.petclinic.owner.Pet;

/**
 * Unit tests for org.springframework.samples.petclinic.model.BaseEntity
 *
 * @author Diffblue Cover
 */

public class BaseEntityTest {

    @Test
    public void getters() {
        assertThat(new Pet().getId(), is(nullValue()));
        assertThat(new Pet().isNew(), is(true));
    }

    @Test
    public void setIdToOne() {
        BaseEntity baseEntity = new Pet();
        baseEntity.setId(1);
        assertThat(baseEntity.getId(), is(1));
        assertThat(baseEntity.isNew(), is(false));
    }
}
