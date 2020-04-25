package org.springframework.samples.petclinic.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;
import org.springframework.samples.petclinic.owner.Pet;

/**
 * Unit tests for org.springframework.samples.petclinic.model.BaseEntity
 *
 * @author Diffblue Cover
 */

public class BaseEntityDiffblueTest {

    @Test
    public void setId() {
        BaseEntity baseEntity = new Pet();
        baseEntity.setId(1);
        assertThat(baseEntity.isNew(), is(false));
    }

    @Test
    public void getIdReturnsOne() {
        BaseEntity baseEntity = new Pet();
        baseEntity.setId(1);
        assertThat(baseEntity.getId(), is(1));
    }

    @Test
    public void isNewReturnsFalse() {
        BaseEntity baseEntity = new Pet();
        baseEntity.setId(1);
        assertThat(baseEntity.isNew(), is(false));
    }

    @Test
    public void isNewReturnsTrue() {
        BaseEntity baseEntity = new Pet();
        baseEntity.setId(null);
        assertThat(baseEntity.isNew(), is(true));
    }
}
