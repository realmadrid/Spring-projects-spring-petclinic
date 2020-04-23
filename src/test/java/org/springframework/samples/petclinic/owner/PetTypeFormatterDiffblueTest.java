package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertNull;
import java.util.Locale;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class PetTypeFormatterDiffblueTest {
  @Autowired
  private PetTypeFormatter petTypeFormatter;
  @Test
  public void testPrint() {
    // Arrange
    Locale locale = new Locale("foo");

    // Act and Assert
    assertNull(this.petTypeFormatter.print(new PetType(), locale));
  }
}

