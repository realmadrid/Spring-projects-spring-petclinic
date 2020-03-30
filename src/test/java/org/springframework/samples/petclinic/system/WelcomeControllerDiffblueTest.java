package org.springframework.samples.petclinic.system;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Unit tests for org.springframework.samples.petclinic.system.WelcomeController
 *
 * @author Diffblue Cover
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = WelcomeController.class)
public class WelcomeControllerDiffblueTest {

    @Autowired
    private WelcomeController controller;
}
