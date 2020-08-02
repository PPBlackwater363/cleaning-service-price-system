package problem1;

import java.util.Objects;

/**
 * An abstract class to create a exterior service including information below
 */
public abstract class ExteriorService extends NoneSpecialistService {
  protected Double workHour;
  private final static Double LARGE_WORK_HOUR = 4.0;
  private final static Double MEDIUM_WORK_HOUR = 2.0;
  private final static Double SMALL_WORK_HOUR = 1.0;

  /**
   * Construct a new exterior service object based on information below.
   * @param address - property address for one new service.
   * @param propertySize - property size for one new service.
   * @param isMonthly - a boolean value to show if the property is monthly served.
   * @param preNum - a number to show how many time this property has been served before the new service.
   * @param petsNum - the number of pets the property has.
   * @param floorNum - the number of the floors the property has.
   */
  public ExteriorService(String address, Enum propertySize, boolean isMonthly, Double preNum,
      Double petsNum, Double floorNum){
    super(address, propertySize, isMonthly, preNum, petsNum, floorNum);
  }

  /**
   * calculate the rate for increasing the price per the size of the property.
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
   * override the calculatePrices method per information of the abstract class.
   * @return the price for the exterior service.
   */
  @Override
  public double calculatePrices() {
    this.calculateWorkHour();
    return this.getBaseRate() * this.workHour * (1 - super.calculateDiscount());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ExteriorService)) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return 10 * super.hashCode() + this.getPreNum().intValue();
  }

  @Override
  public String toString() {
    return super.toString() + " /Exterior Service";
  }
}
