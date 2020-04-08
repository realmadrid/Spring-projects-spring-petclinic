package org.springframework.samples.petclinic.vet;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.LinkedList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Unit tests for org.springframework.samples.petclinic.vet.VetController
 *
 * @author Diffblue Cover
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = VetController.class)
public class VetControllerDiffblueTest {

    @MockBean(name = "clinicService")
    private VetRepository clinicService;

    @Autowired
    private VetController controller;

    @Test
    public void showVetList() throws org.springframework.dao.DataAccessException, Exception {
        when(clinicService.findAll())
            .thenReturn(new LinkedList<Vet>());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/vets.html"))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("vets/vetList"))
            .andExpect(view().name("vets/vetList"));
    }

    @Test
    public void showResourcesVetList() throws org.springframework.dao.DataAccessException, Exception {
        when(clinicService.findAll())
            .thenReturn(new LinkedList<Vet>());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/vets"))
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/xml"))
            .andExpect(content().string("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><vets/>"));
    }
}
