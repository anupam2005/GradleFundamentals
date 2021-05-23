package com.anupam;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class DemoTest{

private Demo sut = new Demo();

@Test
public void testadd(){

    assertEquals("Simple add", 8, sut.add(5,3));
  }

}