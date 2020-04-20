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
    public void setSpecialtiesInternalSpecialtiesIsEmpty() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        vet.setSpecialtiesInternal(new HashSet<Specialty>());
    }

    @Test
    public void getSpecialtiesReturnsEmpty() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getSpecialties(), empty());
    }

    @Test
    public void getNrOfSpecialtiesReturnsZero() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        assertThat(vet.getNrOfSpecialties(), is(0));
    }

    @Test
    public void addSpecialty() {
        Vet vet = new Vet();
        vet.setFirstName("Anna");
        vet.setLastName("Smith");
        vet.setId(1);
        Specialty specialty = new Specialty();
        specialty.setName("bar");
        specialty.setId(1);
        vet.addSpecialty(specialty);
    }
}
