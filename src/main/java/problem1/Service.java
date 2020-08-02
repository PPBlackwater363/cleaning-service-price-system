package problem1;

import java.util.Objects;

/**
 * An abstract class to create service including information below
 */
public abstract class Service implements CalculatePrices  {
  private String address;
  private Enum PropertySize;
  private boolean isMonthly;
  private Double preNum;
  private Double petsNum;
  private Double floorNum;

  /**
   * Construct a new abstract service object based on parameters below.
   * @param address - property address for one new service.
   * @param propertySize - property size for one new service.
   * @param isMonthly - a boolean value to show if the property is monthly served.
   * @param preNum - a number to show how many time this property has been served before the new service.
   * @param petsNum - the number of pets the property has.
   * @param floorNum - the number of the floors the property has.
   */
  public Service(String address, Enum propertySize, boolean isMonthly, Double preNum,
      Double petsNum, Double floorNum) {
    this.address = address;
    PropertySize = propertySize;
    this.isMonthly = isMonthly;
    this.preNum = preNum;
    this.petsNum = petsNum;
    this.floorNum = floorNum;
  }

  /**
   * get property's address.
   * @return - property's address.
   */
  public String getAddress() {
    return address;
  }

  /**
   * get property's size.
   * @return - enum value of the property's size.
   */
  public Enum getPropertySize() {
    return PropertySize;
  }

  /**
   * get a boolean value to show if the property is served monthly.
   * @return - true if the the property is served monthly or false.
   */
  public boolean isMonthly() {
    return isMonthly;
  }

  /**
   * get The number of services previously carried out at the address.
   * @return - how many times the property has been served before.
   */
  public Double getPreNum() {
    return preNum;
  }

  /**
   * get the number of pets the property has.
   * @return - the number of pets in the property.
   */
  public Double getPetsNum() {
    return petsNum;
  }

  /**
   * get the number of the floors of the property.
   * @return - the floor numbers.
   */
  public Double getFloorNum() {
    return floorNum;
  }

  /**
   * set the new address for the property.
   * @param address - new address for the property
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * set the new property size for the property.
   * @param propertySize -  new property size for the property.
   */
  public void setPropertySize(Enum propertySize) {
    PropertySize = propertySize;
  }

  /**
   * set the property as true if is is served monthly or false.
   * @param monthly - new boolean value for the property.
   */
  public void setMonthly(boolean monthly) {
    isMonthly = monthly;
  }

  /**
   * set new number for services previously carried out at the address.
   * @param preNum - new number for services previously carried out at the address.
   */
  public void setPreNum(Double preNum) {
    this.preNum = preNum;
  }

  /**
   * set the number of pets in the property.
   * @param petsNum - new number for pets in the property.
   */
  public void setPetsNum(Double petsNum) {
    this.petsNum = petsNum;
  }

  /**
   * set the new number of the floors in the property.
   * @param floorNum - new number of the floors in the property.
   */
  public void setFloorNum(Double floorNum) {
    this.floorNum = floorNum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Service)) {
      return false;
    }
    Service service = (Service) o;
    return isMonthly == service.isMonthly &&
        address.equals(service.address) &&
        PropertySize.equals(service.PropertySize) &&
        preNum.equals(service.preNum) &&
        petsNum.equals(service.petsNum) &&
        floorNum.equals(service.floorNum);
  }

  @Override
  public int hashCode() {
    int result = 20;
    result = 10 * result + this.address.hashCode();
    result = 10 * result + this.floorNum.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Service{" +
        "address='" + address + '\'' +
        ", PropertySize=" + PropertySize +
        ", isMonthly=" + isMonthly +
        ", preNum=" + preNum +
        ", petsNum=" + petsNum +
        ", floorNum=" + floorNum +
        '}';
  }
}
