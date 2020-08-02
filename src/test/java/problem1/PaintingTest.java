package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PaintingTest {
  private Painting paintingTest1;

  @Before
  public void setUp() throws Exception {
    paintingTest1 = new Painting("NEU", PropertySize.Small, false, 8.0,
        0.0, 1.0);
  }

  @Test
  public void calculateWorkHour1() {
    paintingTest1.calculateWorkHour();
    assertEquals(16.0, paintingTest1.workHour, 0.01);
  }

  @Test
  public void calculateWorkHour2() {
    Painting paintingTest2 = new Painting("NEU", PropertySize.Medium, false,
        8.0, 0.0, 1.0);
    paintingTest2.calculateWorkHour();
    assertEquals(16.0, paintingTest2.workHour, 0.01);
  }

  @Test
  public void calculateWorkHour3() {
    Painting paintingTest3 = new Painting("NEU", PropertySize.Large, false,
        8.0, 0.0, 1.0);
    paintingTest3.calculateWorkHour();
    assertEquals(24.0, paintingTest3.workHour, 0.01);
  }

  @Test
  public void calculatePrices() {
    assertEquals(1280.0, paintingTest1.calculatePrices(), 0.01);
  }

  @Test
  public void toStringTest(){
    assertEquals("Service{address='NEU', PropertySize=Small, isMonthly=false, preNum=8.0, "
            + "petsNum=0.0, floorNum=1.0} /None Specialist Service /Interior Service /Painting Service",
        paintingTest1.toString());
  }

  @Test
  public void hashCodeTest(){
    assertEquals(-2.7475512E7, paintingTest1.hashCode(), 0.01);
  }

  @Test
  public void equalsTest1(){
    assertEquals(paintingTest1, paintingTest1);
  }

  @Test
  public void equalsTest2(){
    String testString = "Cleaning";
    assertNotEquals(paintingTest1, testString);
  }

  @Test
  public void equalsTest3(){
    Painting paintingTest5 = new Painting("NEU", PropertySize.Small, false,
        8.0, 0.0, 1.0);
    assertEquals(paintingTest5, paintingTest1);
  }

  @Test
  public void equalsTest4(){
    assertNotEquals(null, paintingTest1);
  }
}