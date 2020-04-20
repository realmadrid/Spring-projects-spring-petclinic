package org.springframework.samples.petclinic.model;

import static org.hamcrest.MatcherAssert.assertThat;
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
    public void setId() {
        Person person = new Owner();
        person.setFirstName("Anna");
        person.setLastName("Smith");
        person.setId(1);
        assertThat(person.getFirstName(), is("Anna"));
        assertThat(person.getLastName(), is("Smith"));
        assertThat(person.getId(), is(1));
        assertThat(person.isNew(), is(false));
    }

    @Test
    public void getFirstNameReturnsAnna() {
        Person person = new Owner();
        person.setFirstName("Anna");
        person.setLastName("Smith");
        person.setId(1);
        assertThat(person.getFirstName(), is("Anna"));
    }

    @Test
    public void getIdReturnsOne() {
        Person person = new Owner();
        person.setFirstName("Anna");
        person.setLastName("Smith");
        person.setId(1);
        assertThat(person.getId(), is(1));
    }

    @Test
    public void setFirstNameToAnna() {
        Person person = new Owner();
        person.setFirstName("Anna");
        person.setLastName("Smith");
        person.setId(1);
        person.setFirstName("Anna");
    }

    @Test
    public void setIdToOne() {
        Person person = new Owner();
        person.setFirstName("Anna");
        person.setLastName("Smith");
        person.setId(1);
        person.setId(1);
    }

    @Test
    public void getLastNameReturnsSmith() {
        Person person = new Owner();
        person.setFirstName("Anna");
        person.setLastName("Smith");
        person.setId(1);
        assertThat(person.getLastName(), is("Smith"));
    }

    @Test
    public void isNewReturnsFalse() {
        Person person = new Owner();
        person.setFirstName("Anna");
        person.setLastName("Smith");
        person.setId(1);
        assertThat(person.isNew(), is(false));
    }

    @Test
    public void setLastNameToSmith() {
        Person person = new Owner();
        person.setFirstName("Anna");
        person.setLastName("Smith");
        person.setId(1);
        person.setLastName("Smith");
    }
}
