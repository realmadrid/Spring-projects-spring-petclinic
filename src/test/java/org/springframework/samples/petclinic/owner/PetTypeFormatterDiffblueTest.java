package org.springframework.samples.petclinic.owner;

import static org.junit.Assert.assertNull;
import java.text.ParseException;
import java.util.Locale;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class PetTypeFormatterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Autowired
  private PetTypeFormatter petTypeFormatter;
  @Test
  public void parseTest() throws ParseException {
    // Arrange, Act and Assert
    thrown.expect(ParseException.class);
    this.petTypeFormatter.parse("text", Locale.getDefault());
  }
  @Test
  public void printTest() {
    // Arrange
    PetType petType = new PetType();

    // Act and Assert
    assertNull(this.petTypeFormatter.print(petType, Locale.getDefault()));
  }
}

