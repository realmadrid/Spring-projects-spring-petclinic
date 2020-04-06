package org.springframework.samples.petclinic.owner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit tests for org.springframework.samples.petclinic.owner.PetRepository
 *
 * @author Diffblue Cover
 */

@RunWith(SpringRunner.class)
@DataJpaTest
public class PetRepositoryDiffblueTest {

    @Autowired
    private PetRepository repository;

    @Test
    public void saveFindById() {
        Pet pet = new Pet();
        LocalDate birthDate = LocalDate.of(2_000, 1, 1);
        pet.setBirthDate(birthDate);
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        repository.save(pet);
        Pet instances = repository.findById(1);
        assertThat(instances.getBirthDate(), sameInstance(birthDate));
        assertThat(instances.getOwner(), is(nullValue()));
        assertThat(instances.getType().getName(), is("cat"));
        assertThat(instances.getType().getId(), is(1));
        assertThat(instances.getType().isNew(), is(false));
        assertThat(instances.getName(), is("Bella"));
        assertThat(instances.getId(), is(1));
        assertThat(instances.isNew(), is(false));
    }

    @Test
    public void saveFindPetTypes() {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.of(2_000, 1, 1));
        PetType type = new PetType();
        type.setName("dog");
        type.setId(1);
        pet.setType(type);
        pet.setName("Bella");
        pet.setId(1);
        repository.save(pet);
        assertThat(repository.findPetTypes(), hasSize(6));
        assertThat(repository.findPetTypes().get(0).getName(), is("bird"));
        assertThat(repository.findPetTypes().get(0).getId(), is(5));
        assertThat(repository.findPetTypes().get(0).isNew(), is(false));
        assertThat(repository.findPetTypes().get(1).getName(), is("cat"));
        assertThat(repository.findPetTypes().get(1).getId(), is(1));
        assertThat(repository.findPetTypes().get(1).isNew(), is(false));
        assertThat(repository.findPetTypes().get(2).getName(), is("dog"));
        assertThat(repository.findPetTypes().get(2).getId(), is(2));
        assertThat(repository.findPetTypes().get(2).isNew(), is(false));
        assertThat(repository.findPetTypes().get(3).getName(), is("hamster"));
        assertThat(repository.findPetTypes().get(3).getId(), is(6));
        assertThat(repository.findPetTypes().get(3).isNew(), is(false));
        assertThat(repository.findPetTypes().get(4).getName(), is("lizard"));
        assertThat(repository.findPetTypes().get(4).getId(), is(3));
        assertThat(repository.findPetTypes().get(4).isNew(), is(false));
        assertThat(repository.findPetTypes().get(5).getName(), is("snake"));
        assertThat(repository.findPetTypes().get(5).getId(), is(4));
        assertThat(repository.findPetTypes().get(5).isNew(), is(false));
    }
}
