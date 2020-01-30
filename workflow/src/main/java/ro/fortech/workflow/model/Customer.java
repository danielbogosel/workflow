package ro.fortech.workflow.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

  @Id
  @GeneratedValue
  private Integer customerId;
  private String name;
  private String country;
  private String address;

  public Customer(String name, String country, String address) {
    this.name = name;
    this.country = country;
    this.address = address;
  }

  public Customer() {
  }

  public Integer getCustomerId() {
    return customerId;
  }

  public String getName() {
    return name;
  }

  public String getCountry() {
    return country;
  }

  public String getAddress() {
    return address;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(customerId, customer.customerId) &&
        Objects.equals(name, customer.name) &&
        Objects.equals(country, customer.country) &&
        Objects.equals(address, customer.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, name, country, address);
  }

  @Override
  public String toString() {
    return "Customer{" +
        "customerId=" + customerId +
        ", name='" + name + '\'' +
        ", country='" + country + '\'' +
        ", address='" + address + '\'' +
        '}' + '\n';
  }
}
