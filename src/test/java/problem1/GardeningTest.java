package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GardeningTest {
  private Gardening gardeningTest1;

  @Before
  public void setUp() throws Exception {
    gardeningTest1 = new Gardening("NEU", PropertySize.Small, false, 5.0,
        0.0, 2.0);
  }

  @Test
  public void calculatePrices() {
    assertEquals(100.00, gardeningTest1.calculatePrices(), 0.01);
  }

  @Test
  public void toStringTest(){
    assertEquals("Service{address='NEU', PropertySize=Small, isMonthly=false, preNum=5.0, "
            + "petsNum=0.0, floorNum=2.0} /None Specialist Service /Exterior Service /Gardening Service",
        gardeningTest1.toString());
  }

  @Test
  public void hashCodeTest(){
    assertEquals(7.7382055E7, gardeningTest1.hashCode(), 0.01);
  }

  @Test
  public void equalsTest1(){
    assertEquals(gardeningTest1, gardeningTest1);
  }

  @Test
  public void equalsTest2(){
    String testString = "Cleaning";
    assertNotEquals(gardeningTest1, testString);
  }

  @Test
  public void equalsTest3(){
    Gardening gardeningTest5 = new Gardening("NEU", PropertySize.Small, false,
        8.0, 0.0, 1.0);
    assertNotEquals(gardeningTest5, gardeningTest1);
  }

  @Test
  public void equalsTest4(){
    assertNotEquals(null, gardeningTest1);
  }
}