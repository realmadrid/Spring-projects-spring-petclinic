package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertNull;
import java.util.Locale;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class PetTypeFormatterDiffblueTest {
  @Autowired
  private PetTypeFormatter petTypeFormatter;
  @Test
  public void printTest() {
    // Arrange
    PetType petType = new PetType();

    // Act and Assert
    assertNull(this.petTypeFormatter.print(petType, Locale.getDefault()));
  }
}

