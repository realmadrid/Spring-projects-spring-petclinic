package org.springframework.samples.petclinic.visit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit tests for org.springframework.samples.petclinic.visit.VisitRepository
 *
 * @author Diffblue Cover
 */

@RunWith(SpringRunner.class)
@DataJpaTest
public class VisitRepositoryDiffblueTest {

    @Autowired
    private VisitRepository repository;

    @Test
    public void saveFindByPetId() throws org.springframework.dao.DataAccessException {
        Visit visit = new Visit();
        LocalDate date = LocalDate.of(2_000, 1, 1);
        visit.setDate(date);
        visit.setDescription("some text");
        visit.setPetId(1);
        visit.setId(1);
        repository.save(visit);
        List<Visit> instances = repository.findByPetId(1);
        assertThat(instances.size(), is(1));
        assertThat(instances.get(0).getDate(), sameInstance(date));
        assertThat(instances.get(0).getDescription(), is("some text"));
        assertThat(instances.get(0).getPetId(), is(1));
        assertThat(instances.get(0).getId(), is(1));
        assertThat(instances.get(0).isNew(), is(false));
    }
}
