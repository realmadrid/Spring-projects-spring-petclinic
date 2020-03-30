package org.springframework.samples.petclinic.owner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for org.springframework.samples.petclinic.owner.PetValidator
 *
 * @author Diffblue Cover
 */

public class PetValidatorDiffblueTest {

    @Test
    public void supportsClazzIsPetClinicApplicationReturnsFalse() {
        assertThat(new PetValidator().supports(org.springframework.samples.petclinic.PetClinicApplication.class), is(false));
    }
}
