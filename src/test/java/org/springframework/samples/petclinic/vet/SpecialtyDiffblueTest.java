package org.springframework.samples.petclinic.vet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for org.springframework.samples.petclinic.vet.Specialty
 *
 * @author Diffblue Cover
 */

public class SpecialtyDiffblueTest {

    @Test
    public void setId() {
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        assertThat(specialty.getName(), is("/bin/bash"));
        assertThat(specialty.getId(), is(1));
        assertThat(specialty.isNew(), is(false));
    }

    @Test
    public void getName() {
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        assertThat(specialty.getName(), is("/bin/bash"));
    }

    @Test
    public void getIdReturnsOne() {
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        assertThat(specialty.getId(), is(1));
    }

    @Test
    public void setNameToEntity() {
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        specialty.setName("entity");
        assertThat(specialty.getName(), is("entity"));
    }

    @Test
    public void setIdToOne() {
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        specialty.setId(1);
    }

    @Test
    public void isNewReturnsFalse() {
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        assertThat(specialty.isNew(), is(false));
    }
}
