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
    public void addSpecialty() {
        new Vet().addSpecialty(new Specialty());
    }

    @Test
    public void getNrOfSpecialtiesReturnsZero() {
        assertThat(new Vet().getNrOfSpecialties(), is(0));
    }

    @Test
    public void getSpecialtiesReturnsEmpty() {
        assertThat(new Vet().getSpecialties(), empty());
    }

    @Test
    public void setSpecialtiesInternalSpecialtiesIsEmpty() {
        new Vet().setSpecialtiesInternal(new HashSet<Specialty>());
    }
}
