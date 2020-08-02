package problem1;

public class WindowCleaning extends ExteriorService {
  private final static Double GLASS_FEE = 1.05;
  private final static Double NO_GLASS_FEE = 1.00;
  private final static Double FLOOR_STD = 1.00;
  private final static Double MAX_FLOOR = 3.00;

  /**
   * Construct a new window cleaning service object based on information below.
   * @param address - property address for one new service.
   * @param propertySize - property size for one new service.
   * @param isMonthly - a boolean value to show if the property is monthly served.
   * @param preNum - a number to show how many time this property has been served before the new service.
   * @param petsNum - the number of pets the property has.
   * @param floorNum - the number of the floors the property has.
   */
  public WindowCleaning(String address, Enum propertySize, boolean isMonthly, Double preNum,
      Double petsNum, Double floorNum){
    super(address, propertySize, isMonthly, preNum, petsNum, floorNum);
    if (this.getFloorNum() > MAX_FLOOR )
      throw new IllegalArgumentException("Can't create a valid job.");
  }

  /**
   * calculate if there is an additional fee for window cleaning.
   * @return - a number of rate used to increase the price.
   */
  public double calculateGlassFee(){
    if (this.getFloorNum() > FLOOR_STD)
      return GLASS_FEE;
    else
      return NO_GLASS_FEE;
  }

  /**
   * override the calculatePrices method to calculate the price for the window cleaning service.
   * @return - the price of the window cleaning service.
   */
  @Override
  public double calculatePrices() {
    return super.calculatePrices() * this.calculateGlassFee();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof WindowCleaning)) {
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
    return super.toString() + " /WindowCleaning Service";
  }
}
