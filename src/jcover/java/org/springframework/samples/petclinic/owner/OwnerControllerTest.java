package org.springframework.samples.petclinic.owner;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Collection;
import java.util.LinkedList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Unit tests for org.springframework.samples.petclinic.owner.OwnerController
 *
 * @author Diffblue Cover
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = OwnerController.class)
public class OwnerControllerTest {

    @MockBean(name = "clinicService")
    private OwnerRepository clinicService;

    @Autowired
    private OwnerController controller;

    @Test
    public void initCreationForm() throws Exception {
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners/new", new Object[] { }))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("owners/createOrUpdateOwnerForm"))
            .andExpect(view().name("owners/createOrUpdateOwnerForm"));
    }

    @Test
    public void initFindForm() throws Exception {
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners/find", new Object[] { }))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("owners/findOwners"))
            .andExpect(view().name("owners/findOwners"));
    }

    @Test
    public void initUpdateOwnerForm() throws Exception {
        when(clinicService.findById(Mockito.<Integer>any()))
            .thenReturn(new Owner());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners/{ownerId}/edit", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("owners/createOrUpdateOwnerForm"))
            .andExpect(view().name("owners/createOrUpdateOwnerForm"));
    }

    @Test
    public void processCreationForm() throws Exception {
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/new", new Object[] { })
                .param("address", "280 Broadway")
                .param("city", "New York")
                .param("telephone", "bar")
                .param("firstName", "Anna")
                .param("lastName", "Smith")
                .param("id", Integer.valueOf(1).toString()))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("owners/createOrUpdateOwnerForm"))
            .andExpect(view().name("owners/createOrUpdateOwnerForm"));
    }

    @Test
    public void processFindForm1() throws Exception {
        Collection<Owner> collection = new LinkedList<Owner>();
        ((LinkedList<Owner>)collection).add(new Owner());
        when(clinicService.findByLastName(Mockito.<String>any()))
            .thenReturn(collection);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners", new Object[] { })
                .param("address", "280 Broadway")
                .param("city", "New York")
                .param("telephone", "415-477-1477")
                .param("firstName", "Anna")
                .param("lastName", "Smith")
                .param("id", Integer.valueOf(1).toString()))
            .andExpect(status().is(302))
            .andExpect(redirectedUrl("/owners/null"))
            .andExpect(view().name("redirect:/owners/null"));
    }

    @Test
    public void processFindForm2() throws Exception {
        when(clinicService.findByLastName(Mockito.<String>any()))
            .thenReturn(new LinkedList<Owner>());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners", new Object[] { })
                .param("address", "280 Broadway")
                .param("city", "New York")
                .param("telephone", "bar")
                .param("firstName", "Anna")
                .param("lastName", "Smith")
                .param("id", Integer.valueOf(1).toString()))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("owners/findOwners"))
            .andExpect(view().name("owners/findOwners"));
    }

    @Test
    public void processFindForm3() throws Exception {
        when(clinicService.findByLastName(Mockito.<String>any()))
            .thenReturn(new LinkedList<Owner>());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners", new Object[] { })
                .param("address", "280 Broadway")
                .param("city", "New York")
                .param("telephone", "415-477-1477")
                .param("firstName", "Anna")
                .param("lastName", new String[] { null })
                .param("id", Integer.valueOf(1).toString()))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("owners/findOwners"))
            .andExpect(view().name("owners/findOwners"));
    }

    @Test
    public void processUpdateOwnerForm() throws Exception {
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.post("/owners/{ownerId}/edit", Integer.toString(0))
                .param("address", "280 Broadway")
                .param("city", "New York")
                .param("telephone", "bar")
                .param("firstName", "Anna")
                .param("lastName", "Smith")
                .param("id", Integer.valueOf(1).toString()))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("owners/createOrUpdateOwnerForm"))
            .andExpect(view().name("owners/createOrUpdateOwnerForm"));
    }

    @Test
    public void showOwner() throws Exception {
        when(clinicService.findById(Mockito.<Integer>any()))
            .thenReturn(new Owner());
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/owners/{ownerId}", Integer.toString(1)))
            .andExpect(status().isOk())
            .andExpect(forwardedUrl("owners/ownerDetails"))
            .andExpect(view().name("owners/ownerDetails"));
    }
}
