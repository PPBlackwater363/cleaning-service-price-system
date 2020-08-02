package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlumbingServiceTest {
  private PlumbingService plmbSevTest1;

  @Before
  public void setUp() throws Exception {
    plmbSevTest1 = new PlumbingService("NEU", PropertySize.Small, true,
        2.0, 0.0, 3.0, 2.0, true);
  }

  @Test
  public void calculatePrices() {
    assertEquals(420.0, plmbSevTest1.calculatePrices(), 0.01);
  }

  @Test
  public void getBaseTest(){
    assertEquals(200.0, plmbSevTest1.getBaseRate(), 0.01);
  }

  @Test
  public void getSpecialistNumTest1(){
    PlumbingService plmbSevTest2 = new PlumbingService("NEU", PropertySize.Large,
        false, 9.0, 2.0, 2.0, 0.0, false);
    assertEquals(1.0, plmbSevTest2.getSpecialistNum(), 0.01);
  }

  @Test
  public void getSpecialistNumTest2(){
    PlumbingService plmbSevTest3 = new PlumbingService("NEU", PropertySize.Large,
        false, 9.0, 2.0, 2.0, 0.0, true);
    assertEquals(3.0, plmbSevTest3.getSpecialistNum(), 0.01);
  }

  @Test
  public void getSpecialistNumTest3(){
    PlumbingService plmbSevTest4 = new PlumbingService("NEU", PropertySize.Medium,
        false, 9.0, 2.0, 2.0, 0.0, true);
    assertEquals(2.0, plmbSevTest4.getSpecialistNum(), 0.01);
  }

  @Test
  public void getSpecialistNumTest4(){
    PlumbingService plmbSevTest5 = new PlumbingService("NEU", PropertySize.Small,
        false, 9.0, 2.0, 2.0, 0.0, true);
    assertEquals(2.0, plmbSevTest5.getSpecialistNum(), 0.01);
  }

  @Test
  public void getSpecialistNumTest5(){
    PlumbingService plmbSevTest6 = new PlumbingService("NEU", PropertySize.Small,
        false, 9.0, 2.0, 2.0, 0.0, false);
    assertEquals(1.0, plmbSevTest6.getSpecialistNum(), 0.01);
  }

  @Test
  public void isComplexTest(){
    assertTrue(plmbSevTest1.isComplex());
  }

  @Test
  public void calculateDisctTest(){
    assertEquals(0.0, plmbSevTest1.calculateDiscount(), 0.01);
  }

  @Test
  public void setBaseRateTest(){
    plmbSevTest1.setBaseRate(100.0);
    assertEquals(100.0, plmbSevTest1.getBaseRate(), 0.01);
  }

  @Test
  public void setSpecialistNumTest(){
    plmbSevTest1.setSpecialistNum(3.0);
    assertEquals(3.0, plmbSevTest1.getSpecialistNum(), 0.01);
  }

  @Test
  public void setComplexTest(){
    plmbSevTest1.setComplex(false);
    assertFalse(plmbSevTest1.isComplex());
  }

  @Test
  public void equalsTest1(){
    assertEquals(plmbSevTest1, plmbSevTest1);
  }

  @Test
  public void equalsTest2(){
    String testString = "Cleaning";
    assertNotEquals(plmbSevTest1, testString);
  }

  @Test
  public void equalsTest3(){
    PlumbingService plmbSevTest5 = new PlumbingService("NEU", PropertySize.Large,
        false, 9.0, 2.0, 2.0, 2.0, false);
    assertNotEquals(plmbSevTest5, plmbSevTest1);
  }

  @Test
  public void equalsTest4(){
    assertNotEquals(null, plmbSevTest1);
  }

  @Test
  public void testHashCode() {
    assertEquals(-2.134502566E9, plmbSevTest1.hashCode(), 0.01);
  }

  @Test
  public void testToString() {
    assertEquals("Service{address='NEU', PropertySize=Small, isMonthly=true, preNum=2.0, "
            + "petsNum=0.0, floorNum=3.0} /Specialist Service /Plumbing Service",
        plmbSevTest1.toString());
  }
}