package demo;

import org.testng.annotations.*;

public class TestClassTwo {
  @DataProvider(name = "MyDataProvider")
  public Object[][] getdata() {
    return new Object[][]{
        {"Sedan", "Honda"},
        {"Wagon", "Audi"},
        {"SUV", "Toyota"},
    };
  }

  @Test(dataProvider = "MyDataProvider")
  public void testDataProvider(String body, String brand) {
    System.out.println("Body: " + body + ". Brand: " + brand);
  }

  @Parameters({"random1", "random2"})
  @Test
  public void number(String random1, String random2) {
    System.out.println("Random one is " + random1);
    System.out.println("Random two is " + random2);
  }
}
