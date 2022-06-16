package demo;

import org.testng.annotations.*;

public class TestClassThree {
  @Test(priority = 4)
  public void news(){
    System.out.println("news");
  }

  @Test(priority = 3)
  public void book() {
    System.out.println("boook");
  }

  @Test(priority = 2)
  public void once() {
    System.out.println("once");
  }

  @Test(priority = 1)
  public void twice() {
    System.out.println("twice");
  }
}
