package demo;

import org.testng.annotations.*;

public class TestClassOne {
  @BeforeGroups("read")
  public void setupRead() {
    System.out.println("setupRead");
  }

  @AfterGroups("read")
  public void teardownRead() {
    System.out.println("teardownRead");
  }

  @BeforeGroups("think")
  public void setupThink() {
    System.out.println("setupThink");
  }

  @AfterGroups("think")
  public void teardownThink() {
    System.out.println("teardownThink");
  }

  @Test(groups = "read")
  public void news(){
    System.out.println("news");
  }

  @Test(groups = "read")
  public void book() {
    System.out.println("book");
  }

  @Test(groups = "think")
  public void once() {
    System.out.println("once");
  }

  @Test(groups = "think")
  public void twice() {
    System.out.println("twice");
  }
}
