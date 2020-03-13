package org.springframework.samples.petclinic.vet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for org.springframework.samples.petclinic.vet.Vets
 *
 * @author Diffblue Cover
 */

public class VetsTest {

    @Test
    public void getVetListReturnsEmpty() {
        Vets vets = new Vets();
        List<Vet> result = vets.getVetList();
        assertThat(result, empty());
        assertThat(vets.getVetList(), sameInstance(result));
    }
}
