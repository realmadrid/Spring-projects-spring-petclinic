package org.springframework.samples.petclinic.owner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit tests for org.springframework.samples.petclinic.owner.OwnerRepository
 *
 * @author Diffblue Cover
 */

@RunWith(SpringRunner.class)
@DataJpaTest
public class OwnerRepositoryDiffblueTest {

    @Autowired
    private OwnerRepository repository;

    @Test
    public void saveFindById() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        repository.save(owner);
        Owner instances = repository.findById(1);
        assertThat(instances.getAddress(), is("280 Broadway"));
        assertThat(instances.getCity(), is("New York"));
        assertThat(instances.getTelephone(), is("12345"));
        assertThat(instances.getFirstName(), is("Anna"));
        assertThat(instances.getLastName(), is("Smith"));
        assertThat(instances.getId(), is(1));
        assertThat(instances.isNew(), is(false));
    }

    @Test
    public void saveFindByLastName() {
        Owner owner = new Owner();
        owner.setAddress("280 Broadway");
        owner.setCity("New York");
        owner.setTelephone("12345");
        owner.setFirstName("Anna");
        owner.setLastName("Smith");
        owner.setId(1);
        repository.save(owner);
        Collection<Owner> instances = repository.findByLastName("Smith");
    }
}
