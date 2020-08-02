package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElectricalServiceTest {
  private ElectricalService eleSevTest1;

  @Before
  public void setUp() throws Exception {
    eleSevTest1 = new ElectricalService("NEU", PropertySize.Medium, false, 9.0,
        2.0, 2.0, 3.0, true);
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldGetException(){
    ElectricalService eleSevTestWrong = new ElectricalService("NEU", PropertySize.Medium,
        false, 9.0, 2.0, 2.0, 5.0, true);
  }

  @Test
  public void calculatePrices1() {
    assertEquals(650.0, eleSevTest1.calculatePrices(), 0.01);
  }

  @Test
  public void calculatePrices2() {
    ElectricalService eleSevTest2 = new ElectricalService("NEU", PropertySize.Small,
        false, 9.0, 2.0, 2.0, 2.0, true);
    assertEquals(450.0, eleSevTest2.calculatePrices(), 0.01);
  }

  @Test
  public void calculatePrices3() {
    ElectricalService eleSevTest3 = new ElectricalService("NEU", PropertySize.Large,
        false, 9.0, 2.0, 2.0, 2.0, false);
    assertEquals(450.0, eleSevTest3.calculatePrices(), 0.01);
  }

  @Test
  public void equalsTest1(){
    assertEquals(eleSevTest1, eleSevTest1);
  }

  @Test
  public void equalsTest2(){
    String testString = "Cleaning";
    assertNotEquals(eleSevTest1, testString);
  }

  @Test
  public void equalsTest3(){
    ElectricalService eleSevTest5 = new ElectricalService("NEU", PropertySize.Large,
        false, 9.0, 2.0, 2.0, 2.0, false);
    assertNotEquals(eleSevTest5, eleSevTest1);
  }

  @Test
  public void equalsTest4(){
    assertNotEquals(null, eleSevTest1);
  }

  @Test
  public void testHashCode() {
    assertEquals(-2.139745439E9, eleSevTest1.hashCode(), 0.01);
  }

  @Test
  public void testToString() {
    assertEquals("Service{address='NEU', PropertySize=Medium, isMonthly=false, "
        + "preNum=9.0, petsNum=2.0, floorNum=2.0} /Specialist Service /Electrical Service",
        eleSevTest1.toString());
  }
}