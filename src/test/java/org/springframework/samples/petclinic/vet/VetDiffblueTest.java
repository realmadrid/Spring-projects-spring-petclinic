package org.springframework.samples.petclinic.vet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;

import java.util.HashSet;

import org.junit.Test;

/**
 * Unit tests for org.springframework.samples.petclinic.vet.Vet
 *
 * @author Diffblue Cover
 */

public class VetDiffblueTest {

    @Test
    public void setId() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getFirstName(), is("Anna"));
        assertThat(vet.getLastName(), is("Smith"));
        assertThat(vet.getId(), is(1));
        assertThat(vet.isNew(), is(false));
    }

    @Test
    public void getFirstNameReturnsAnna() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getFirstName(), is("Anna"));
    }

    @Test
    public void getIdReturnsOne() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getId(), is(1));
    }

    @Test
    public void setFirstNameToAnna() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        vet.setFirstName("Anna");
    }

    @Test
    public void setIdToOne() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        vet.setId(1);
    }

    @Test
    public void getLastNameReturnsSmith() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getLastName(), is("Smith"));
    }

    @Test
    public void isNewReturnsFalse() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.isNew(), is(false));
    }

    @Test
    public void setLastNameToSmith() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        vet.setLastName("Smith");
    }

    @Test
    public void getSpecialtiesInternal1() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal10() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(null);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal11() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(-1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal12() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(0);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal13() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName(null);
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal14() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal15() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("bar");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal16() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("foo");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal17() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(null);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal18() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(-1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal19() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(0);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal2() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal20() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName(null);
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal21() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal22() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("bar");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal23() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("foo");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal24() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(null);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal25() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(-1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal26() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(0);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal27() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName(null);
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal28() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal29() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("bar");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal3() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal30() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("foo");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal31() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(null);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal32() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(-1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal33() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(0);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal34() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName(null);
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal35() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal36() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("bar");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal37() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("foo");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal38() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(null);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal39() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(-1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal4() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal40() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(0);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal41() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(null);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal42() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(-1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal43() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(0);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal44() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(null);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal45() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(-1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal46() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(0);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal47() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(null);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal48() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(-1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal49() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(0);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal5() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal50() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(null);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal51() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(-1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal52() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(0);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal6() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal7() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal8() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void getSpecialtiesInternal9() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(1);
        assertThat(vet.getSpecialtiesInternal(), empty());
    }

    @Test
    public void setSpecialtiesInternalSpecialtiesIsEmpty() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        vet.setSpecialtiesInternal(new HashSet<Specialty>());
    }

    @Test
    public void getSpecialties1() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties10() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties11() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("name");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties12() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(null);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties13() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(-1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties14() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(0);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties15() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(2);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties16() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName(null);
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties17() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties18() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("bar");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties19() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("foo");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties2() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties20() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("name");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties21() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(null);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties22() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(-1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties23() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(0);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties24() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(2);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties25() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName(null);
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties26() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties27() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("bar");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties28() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("foo");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties29() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("name");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties3() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties30() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(null);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties31() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(-1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties32() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(0);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties33() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(2);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties34() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName(null);
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties35() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties36() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("bar");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties37() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("foo");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties38() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("name");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties39() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(null);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties4() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties40() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(-1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties41() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(0);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties42() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(2);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties43() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName(null);
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties44() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties45() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("bar");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties46() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("foo");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties47() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("name");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties48() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(null);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties49() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(-1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties5() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties50() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(0);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties51() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(2);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties52() {
        Vet vet = new Vet();
        vet.setFirstName("name");
        vet.setLastName(null);
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties53() {
        Vet vet = new Vet();
        vet.setFirstName("name");
        vet.setLastName("");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties54() {
        Vet vet = new Vet();
        vet.setFirstName("name");
        vet.setLastName("bar");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties55() {
        Vet vet = new Vet();
        vet.setFirstName("name");
        vet.setLastName("foo");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties56() {
        Vet vet = new Vet();
        vet.setFirstName("name");
        vet.setLastName("name");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties57() {
        Vet vet = new Vet();
        vet.setFirstName("name");
        vet.setLastName("Smith");
        vet.setId(null);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties58() {
        Vet vet = new Vet();
        vet.setFirstName("name");
        vet.setLastName("Smith");
        vet.setId(-1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties59() {
        Vet vet = new Vet();
        vet.setFirstName("name");
        vet.setLastName("Smith");
        vet.setId(0);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties6() {
        Vet vet = new Vet();
        vet.setFirstName("name");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties60() {
        Vet vet = new Vet();
        vet.setFirstName("name");
        vet.setLastName("Smith");
        vet.setId(2);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties61() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(null);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties62() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(-1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties63() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(0);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties64() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(2);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties65() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(null);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties66() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(-1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties67() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(0);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties68() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(2);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties69() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(null);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties7() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties70() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(-1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties71() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(0);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties72() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(2);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties73() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(null);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties74() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(-1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties75() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(0);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties76() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(2);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties77() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("name");
        vet.setId(null);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties78() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("name");
        vet.setId(-1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties79() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("name");
        vet.setId(0);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties8() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties80() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("name");
        vet.setId(2);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getSpecialties9() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getNrOfSpecialties1() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties10() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(null);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties11() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(-1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties12() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(0);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties13() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName(null);
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties14() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties15() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("bar");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties16() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("foo");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties17() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(null);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties18() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(-1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties19() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(0);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties2() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties20() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName(null);
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties21() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties22() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("bar");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties23() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("foo");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties24() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(null);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties25() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(-1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties26() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(0);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties27() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName(null);
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties28() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties29() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("bar");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties3() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties30() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("foo");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties31() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(null);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties32() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(-1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties33() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(0);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties34() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName(null);
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties35() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties36() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("bar");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties37() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("foo");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties38() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(null);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties39() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(-1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties4() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties40() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(0);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties41() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(null);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties42() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(-1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties43() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(0);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties44() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(null);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties45() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(-1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties46() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(0);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties47() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(null);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties48() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(-1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties49() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(0);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties5() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties50() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(null);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties51() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(-1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties52() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(0);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties6() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties7() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties8() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void getNrOfSpecialties9() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void addSpecialty1() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty10() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty100() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty101() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty102() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty103() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty104() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty105() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty106() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty107() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty108() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty109() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty11() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty110() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty111() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty112() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty113() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty114() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty115() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty116() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty117() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty118() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(null);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty119() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty12() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty120() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty121() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty122() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty123() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty124() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty125() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty126() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(-1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty127() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty128() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty129() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty13() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty130() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty131() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty132() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty133() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty134() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(0);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty135() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty136() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty137() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty138() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty139() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty14() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty140() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty141() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty142() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty143() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty144() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty145() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty146() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty147() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty148() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty149() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty15() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty150() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty151() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty152() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty153() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty154() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName(null);
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty155() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName(null);
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty156() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName(null);
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty157() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName(null);
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty158() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty159() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty16() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty160() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty161() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty162() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty163() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty164() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty165() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty166() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty167() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty168() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty169() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty17() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty170() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty171() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty172() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty173() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty174() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty175() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty176() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("bar");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty177() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("bar");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty178() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("bar");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty179() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("bar");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty18() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty180() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty181() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty182() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty183() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty184() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty185() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty186() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty187() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("foo");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty188() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("foo");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty189() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("foo");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty19() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty190() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("foo");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty191() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty192() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty193() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty194() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty195() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty196() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty197() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty198() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(null);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty199() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty2() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty20() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty200() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty201() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty202() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty203() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty204() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty205() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty206() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(-1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty207() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty208() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty209() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty21() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty210() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty211() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty212() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty213() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty214() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(0);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty215() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty216() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty217() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty218() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty219() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty22() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty220() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty221() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty222() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty223() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty224() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty225() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty226() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty227() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty228() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty229() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty23() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty230() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty231() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty232() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty233() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty234() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName(null);
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty235() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName(null);
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty236() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName(null);
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty237() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName(null);
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty238() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty239() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty24() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty240() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty241() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty242() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty243() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty244() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty245() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty246() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty247() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty248() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty249() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty25() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty250() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty251() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty252() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty253() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty254() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty255() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty256() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("bar");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty257() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("bar");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty258() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("bar");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty259() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("bar");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty26() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty260() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty261() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty262() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty263() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty264() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty265() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty266() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty267() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("foo");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty268() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("foo");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty269() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("foo");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty27() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty270() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("foo");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty271() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty272() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty273() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty274() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty275() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty276() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty277() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty278() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(null);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty279() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty28() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty280() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty281() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty282() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty283() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty284() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty285() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty286() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(-1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty287() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty288() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty289() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty29() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty290() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty291() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty292() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty293() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty294() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(0);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty295() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty296() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty297() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty298() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty299() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty3() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty30() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty300() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty301() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty302() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty303() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty304() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty305() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty306() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty307() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty308() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty309() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty31() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty310() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty311() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty312() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty313() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty314() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName(null);
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty315() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName(null);
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty316() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName(null);
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty317() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName(null);
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty318() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty319() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty32() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty320() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty321() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty322() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty323() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty324() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty325() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty326() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty327() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty328() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty329() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty33() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty330() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty331() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty332() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty333() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty334() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty335() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty336() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("bar");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty337() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("bar");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty338() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("bar");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty339() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("bar");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty34() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty340() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty341() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty342() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty343() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty344() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty345() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty346() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty347() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("foo");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty348() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("foo");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty349() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("foo");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty35() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty350() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("foo");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty351() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty352() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty353() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty354() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty355() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty356() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty357() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty358() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(null);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty359() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty36() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty360() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty361() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty362() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty363() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty364() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty365() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty366() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(-1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty367() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty368() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty369() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty37() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty370() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty371() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty372() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty373() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty374() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(0);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty375() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty376() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty377() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty378() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty379() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty38() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty380() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty381() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty382() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty383() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty384() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty385() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty386() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty387() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty388() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty389() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty39() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty390() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty391() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty392() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty393() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty394() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName(null);
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty395() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName(null);
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty396() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName(null);
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty397() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName(null);
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty398() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty399() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty4() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty40() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty400() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty401() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty402() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty403() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty404() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty405() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty406() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty407() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty408() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty409() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty41() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty410() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty411() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty412() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty413() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty414() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty415() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty416() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("bar");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty417() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("bar");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty418() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("bar");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty419() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("bar");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty42() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty420() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty421() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty422() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty423() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty424() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty425() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty426() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty427() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("foo");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty428() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("foo");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty429() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("foo");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty43() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty430() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("foo");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty431() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty432() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty433() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty434() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty435() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty436() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty437() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty438() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(null);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty439() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty44() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty440() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty441() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty442() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty443() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty444() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty445() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty446() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(-1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty447() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty448() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty449() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty45() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty450() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty451() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty452() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty453() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty454() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(0);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty455() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty456() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty457() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty458() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty459() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty46() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty460() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty461() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty462() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty463() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty464() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty465() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty466() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty467() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty468() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty469() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty47() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty470() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty471() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty472() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty473() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty474() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(null);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty475() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty476() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty477() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty478() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty479() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty48() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty480() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty481() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty482() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(-1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty483() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty484() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty485() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty486() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty487() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty488() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty489() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty49() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty490() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(0);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty491() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty492() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty493() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty494() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty495() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty496() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty497() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty498() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty499() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty5() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty50() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty500() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty501() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty502() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty503() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty504() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty505() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty506() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty507() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty508() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty509() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty51() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty510() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(null);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty511() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty512() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty513() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty514() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty515() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty516() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty517() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty518() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(-1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty519() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty52() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty520() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty521() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty522() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty523() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty524() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty525() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty526() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(0);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialty527() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty528() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty529() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty53() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty530() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty531() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty532() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty533() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty534() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty535() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty536() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty537() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty538() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty539() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty54() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty540() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty541() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty542() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty543() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty544() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty545() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty55() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty56() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty57() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty58() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty59() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty6() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty60() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty61() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty62() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty63() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty64() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty65() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty66() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty67() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty68() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty69() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty7() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty70() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty71() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty72() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty73() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty74() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty75() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty76() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty77() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty78() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty79() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty8() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty80() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty81() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty82() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty83() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty84() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty85() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty86() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty87() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty88() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty89() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName(null);
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty9() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("foo");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty90() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty91() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty92() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("foo");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty93() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(null);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty94() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(-1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty95() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(0);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty96() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(null);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty97() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(-1);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty98() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(0);
        Specialty specialty = new Specialty();
        specialty.setName("/bin/bash");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }

    @Test
    public void addSpecialty99() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("bar");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialtySpecialtyIsNull1() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialtySpecialtyIsNull2() {
        Vet vet = new Vet();
        vet.setFirstName(null);
        vet.setLastName("Smith");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialtySpecialtyIsNull3() {
        Vet vet = new Vet();
        vet.setFirstName("");
        vet.setLastName("Smith");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialtySpecialtyIsNull4() {
        Vet vet = new Vet();
        vet.setFirstName("bar");
        vet.setLastName("Smith");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialtySpecialtyIsNull5() {
        Vet vet = new Vet();
        vet.setFirstName("foo");
        vet.setLastName("Smith");
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialtySpecialtyIsNull6() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName(null);
        vet.setId(1);
        vet.addSpecialty(null);
    }

    @Test
    public void addSpecialtySpecialtyIsNull7() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("");
        vet.setId(1);
        vet.addSpecialty(null);
    }
}
