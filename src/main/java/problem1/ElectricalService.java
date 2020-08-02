package problem1;

public class ElectricalService extends SpecialistService{
  private final static Double ELECTRICAL_PERMITTING_FEE = 50.0;

  /**
   * Construct a new electrical service object based on information below.
   * @param address - property address for one new service.
   * @param propertySize - property size for one new service.
   * @param isMonthly - a boolean value to show if the property is monthly served.
   * @param preNum - a number to show how many time this property has been served before the new service.
   * @param petsNum - the number of pets the property has.
   * @param floorNum - the number of the floors the property has.
   * @param specialistNum - the number of the specialists.
   * @param isComplex - a boolean value to show if the property is complex.
   */
  public ElectricalService(String address, Enum propertySize, boolean isMonthly, Double preNum,
      Double petsNum, Double floorNum, Double specialistNum, boolean isComplex) {
    super(address, propertySize, isMonthly, preNum, petsNum, floorNum, specialistNum, isComplex);
    if (this.getSpecialistNum() > 4 )
      throw new IllegalArgumentException("Can't create a job with more than 4 specialists");
  }

  /**
   * override the calculatePrices method to calculate the price for the electrical service.
   * @return - the price of the electrical service.
   */
  @Override
  public double calculatePrices() {
    return super.calculatePrices() + ELECTRICAL_PERMITTING_FEE;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ElectricalService)) {
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
    return super.toString() + " /Electrical Service";
  }
}
