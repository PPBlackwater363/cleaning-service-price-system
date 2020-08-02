package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WindowCleaningTest {
  private WindowCleaning windowTest1;

  @Before
  public void setUp() throws Exception {
    windowTest1 = new WindowCleaning("NEU", PropertySize.Medium, false, 9.0,
        4.0, 2.0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldGetException() {
    WindowCleaning windowTest2 = new WindowCleaning("NEU", PropertySize.Small, false, 4.0,
        4.0, 4.0);
  }

  @Test
  public void calculateGlassFee1() {
    assertEquals(1.05, windowTest1.calculateGlassFee(), 0.01);
  }

  @Test
  public void calculateGlassFee2() {
    WindowCleaning windowTest2 =  new WindowCleaning("NEU", PropertySize.Large,
        false, 4.0, 4.0, 1.0);
    assertEquals(1.00, windowTest2.calculateGlassFee(), 0.01);
  }

  @Test
  public void calculatePrices1() {
    assertEquals(84.0, windowTest1.calculatePrices(), 0.01);
  }

  @Test
  public void calculatePrices2() {
    WindowCleaning windowTest3 =  new WindowCleaning("NEU", PropertySize.Large,
        true, 4.0, 4.0, 2.0);
    assertEquals(302.0, Math.round(windowTest3.calculatePrices()), 0.01);
  }

  @Test
  public void toStringTest(){
    assertEquals("Service{address='NEU', PropertySize=Medium, isMonthly=false, preNum=9.0,"
            + " petsNum=4.0, floorNum=2.0} /None Specialist Service /Exterior Service "
            + "/WindowCleaning Service",
        windowTest1.toString());
  }

  @Test
  public void hashCodeTest(){
    assertEquals(7.7382099E7, windowTest1.hashCode(), 0.01);
  }

  @Test
  public void equalsTest1(){
    assertEquals(windowTest1, windowTest1);
  }

  @Test
  public void equalsTest2(){
    String testString = "Cleaning";
    assertNotEquals(windowTest1, testString);
  }

  @Test
  public void equalsTest3(){
    WindowCleaning windowTest5 = new WindowCleaning("NEU", PropertySize.Small, false,
        8.0, 0.0, 1.0);
    assertNotEquals(windowTest5, windowTest1);
  }

  @Test
  public void equalsTest4(){
    assertNotEquals(null, windowTest1);
  }
}