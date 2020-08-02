package problem1;

import java.util.Objects;

/**
 * An abstract class to create a interior service including information below
 */
public abstract class InteriorService extends NoneSpecialistService {
  protected Double workHour;
  private static final Double lessPetsRate = 0.05;
  private static final Double morePetsRate = 0.07;
  private final static Double LESS_PETS_NUM = 3.0;
  private final static Double BASE_PETS_RATE = 1.0;

  /**
   * Construct a new interior service object based on information below.
   * @param address - property address for one new service.
   * @param propertySize - property size for one new service.
   * @param isMonthly - a boolean value to show if the property is monthly served.
   * @param preNum - a number to show how many time this property has been served before the new service.
   * @param petsNum - the number of pets the property has.
   * @param floorNum - the number of the floors the property has.
   */
  public InteriorService(String address, Enum propertySize, boolean isMonthly, Double preNum,
      Double petsNum, Double floorNum){
    super(address, propertySize, isMonthly, preNum, petsNum, floorNum);
  }

  /**
   * calculate the rate for increasing the price per the number of pets.
   * @return - new rate for increasing the price based on the number of pets.
   */
  public double calculatePetsRate(){
    if (this.getPetsNum() == 0)
      return BASE_PETS_RATE;
    else if (this.getPetsNum() < LESS_PETS_NUM)
      return BASE_PETS_RATE + lessPetsRate;
    else
      return BASE_PETS_RATE + morePetsRate;
  }

  /**
   * override the calculatePrices method per information of the abstract class.
   * @return the price for the interior service.
   */
  @Override
  public double calculatePrices() {
    return this.workHour * this.getBaseRate() * this.calculatePetsRate() *
        (1 - super.calculateDiscount());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof InteriorService)) {
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
    return super.toString() + " /Interior Service";
  }

}
