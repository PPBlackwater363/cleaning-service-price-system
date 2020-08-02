package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CleaningTest {
  private Cleaning cleaningTest1;

  @Before
  public void setUp() throws Exception {
    cleaningTest1 = new Cleaning("NEU", PropertySize.Small,true,9.0,
        1.0, 1.0);
  }

  @Test
  public void calculateWorkHour1() {
    cleaningTest1.calculateWorkHour();
    assertEquals(1.0, cleaningTest1.workHour, 0.01);
  }

  @Test
  public void calculateWorkHour2() {
    Cleaning cleaningTest2 = new Cleaning("NEU", PropertySize.Medium,true,
        8.0, 1.0, 1.0);
    cleaningTest2.calculateWorkHour();
    assertEquals(2.0, cleaningTest2.workHour, 0.01);
  }

  @Test
  public void calculateWorkHour3() {
    Cleaning cleaningTest3 = new Cleaning("NEU", PropertySize.Large,true,
        8.0, 1.0, 1.0);
    cleaningTest3.calculateWorkHour();
    assertEquals(4.0, cleaningTest3.workHour, 0.01);
  }

  @Test
  public void calculatePrices1() {
    assertEquals(42.0, cleaningTest1.calculatePrices(), 0.01);
  }

  @Test
  public void calculatePrices2() {
    Cleaning cleaningTest4 = new Cleaning("NEU", PropertySize.Large,true,
        8.0, 5.0, 1.0);
    assertEquals(308.16, cleaningTest4.calculatePrices(), 0.01);
  }

  @Test
  public void toStringTest(){
    assertEquals("Service{address='NEU', PropertySize=Small, isMonthly=true, preNum=9.0, "
        + "petsNum=1.0, floorNum=1.0} /None Specialist Service /Interior Service /Cleaning Service",
        cleaningTest1.toString());
  }

  @Test
  public void hashCodeTest(){
    assertEquals(-2.7475501E7, cleaningTest1.hashCode(), 0.01);
  }

  @Test
  public void equalsTest1(){
    assertEquals(cleaningTest1, cleaningTest1);
  }

  @Test
  public void equalsTest2(){
    String testString = "Cleaning";
    assertNotEquals(cleaningTest1, testString);
  }

  @Test
  public void equalsTest3(){
    Cleaning cleaningTest5 = new Cleaning("NEU", PropertySize.Small,true,
        9.0, 1.0, 1.0);
    assertEquals(cleaningTest5, cleaningTest1);
  }

  @Test
  public void equalsTest4(){
    assertNotEquals(null, cleaningTest1);
  }

  @Test
  public void getAddressTest(){
    assertEquals("NEU", cleaningTest1.getAddress());
  }

  @Test
  public void setAddressTest(){
    cleaningTest1.setAddress("YALE");
    assertEquals("YALE", cleaningTest1.getAddress());
  }

  @Test
  public void setSizeTest(){
    cleaningTest1.setPropertySize(PropertySize.Medium);
    assertEquals(PropertySize.Medium, cleaningTest1.getPropertySize());
  }

  @Test
  public void setIsMonthlyTest(){
    cleaningTest1.setMonthly(false);
    assertFalse(cleaningTest1.isMonthly());
  }

  @Test
  public void setPetsNumTest(){
    cleaningTest1.setPetsNum(5.0);
    assertEquals(5.0, cleaningTest1.getPetsNum(), 0.01);
  }

  @Test
  public void setPreNumTest(){
    cleaningTest1.setPreNum(5.0);
    assertEquals(5.0, cleaningTest1.getPreNum(), 0.01);
  }

  @Test
  public void setFloorNumTest(){
    cleaningTest1.setFloorNum(2.0);
    assertEquals(2.0, cleaningTest1.getFloorNum(), 0.01);
  }


}