package org.springframework.samples.petclinic.vet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;

import org.junit.Test;

/**
 * Unit tests for org.springframework.samples.petclinic.vet.Vets
 *
 * @author Diffblue Cover
 */

public class VetsDiffblueTest {

    @Test
    public void constructor() {
        // pojo Vets
    }

    @Test
    public void getVetListReturnsEmpty() {
        assertThat(new Vets().getVetList(), empty());
    }
}
