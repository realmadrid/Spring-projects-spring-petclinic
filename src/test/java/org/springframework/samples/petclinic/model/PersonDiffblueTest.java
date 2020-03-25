package org.springframework.samples.petclinic.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;
import org.springframework.samples.petclinic.owner.Owner;

/**
 * Unit tests for org.springframework.samples.petclinic.model.Person
 *
 * @author Diffblue Cover
 */

public class PersonDiffblueTest {

    @Test
    public void getters() {
        assertThat(new Owner().getFirstName(), is(nullValue()));
        assertThat(new Owner().getLastName(), is(nullValue()));
    }

    @Test
    public void setFirstNameToAnna() {
        Person person = new Owner();
        person.setFirstName("Anna");
        assertThat(person.getFirstName(), is("Anna"));
    }

    @Test
    public void setLastNameToSmith() {
        Person person = new Owner();
        person.setLastName("Smith");
        assertThat(person.getLastName(), is("Smith"));
    }
}
