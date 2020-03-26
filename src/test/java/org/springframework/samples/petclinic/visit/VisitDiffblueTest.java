package org.springframework.samples.petclinic.visit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.time.LocalDate;

import org.junit.Test;

/**
 * Unit tests for org.springframework.samples.petclinic.visit.Visit
 *
 * @author Diffblue Cover
 */

public class VisitDiffblueTest {

    @Test
    public void setId() {
        Visit visit = new Visit();
        LocalDate date = LocalDate.of(2_000, 1, 1);
        visit.setDate(date);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        assertThat(visit.getDate(), sameInstance(date));
        assertThat(visit.getDescription(), is("some text"));
        assertThat(visit.getPetId(), is(1));
        assertThat(visit.getId(), is(1));
        assertThat(visit.isNew(), is(false));
    }

    @Test
    public void getDate() {
        Visit visit = new Visit();
        LocalDate date = LocalDate.of(2_000, 1, 1);
        visit.setDate(date);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        assertThat(visit.getDate(), sameInstance(date));
    }

    @Test
    public void getDescription() {
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        assertThat(visit.getDescription(), is("some text"));
    }

    @Test
    public void getPetIdReturnsOne() {
        Visit visit = new Visit();
        visit.setDate(LocalDate.of(2_000, 1, 1));
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        assertThat(visit.getPetId(), is(1));
    }
}
