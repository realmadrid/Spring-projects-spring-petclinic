package org.springframework.samples.petclinic.system;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Unit tests for org.springframework.samples.petclinic.system.CrashController
 *
 * @author Diffblue Cover
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CrashController.class)
public class CrashControllerDiffblueTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Autowired
    private CrashController controller;

    @Test
    public void triggerExceptionThrowsNestedServletException() throws Exception {
        // Request processing failed; nested exception is java.lang.RuntimeException: Expected: controller used to showcase what happens when an exception is thrown
        thrown.expect(org.springframework.web.util.NestedServletException.class);
        MockMvcBuilders.standaloneSetup(controller).build().perform(
            MockMvcRequestBuilders.get("/oups"));
    }
}
