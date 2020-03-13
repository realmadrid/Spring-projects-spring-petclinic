package org.springframework.samples.petclinic.owner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit tests for org.springframework.samples.petclinic.owner.PetTypeFormatter
 *
 * @author Diffblue Cover
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = PetTypeFormatter.class)
public class PetTypeFormatterTest {

    @MockBean(name = "pets")
    private PetRepository pets;

    @Autowired
    private PetTypeFormatter service;

    @Test
    public void printReturnsNull() {
        assertThat(service.print(new PetType(), new Locale("en")), is(nullValue()));
    }
}
