package problem1;

import java.util.Objects;

/**
 * An abstract class to create a non-specialist service including information below
 */
public abstract class NoneSpecialistService extends Service {
  private Double baseRate;
  private boolean isTenth = false;
  private static final Double TENTH_STD = 9.0;

  /**
   * Construct a new non-specialist service object based on information below.
   * @param address - property address for one new service.
   * @param propertySize - property size for one new service.
   * @param isMonthly - a boolean value to show if the property is monthly served.
   * @param preNum - a number to show how many time this property has been served before the new service.
   * @param petsNum - the number of pets the property has.
   * @param floorNum - the number of the floors the property has.
   */
  public NoneSpecialistService(String address, Enum propertySize, boolean isMonthly, Double preNum,
      Double petsNum, Double floorNum){
    super(address, propertySize, isMonthly, preNum, petsNum, floorNum);
    this.baseRate = 80.0;
  }

  /**
   * get the base rate for the service.
   * @return - the base rate for the service.
   */
  public Double getBaseRate() {
    return baseRate;
  }

  /**
   * determine if the service has the monthly discount.
   * @return - true if the service is qualified for the monthly discount or false if not.
   */
  public boolean isHalfDisct(){
    return this.isMonthly();
  }

  /**
   * determine if the service has the half discount.
   * @return - true if the service is qualified for the half discount or false if not.
   */
  public boolean isTenthDisct(){
    return this.getPreNum() % 10 == TENTH_STD;
  }

  /**
   * override the calculateDiscount method based on new information.
   * @return - different discount rate based on different information.
   */
  @Override
  public double calculateDiscount() {

    double monthlyDisct = 0.1;
    double tenthDisct = 0.5;
    double noDisct = 0.0;

    if (this.isTenthDisct())
      return tenthDisct;
    else if (this.isHalfDisct())
      return monthlyDisct;
    else
      return noDisct;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof NoneSpecialistService)) {
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
    return super.toString() + " /None Specialist Service";
  }
}
