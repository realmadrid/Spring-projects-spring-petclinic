package org.springframework.samples.petclinic.vet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.HashSet;

import org.junit.Test;

/**
 * Unit tests for org.springframework.samples.petclinic.vet.Vet
 *
 * @author Diffblue Cover
 */

public class VetTest {

    @Test
    public void addSpecialty() {
        Vet vet = new Vet();
        Specialty specialty = new Specialty();
        vet.addSpecialty(specialty);
        assertThat(vet.getNrOfSpecialties(), is(1));
        assertThat(vet.getSpecialties(), hasSize(1));
        assertThat(vet.getSpecialties().get(0), sameInstance(specialty));
    }

    @Test
    public void getters() {
        assertThat(new Vet().getNrOfSpecialties(), is(0));
        assertThat(new Vet().getSpecialties(), empty());
    }

    @Test
    public void setSpecialtiesInternalSpecialtiesIsEmpty() {
        new Vet().setSpecialtiesInternal(new HashSet<Specialty>());
    }
}
