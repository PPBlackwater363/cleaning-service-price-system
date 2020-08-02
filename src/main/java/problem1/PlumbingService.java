package problem1;

public class PlumbingService extends SpecialistService{
  private final static Double PLUMBING_PERMITTING_FEE = 20.0;

  /**
   * Construct a new plumbing service object based on information below.
   * @param address - property address for one new service.
   * @param propertySize - property size for one new service.
   * @param isMonthly - a boolean value to show if the property is monthly served.
   * @param preNum - a number to show how many time this property has been served before the new service.
   * @param petsNum - the number of pets the property has.
   * @param floorNum - the number of the floors the property has.
   * @param specialistNum - the number of the specialists.
   * @param isComplex - a boolean value to show if the property is complex.
   */
  public PlumbingService(String address, Enum propertySize, boolean isMonthly, Double preNum,
      Double petsNum, Double floorNum, Double specialistNum, boolean isComplex) {
    super(address, propertySize, isMonthly, preNum, petsNum, floorNum, specialistNum, isComplex);
  }

  /**
   * override the calculatePrices method to calculate the price for the plumbing service.
   * @return - the price of the plumbing service.
   */
  @Override
  public double calculatePrices() {
    return super.calculatePrices() + PLUMBING_PERMITTING_FEE;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof PlumbingService)) {
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
    return super.toString() + " /Plumbing Service";
  }
}
