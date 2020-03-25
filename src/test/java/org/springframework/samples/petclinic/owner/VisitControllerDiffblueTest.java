package org.springframework.samples.petclinic.owner;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.samples.petclinic.visit.VisitRepository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Unit tests for org.springframework.samples.petclinic.owner.VisitController
 *
 * @author Diffblue Cover
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = VisitController.class)
public class VisitControllerDiffblueTest {

    @MockBean(name = "pets")
    private PetRepository pets;

    @MockBean(name = "visits")
    private VisitRepository visits;

    @Autowired
    private VisitController controller;

    @Test
    public void initNewVisitForm() throws org.springframework.dao.DataAccessException, Exception {
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(new Pet());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners/*/pets/{petId}/visits/new", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }

    @Test
    public void processNewVisitForm() throws org.springframework.dao.DataAccessException, Exception {
        when(pets.findById(Mockito.<Integer>any()))
            .thenReturn(new Pet());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/pets/{petId}/visits/new", "root", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("pets/createOrUpdateVisitForm"))
            .andExpect(view().name("pets/createOrUpdateVisitForm"));
    }
}
