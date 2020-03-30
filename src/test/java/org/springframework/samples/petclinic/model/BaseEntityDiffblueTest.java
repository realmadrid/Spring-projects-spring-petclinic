package org.springframework.samples.petclinic.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BaseEntityDiffblueTest {
  @Test
  public void testSetId() {
    // Arrange
    BaseEntity baseEntity = new BaseEntity();

    // Act
    baseEntity.setId(1);

    // Assert
    assertFalse(baseEntity.isNew());
  }

  @Test
  public void testSetId2() {
    // Arrange
    BaseEntity baseEntity = new BaseEntity();

    // Act
    baseEntity.setId(0);

    // Assert
    assertFalse(baseEntity.isNew());
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    BaseEntity actualBaseEntity = new BaseEntity();

    // Assert
    assertTrue(actualBaseEntity.isNew());
    assertNull(actualBaseEntity.getId());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    BaseEntity actualBaseEntity = new BaseEntity();

    // Assert
    assertTrue(actualBaseEntity.isNew());
    assertNull(actualBaseEntity.getId());
  }

  @Test
  public void testIsNew() {
    // Arrange
    BaseEntity baseEntity = new BaseEntity();
    baseEntity.setId(1);

    // Act and Assert
    assertFalse(baseEntity.isNew());
  }

  @Test
  public void testIsNew2() {
    // Arrange, Act and Assert
    assertTrue((new BaseEntity()).isNew());
  }

  @Test
  public void testIsNew3() {
    // Arrange, Act and Assert
    assertTrue((new BaseEntity()).isNew());
  }
}

