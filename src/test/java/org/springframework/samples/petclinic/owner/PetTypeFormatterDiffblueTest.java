package org.springframework.samples.petclinic.owner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
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
public class PetTypeFormatterDiffblueTest {

    @MockBean(name = "pets")
    private PetRepository pets;

    @Autowired
    private PetTypeFormatter service;

    @Test
    public void parseTextIsBar() throws java.text.ParseException {
        List<PetType> list = new ArrayList<PetType>();
        PetType petType = new PetType();
        petType.setName("bar");
        petType.setId(1);
        list.add(petType);
        when(pets.findPetTypes())
            .thenReturn(list);
        PetType result = service.parse("bar", new Locale("en"));
        assertThat(result.getName(), is("bar"));
        assertThat(result.isNew(), is(false));
    }

    @Test
    public void printReturnsDog() {
        PetType petType = new PetType();
        petType.setName("dog");
        petType.setId(1);
        assertThat(service.print(petType, new Locale("en")), is("dog"));
    }
}
