package problem1;

/**
 * An abstract class to create a specialist service including information below
 */

public abstract class SpecialistService extends Service {
  private Double baseRate;
  private boolean isComplex;
  private Double specialistNum;

  /**
   * Construct a new specialist service object based on information below.
   * @param address - property address for one new service.
   * @param propertySize - property size for one new service.
   * @param isMonthly - a boolean value to show if the property is monthly served.
   * @param preNum - a number to show how many time this property has been served before the new service.
   * @param petsNum - the number of pets the property has.
   * @param floorNum - the number of the floors the property has.
   * @param specialistNum - the number of the specialists.
   * @param isComplex - a boolean value to show if the property is complex.
   */
  public SpecialistService(String address, Enum propertySize, boolean isMonthly, Double preNum,
      Double petsNum, Double floorNum, Double specialistNum, boolean isComplex){
    super(address, propertySize, isMonthly, preNum, petsNum, floorNum);
    this.isComplex = isComplex;
    this.baseRate = 200.0;

    if ( specialistNum == 0 && !isComplex)
      this.specialistNum = 1.0;
    else if ( (specialistNum == 0 && this.isComplex) && this.getPropertySize() != PropertySize.Large)
      this.specialistNum = 2.0;
    else if ( (specialistNum == 0 && this.isComplex) && this.getPropertySize() == PropertySize.Large)
      this.specialistNum = 3.0;
    else
      this.specialistNum = specialistNum;
  }

  /**
   * get the base rate for the service.
   * @return - the base rate for the service.
   */
  public Double getBaseRate() {
    return baseRate;
  }

  /**
   * get a boolean value to show if the service is complex.
   * @return - true if the service is complex or false.
   */
  public boolean isComplex() {
    return isComplex;
  }

  /**
   * get the number of specialists needed.
   * @return - the number of specialists needed.
   */
  public Double getSpecialistNum() {
    return specialistNum;
  }

  /**
   * set the new base rate for the service.
   * @param baseRate - new base rate for the service.
   */
  public void setBaseRate(Double baseRate) {
    this.baseRate = baseRate;
  }

  /**
   * set if the service is complex.
   * @param complex - new boolean value for the service.
   */
  public void setComplex(boolean complex) {
    isComplex = complex;
  }

  /**
   * set the number of specialist for the property.
   * @param specialistNum -  new specialist number.
   */
  public void setSpecialistNum(Double specialistNum) {
    this.specialistNum = specialistNum;
  }

  /**
   * Override the calculatePrices method to calculate the price for specialist services.
   * @return - the price for the service.
   */
  @Override
  public double calculatePrices() {
    return this.specialistNum * this.baseRate;
  }

  /**
   * Override the calculateDiscount method. There is no override actually because there is no need
   * for calculating discount.
   * @return - 0 because there is no need to calculate discount.
   */
  @Override
  public double calculateDiscount() {
    return 0;
  }

  @Override
  public boolean equals(Object o) {
//    if (this == o) {
//      return true;
//    }
//    if (!(o instanceof NoneSpecialistService)) {
//      return false;
//    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return 10 * super.hashCode() + this.getPreNum().intValue();
  }

  @Override
  public String toString() {
    return super.toString() + " /Specialist Service";
  }
}
