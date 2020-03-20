package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class OwnerDiffblueTest {
  @Test
  public void getPetTest() {
    // Arrange, Act and Assert
    assertNull((new Owner()).getPet("id"));
  }

  @Test
  public void getPetTest2() {
    // Arrange, Act and Assert
    assertNull((new Owner()).getPet("id", true));
  }

  @Test
  public void getPetsInternalTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Owner()).getPetsInternal().size());
  }

  @Test
  public void getPetsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Owner()).getPets().size());
  }
}

