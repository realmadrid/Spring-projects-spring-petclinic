package org.springframework.samples.petclinic.system;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WelcomeControllerDiffblueTest {
  @Test
  public void welcomeTest() {
    // Arrange, Act and Assert
    assertEquals("welcome", (new WelcomeController()).welcome());
  }
}

