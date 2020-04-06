package com.nobodyiam.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DemoTest {

  private Demo demo;

  @Before
  public void setUp() {
    demo = new Demo();
  }

  @Test
  public void add() {
    int i1 = 10;
    int i2 = 20;

    assertEquals(i1 + i2, demo.add(i1, i2));
  }

  @Test
  public void minus() {
    int i1 = 10;
    int i2 = 20;

    assertEquals(i1 - i2, demo.minus(i1, i2));
  }

  @Test
  public void multiply() {
    int i1 = 10;
    int i2 = 20;

    assertEquals(i1 * i2, demo.multiply(i1, i2));
  }
}