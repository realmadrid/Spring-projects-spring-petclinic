package org.springframework.samples.petclinic.owner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.time.LocalDate;
import java.util.HashSet;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit tests for org.springframework.samples.petclinic.owner.Owner
 *
 * @author Diffblue Cover
 */

public class OwnerDiffblueTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void setId() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getAddress(), is("280 Broadway"));
        assertThat(owner.getCity(), is("New York"));
        assertThat(owner.getTelephone(), is("12345"));
        assertThat(owner.getFirstName(), is("Anna"));
        assertThat(owner.getLastName(), is("Smith"));
        assertThat(owner.getId(), is(1));
        assertThat(owner.isNew(), is(false));
    }

    @Test
    public void getFirstNameReturnsAnna() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getFirstName(), is("Anna"));
    }

    @Test
    public void getIdReturnsOne() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getId(), is(1));
    }

    @Test
    public void setFirstNameToAnna() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        owner.setFirstName("Anna");
    }

    @Test
    public void setIdToOne() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        owner.setId(1);
    }

    @Test
    public void getLastNameReturnsSmith() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getLastName(), is("Smith"));
    }

    @Test
    public void isNewReturnsFalse() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.isNew(), is(false));
    }

    @Test
    public void setLastNameToSmith() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        owner.setLastName("Smith");
    }

    @Test
    public void getAddress() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getAddress(), is("280 Broadway"));
    }

    @Test
    public void setAddress() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        owner.setAddress("280 Broadway");
    }

    @Test
    public void getCity() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getCity(), is("New York"));
    }

    @Test
    public void setCity() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        owner.setCity("New York");
    }

    @Test
    public void getTelephone() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getTelephone(), is("12345"));
    }

    @Test
    public void setTelephone() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        owner.setTelephone("12345");
    }

    @Test
    public void getPetsInternal1() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal10() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal11() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal12() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal13() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal14() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal15() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal16() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal17() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal18() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal19() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal2() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal20() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal21() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal22() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal23() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal24() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal3() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal4() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal5() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal6() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal7() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal8() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void getPetsInternal9() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPetsInternal(), empty());
    }

    @Test
    public void setPetsInternalPetsIsEmpty() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        owner.setPetsInternal(new HashSet<Pet>());
    }

    @Test
    public void getPets1() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets10() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets11() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("name");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets12() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets13() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets14() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets15() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets16() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("name");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets17() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets18() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets19() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets2() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets20() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets21() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("name");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets22() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets23() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets24() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets25() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets26() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("name");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets27() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets28() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets29() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets3() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets30() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(2);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets31() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets32() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets33() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets34() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets35() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("name");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets36() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets37() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets38() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets39() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets4() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets40() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("name");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets41() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets42() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets43() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets44() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets45() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("name");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets46() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets47() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets48() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets49() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets5() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets50() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("name");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets51() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets52() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets6() {
        Owner owner = new Owner();
        owner.setAddress("name");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets7() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets8() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void getPets9() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPets(), empty());
    }

    @Test
    public void addPet1() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet10() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet100() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1000() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1001() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1002() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1003() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1004() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1005() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1006() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1007() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1008() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1009() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet101() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1010() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1011() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1012() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1013() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1014() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1015() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1016() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1017() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1018() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1019() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet102() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1020() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1021() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1022() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1023() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1024() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1025() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1026() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1027() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1028() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1029() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet103() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1030() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1031() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1032() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1033() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1034() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1035() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1036() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1037() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1038() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1039() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet104() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1040() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1041() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1042() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1043() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1044() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1045() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1046() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1047() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1048() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1049() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet105() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1050() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1051() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1052() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1053() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1054() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1055() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1056() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1057() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1058() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1059() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet106() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1060() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1061() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1062() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1063() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1064() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1065() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1066() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1067() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1068() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1069() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet107() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1070() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1071() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1072() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1073() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1074() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1075() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1076() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1077() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1078() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1079() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet108() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1080() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1081() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1082() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1083() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1084() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1085() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1086() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1087() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1088() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1089() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet109() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1090() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1091() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1092() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1093() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1094() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1095() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1096() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1097() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1098() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1099() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet11() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet110() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1100() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1101() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1102() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1103() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1104() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1105() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1106() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1107() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1108() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1109() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet111() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1110() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1111() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1112() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1113() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1114() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1115() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1116() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1117() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1118() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1119() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet112() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1120() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1121() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1122() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1123() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1124() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1125() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1126() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1127() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1128() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1129() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet113() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1130() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1131() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1132() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1133() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1134() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1135() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1136() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1137() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet1138() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet114() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet115() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet116() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet117() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet118() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet119() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet12() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet120() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet121() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet122() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet123() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet124() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet125() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet126() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet127() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet128() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet129() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet13() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet130() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet131() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet132() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet133() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet134() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet135() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet136() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet137() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet138() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet139() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet14() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet140() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet141() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet142() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet143() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet144() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet145() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet146() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet147() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet148() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet149() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet15() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet150() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet151() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet152() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet153() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet154() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet155() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet156() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet157() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet158() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet159() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet16() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet160() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet161() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet162() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet163() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet164() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet165() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet166() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet167() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet168() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet169() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet17() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet170() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet171() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet172() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet173() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet174() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet175() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet176() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet177() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet178() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet179() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet18() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet180() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet181() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet182() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet183() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet184() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet185() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet186() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet187() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet188() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet189() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet19() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet190() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet191() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet192() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet193() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet194() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet195() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet196() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet197() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet198() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet199() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet2() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet20() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet200() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet201() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet202() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet203() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet204() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet205() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet206() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet207() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet208() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet209() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet21() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet210() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet211() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet212() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet213() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet214() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet215() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet216() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet217() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet218() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet219() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet22() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet220() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet221() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet222() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet223() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet224() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet225() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet226() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet227() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet228() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet229() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet23() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet230() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet231() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet232() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet233() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet234() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet235() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet236() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet237() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet238() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet239() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet24() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet240() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet241() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet242() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet243() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet244() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet245() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet246() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet247() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet248() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet249() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet25() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet250() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet251() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet252() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet253() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet254() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet255() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet256() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet257() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet258() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet259() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet26() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet260() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet261() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet262() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet263() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet264() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet265() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet266() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet267() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet268() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet269() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet27() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet270() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet271() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet272() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet273() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet274() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet275() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet276() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet277() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet278() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet279() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet28() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet280() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet281() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet282() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet283() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet284() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet285() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet286() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet287() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet288() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet289() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet29() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet290() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet291() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet292() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet293() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet294() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet295() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet296() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet297() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet298() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet299() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet3() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet30() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet300() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet301() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet302() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet303() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet304() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet305() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet306() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet307() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet308() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet309() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet31() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet310() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet311() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet312() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet313() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet314() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet315() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet316() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet317() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet318() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet319() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet32() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet320() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet321() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet322() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet323() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet324() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet325() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet326() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet327() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet328() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet329() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet33() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet330() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet331() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet332() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet333() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet334() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet335() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet336() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet337() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet338() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet339() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet34() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet340() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet341() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet342() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet343() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet344() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet345() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet346() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet347() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet348() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet349() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet35() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet350() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet351() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet352() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet353() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet354() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet355() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet356() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet357() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet358() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet359() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet36() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet360() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet361() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet362() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet363() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet364() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet365() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet366() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet367() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet368() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet369() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet37() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet370() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet371() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet372() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet373() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet374() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet375() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet376() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet377() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet378() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet379() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet38() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet380() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet381() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet382() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet383() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet384() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet385() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet386() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet387() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet388() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet389() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet39() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet390() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet391() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet392() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet393() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet394() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet395() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet396() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet397() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet398() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet399() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet4() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet40() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet400() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet401() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet402() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet403() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet404() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet405() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet406() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet407() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet408() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet409() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet41() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet410() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet411() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet412() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet413() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet414() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet415() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet416() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet417() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet418() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet419() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet42() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet420() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet421() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet422() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet423() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet424() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet425() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet426() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet427() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet428() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet429() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet43() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet430() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet431() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet432() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet433() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet434() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet435() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet436() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet437() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet438() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet439() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet44() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet440() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet441() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet442() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet443() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet444() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet445() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet446() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet447() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet448() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet449() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet45() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet450() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet451() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet452() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet453() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet454() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet455() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet456() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet457() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet458() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet459() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet46() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet460() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet461() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet462() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet463() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet464() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet465() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet466() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet467() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet468() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet469() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet47() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet470() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet471() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet472() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet473() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet474() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet475() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet476() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet477() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet478() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet479() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet48() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet480() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet481() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet482() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet483() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet484() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet485() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet486() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet487() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet488() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet489() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet49() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet490() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet491() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet492() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet493() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet494() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet495() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet496() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet497() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet498() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet499() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet5() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet50() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet500() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet501() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet502() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet503() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet504() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet505() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet506() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet507() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet508() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet509() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet51() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet510() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet511() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet512() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet513() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet514() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet515() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet516() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet517() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet518() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet519() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet52() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet520() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet521() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet522() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet523() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet524() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet525() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet526() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet527() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet528() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet529() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet53() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet530() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet531() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet532() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet533() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet534() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet535() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet536() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet537() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet538() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet539() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet54() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet540() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet541() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet542() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet543() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet544() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet545() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet546() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet547() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet548() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet549() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet55() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet550() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet551() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet552() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet553() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet554() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet555() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet556() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet557() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet558() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet559() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet56() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet560() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet561() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet562() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet563() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet564() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet565() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet566() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet567() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet568() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet569() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet57() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet570() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet571() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet572() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet573() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet574() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet575() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet576() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet577() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet578() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet579() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet58() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet580() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet581() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet582() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet583() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet584() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet585() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet586() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet587() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet588() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet589() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet59() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet590() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet591() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet592() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet593() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet594() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet595() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet596() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet597() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet598() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet599() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet6() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet60() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet600() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet601() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet602() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet603() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet604() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet605() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet606() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet607() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet608() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet609() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet61() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet610() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet611() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet612() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet613() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet614() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet615() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet616() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet617() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet618() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet619() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet62() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet620() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet621() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet622() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet623() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet624() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet625() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet626() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet627() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet628() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet629() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet63() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet630() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet631() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet632() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet633() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet634() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet635() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet636() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet637() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet638() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet639() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet64() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet640() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet641() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet642() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet643() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet644() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet645() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet646() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet647() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet648() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet649() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet65() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet650() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet651() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet652() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet653() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet654() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet655() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet656() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet657() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet658() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet659() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet66() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet660() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet661() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet662() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet663() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet664() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet665() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet666() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet667() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet668() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet669() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet67() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet670() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet671() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet672() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet673() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet674() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet675() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet676() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet677() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet678() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet679() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet68() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet680() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet681() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet682() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet683() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet684() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet685() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet686() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet687() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet688() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet689() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet69() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet690() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet691() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet692() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet693() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet694() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet695() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet696() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet697() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet698() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet699() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet7() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet70() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet700() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet701() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet702() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet703() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet704() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet705() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet706() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet707() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet708() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet709() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet71() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet710() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet711() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet712() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet713() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet714() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet715() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet716() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet717() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet718() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet719() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet72() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet720() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet721() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet722() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet723() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet724() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet725() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet726() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet727() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet728() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet729() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet73() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet730() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet731() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet732() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet733() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet734() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet735() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet736() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet737() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet738() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet739() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet74() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet740() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet741() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet742() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet743() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet744() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet745() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet746() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet747() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet748() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet749() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet75() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet750() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet751() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet752() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet753() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet754() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet755() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet756() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet757() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet758() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet759() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet76() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet760() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet761() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet762() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet763() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet764() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet765() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet766() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet767() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet768() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet769() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet77() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet770() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet771() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet772() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet773() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet774() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet775() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet776() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet777() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet778() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet779() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet78() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet780() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet781() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet782() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet783() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet784() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet785() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet786() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet787() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet788() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet789() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet79() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet790() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet791() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet792() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet793() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet794() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet795() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet796() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet797() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet798() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet799() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet8() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet80() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet800() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet801() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet802() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet803() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet804() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet805() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet806() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet807() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet808() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet809() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet81() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet810() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet811() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet812() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet813() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet814() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet815() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet816() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet817() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet818() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet819() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet82() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet820() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet821() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet822() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet823() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet824() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet825() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet826() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet827() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet828() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet829() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet83() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet830() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet831() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet832() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet833() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet834() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet835() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet836() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet837() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet838() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet839() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet84() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet840() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet841() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet842() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet843() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet844() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet845() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet846() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet847() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet848() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet849() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet85() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet850() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet851() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet852() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet853() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet854() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet855() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet856() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet857() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet858() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet859() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet86() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet860() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet861() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet862() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet863() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet864() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet865() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet866() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet867() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet868() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet869() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet87() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet870() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet871() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet872() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet873() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet874() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet875() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet876() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet877() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet878() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet879() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet88() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet880() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet881() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet882() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet883() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet884() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet885() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet886() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet887() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet888() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet889() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet89() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet890() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet891() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet892() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet893() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet894() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet895() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet896() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet897() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet898() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet899() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet9() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet90() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet900() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet901() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet902() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet903() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet904() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet905() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet906() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet907() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet908() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet909() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet91() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet910() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet911() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet912() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet913() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet914() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet915() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet916() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet917() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet918() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet919() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet92() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet920() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet921() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet922() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet923() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet924() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet925() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet926() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet927() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet928() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet929() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet93() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet930() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet931() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet932() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet933() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet934() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet935() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet936() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet937() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet938() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet939() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet94() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet940() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet941() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet942() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet943() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet944() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet945() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet946() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet947() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet948() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet949() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet95() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet950() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet951() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet952() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet953() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet954() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet955() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet956() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet957() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet958() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet959() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet96() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet960() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet961() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet962() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet963() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet964() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet965() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet966() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet967() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet968() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet969() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet97() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet970() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet971() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet972() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet973() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet974() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet975() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet976() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet977() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet978() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet979() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet98() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet980() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet981() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet982() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet983() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet984() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet985() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("foo");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet986() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(-1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet987() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(0);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet988() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet989() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("bar");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet99() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet990() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("foo");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet991() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(-1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet992() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(0);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet993() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet994() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("bar");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet995() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("foo");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet996() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(-1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet997() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(0);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet998() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void addPet999() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("bar");
        owner.setId(1);
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        owner.addPet(pet);
        assertThat(pet.getOwner(), sameInstance(owner));
    }

    @Test
    public void getPet1() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet10() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet100() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet101() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet102() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet103() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet104() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet105() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet106() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet107() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet108() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet109() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet11() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet110() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet111() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet112() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet113() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet114() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet115() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet116() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet117() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet118() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet119() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet12() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet120() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet121() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet122() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet123() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet124() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet125() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet126() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet127() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet128() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet129() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet13() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet130() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet131() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet132() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet133() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet134() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet135() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet136() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet137() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet138() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet139() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet14() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet140() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet141() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet142() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet143() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet144() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet145() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet146() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet147() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet148() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet149() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet15() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet150() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet151() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet152() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet153() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet154() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet155() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet156() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet157() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet158() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet159() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet16() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet160() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet161() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet162() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet163() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet164() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet165() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet166() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet167() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet168() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet169() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet17() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet170() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet171() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet172() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet173() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet174() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet175() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet176() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet177() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet178() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet179() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet18() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet180() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet181() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet182() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet183() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet184() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet185() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet186() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet187() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet188() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet189() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet19() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet190() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet191() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet192() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet193() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet194() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet195() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet196() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet197() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet198() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet199() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet20() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet200() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet201() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet202() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet203() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet204() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet205() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet206() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet207() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet208() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet209() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet21() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet210() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet211() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet212() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet213() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet214() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet215() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet216() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet217() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet218() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet219() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet22() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet220() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet221() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet222() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet223() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet224() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet225() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet226() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet227() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet228() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet229() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet23() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet230() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet231() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet232() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet233() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet234() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet235() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet236() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet237() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet238() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet239() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet24() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet240() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet241() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet242() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet243() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet244() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet245() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet246() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet247() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet248() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet249() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet25() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet250() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet251() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet252() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet253() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet254() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet255() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet256() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet257() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet258() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet259() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet260() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet261() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet262() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet263() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet264() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet265() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet266() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet267() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet268() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet269() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet270() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet271() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet272() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet273() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet274() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet275() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet276() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet277() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet278() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet279() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet280() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet281() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet282() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet283() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet284() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet285() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet286() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet287() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet288() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet289() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet290() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet291() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet292() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet293() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet294() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet295() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet296() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet297() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet298() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet299() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet3() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet300() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet301() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet302() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet303() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet304() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet305() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet306() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet307() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet308() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet309() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet310() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet311() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet312() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet313() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet314() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet315() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet316() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet317() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet318() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet319() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet320() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet321() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet322() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet323() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet324() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet325() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet326() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet327() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet328() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet329() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet330() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet331() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet332() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet333() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet334() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet335() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet336() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet337() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet338() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet339() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet340() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet341() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet342() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet343() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet344() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet345() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet346() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet347() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet348() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet349() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet350() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet351() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet352() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet353() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet354() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet355() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet356() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet357() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet358() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet359() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet360() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet4() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet49() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet5() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet50() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet51() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet52() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet53() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet54() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet55() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet56() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet57() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet58() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet59() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet6() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet60() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet61() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet62() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet63() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet64() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet65() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet66() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet67() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet68() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet69() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet7() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet70() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet71() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet72() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet73() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet74() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet75() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet76() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet77() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet78() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet79() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet8() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet80() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet81() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet82() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet83() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet84() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet85() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet86() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet87() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet88() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet89() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet9() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet90() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet91() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null), is(nullValue()));
    }

    @Test
    public void getPet92() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPet93() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPet94() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPet95() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet96() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet97() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet98() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPet99() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella"), is(nullValue()));
    }

    @Test
    public void getPetNameIsBar1() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar"), is(nullValue()));
    }

    @Test
    public void getPetNameIsEmpty1() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(""), is(nullValue()));
    }

    @Test
    public void getPetNameIsFoo1() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo"), is(nullValue()));
    }

    @Test
    public void getPetNameIsNullThrowsNullPointerException1() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        String name = null;
        thrown.expect(NullPointerException.class);
        owner.getPet(name);
    }

    @Test
    public void getPet2() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet26() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet27() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet28() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet29() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet30() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet31() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet32() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet33() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet34() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet35() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet36() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet361() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet362() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet363() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet364() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet365() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet366() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet367() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet368() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet369() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet37() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet370() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet371() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet372() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet373() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet374() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet375() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet376() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet377() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet378() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet379() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet38() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet380() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet381() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet382() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet383() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet384() {
        Owner owner = new Owner();
        owner.setAddress(null);
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet385() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet386() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet387() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet388() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet389() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet39() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet390() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet391() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet392() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet393() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet394() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet395() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet396() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet397() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet398() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet399() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet40() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet400() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet401() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet402() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet403() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet404() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet405() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet406() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet407() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet408() {
        Owner owner = new Owner();
        owner.setAddress("");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet409() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet41() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet410() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet411() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet412() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet413() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet414() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet415() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet416() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet417() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet418() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet419() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet42() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet420() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet421() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet422() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet423() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet424() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet425() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet426() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet427() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet428() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet429() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet43() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet430() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet431() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet432() {
        Owner owner = new Owner();
        owner.setAddress("bar");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet433() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet434() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet435() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet436() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet437() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet438() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet439() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet44() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet440() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet441() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet442() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet443() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet444() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet445() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet446() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet447() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet448() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet449() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet45() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet450() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet451() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet452() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet453() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet454() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet455() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet456() {
        Owner owner = new Owner();
        owner.setAddress("foo");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet457() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet458() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet459() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet46() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet460() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet461() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet462() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet463() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet464() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet465() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet466() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet467() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet468() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet469() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet47() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet470() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet471() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet472() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet473() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet474() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet475() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet476() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity(null);
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet477() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet478() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet479() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet48() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet480() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet481() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet482() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet483() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet484() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet485() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet486() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet487() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet488() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet489() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet490() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet491() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet492() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet493() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet494() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet495() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet496() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet497() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet498() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet499() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet500() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet501() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet502() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet503() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet504() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet505() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet506() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet507() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet508() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet509() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet510() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet511() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet512() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet513() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet514() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet515() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet516() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("bar");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet517() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet518() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet519() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet520() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet521() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet522() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet523() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet524() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet525() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet526() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet527() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet528() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet529() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet530() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet531() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet532() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet533() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet534() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet535() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet536() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("foo");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet537() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet538() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet539() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet540() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet541() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet542() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet543() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet544() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet545() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet546() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet547() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet548() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet549() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet550() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet551() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet552() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone(null);
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet553() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet554() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet555() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet556() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet557() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet558() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet559() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet560() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet561() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet562() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet563() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet564() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet565() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet566() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet567() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet568() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet569() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet570() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet571() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet572() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet573() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet574() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet575() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet576() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet577() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet578() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet579() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet580() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet581() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet582() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet583() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet584() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("bar");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet585() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet586() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet587() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet588() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet589() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet590() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet591() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet592() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet593() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet594() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet595() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet596() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet597() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet598() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet599() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet600() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("foo");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet601() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet602() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet603() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet604() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet605() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet606() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet607() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet608() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet609() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet610() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet611() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet612() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName(null);
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet613() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet614() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet615() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet616() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet617() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet618() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet619() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet620() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet621() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet622() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet623() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet624() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet625() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet626() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet627() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet628() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet629() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet630() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet631() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet632() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet633() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet634() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet635() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet636() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("bar");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet637() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet638() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet639() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet640() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet641() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet642() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet643() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet644() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet645() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet646() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet647() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet648() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("foo");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet649() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet650() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet651() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet652() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet653() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet654() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet655() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet656() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName(null);
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet657() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet658() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet659() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet660() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet661() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet662() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet663() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet664() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet665() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet666() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet667() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet668() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet669() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet670() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet671() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet672() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("bar");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet673() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(null);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet674() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet675() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(0);
        assertThat(owner.getPet("Bella", false), is(nullValue()));
    }

    @Test
    public void getPet676() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet677() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet678() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet679() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet680() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("foo");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet681() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet682() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet683() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet684() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet685() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(null);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet686() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet687() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet688() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet689() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet690() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(-1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPet691() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet(null, false), is(nullValue()));
    }

    @Test
    public void getPet692() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPet693() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPet694() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPet695() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(0);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPetIgnoreNewIsTrue1() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("Bella", true), is(nullValue()));
    }

    @Test
    public void getPetIgnoreNewIsTrue2() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet(null, true), is(nullValue()));
    }

    @Test
    public void getPetNameIsBar2() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", false), is(nullValue()));
    }

    @Test
    public void getPetNameIsBar3() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("bar", true), is(nullValue()));
    }

    @Test
    public void getPetNameIsEmpty2() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", false), is(nullValue()));
    }

    @Test
    public void getPetNameIsEmpty3() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("", true), is(nullValue()));
    }

    @Test
    public void getPetNameIsFoo2() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", false), is(nullValue()));
    }

    @Test
    public void getPetNameIsFoo3() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        assertThat(owner.getPet("foo", true), is(nullValue()));
    }

    @Test
    public void getPetNameIsNullThrowsNullPointerException2() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        String name = null;
        thrown.expect(NullPointerException.class);
        owner.getPet(name, false);
    }
}
