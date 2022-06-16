package demo;

import org.testng.annotations.*;
import org.testng.annotations.Test;

@Test

public class SimpleTest {
  @BeforeTest
  public void setup() {
    System.out.println("setup");
  }

  @AfterTest
  public void teardown() {
    System.out.println("teardown");
  }

  @Test
  public void firstTest(){
    System.out.println("firstTest");
  }
}
