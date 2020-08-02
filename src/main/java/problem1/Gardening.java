package problem1;

public class Gardening extends ExteriorService {
  private final static Double WASTE_REMOVAL = 20.0;

  /**
   * Construct a new gardening service object based on information below.
   * @param address - property address for one new service.
   * @param propertySize - property size for one new service.
   * @param isMonthly - a boolean value to show if the property is monthly served.
   * @param preNum - a number to show how many time this property has been served before the new service.
   * @param petsNum - the number of pets the property has.
   * @param floorNum - the number of the floors the property has.
   */
  public Gardening(String address, Enum propertySize, boolean isMonthly, Double preNum,
  Double petsNum, Double floorNum){
    super(address, propertySize, isMonthly, preNum, petsNum, floorNum);
  }

  /**
   * override the calculatePrices method to calculate the price for the gardening service.
   * @return - the price of the gardening service.
   */
  @Override
  public double calculatePrices() {
    return super.calculatePrices() + WASTE_REMOVAL;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Gardening)) {
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
    return super.toString() + " /Gardening Service";
  }
}
