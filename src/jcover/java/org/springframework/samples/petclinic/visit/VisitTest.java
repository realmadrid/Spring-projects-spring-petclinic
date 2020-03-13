package org.springframework.samples.petclinic.visit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;

import java.time.LocalDate;

import org.junit.Test;

/**
 * Unit tests for org.springframework.samples.petclinic.visit.Visit
 *
 * @author Diffblue Cover
 */

public class VisitTest {

    @Test
    public void getDate() {
        Visit visit = new Visit();
        LocalDate result = visit.getDate();
        assertThat(result, equalTo(LocalDate.now()));
        assertThat(visit.getDate(), sameInstance(result));
    }

    @Test
    public void getters() {
        assertThat(new Visit().getDescription(), is(nullValue()));
        assertThat(new Visit().getPetId(), is(nullValue()));
    }

    @Test
    public void setDate() {
        Visit visit = new Visit();
        LocalDate date = LocalDate.of(2_000, 1, 1);
        visit.setDate(date);
        assertThat(visit.getDate(), sameInstance(date));
    }

    @Test
    public void setDescription() {
        Visit visit = new Visit();
        visit.setDescription("some text");
        assertThat(visit.getDescription(), is("some text"));
    }

    @Test
    public void setPetIdToOne() {
        Visit visit = new Visit();
        visit.setPetId(1);
        assertThat(visit.getPetId(), is(1));
    }
}
