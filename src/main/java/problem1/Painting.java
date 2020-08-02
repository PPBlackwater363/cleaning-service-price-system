package problem1;

public class Painting extends InteriorService {
  private final static Double LARGE_WORK_HOUR = 24.0;
  private final static Double MEDIUM_WORK_HOUR = 16.0;
  private final static Double SMALL_WORK_HOUR = 16.0;

  /**
   * Construct a new painting service object based on information below.
   * @param address - property address for one new service.
   * @param propertySize - property size for one new service.
   * @param isMonthly - a boolean value to show if the property is monthly served.
   * @param preNum - a number to show how many time this property has been served before the new service.
   * @param petsNum - the number of pets the property has.
   * @param floorNum - the number of the floors the property has.
   */
  public Painting(String address, Enum propertySize, boolean isMonthly, Double preNum,
      Double petsNum, Double floorNum){
    super(address, propertySize, isMonthly, preNum, petsNum, floorNum);
    this.workHour = 0.0;
  }

  /**
   * calculate the the number of work hour for the painting service per the property size.
   */
  public void calculateWorkHour(){
    if (this.getPropertySize() == PropertySize.Large)
      this.workHour = LARGE_WORK_HOUR;
    else if (this.getPropertySize() == PropertySize.Medium)
      this.workHour = MEDIUM_WORK_HOUR;
    else
      this.workHour = SMALL_WORK_HOUR;
  }

  /**
   * override the calculatePrices method to calculate the price for the painting service.
   * @return - the price of the painting service.
   */
  @Override
  public double calculatePrices() {
    this.calculateWorkHour();
    return super.calculatePrices();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Painting)) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode(){
    return super.hashCode();
  }

  @Override
  public String toString() {
    return super.toString() + " /Painting Service";
  }

}
