package com.tai.Address;

import java.util.Objects;

/**
 * The type Address.
 */
public class Address {
    private String provinces;
    private String city;
    private String town;

    /**
     * Instantiates a new Address.
     *
     * @param provinces the provinces
     * @param city      the city
     * @param town      the town
     */
    public Address(String provinces, String city, String town) {
        this.provinces = provinces;
        this.city = city;
        this.town = town;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(provinces, address.provinces) && Objects.equals(city, address.city) && Objects.equals(town, address.town);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provinces, city, town);
    }

    @Override
    public String toString() {
        return "Address{" +
                "provinces='" + provinces + '\'' +
                ", city='" + city + '\'' +
                ", town='" + town + '\'' +
                '}';
    }

    /**
     * Gets provinces.
     *
     * @return the provinces
     */
    public String getProvinces() {
        return provinces;
    }

    /**
     * Sets provinces.
     *
     * @param provinces the provinces
     */
    public void setProvinces(String provinces) {
        this.provinces = provinces;
    }

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets town.
     *
     * @return the town
     */
    public String getTown() {
        return town;
    }

    /**
     * Sets town.
     *
     * @param town the town
     */
    public void setTown(String town) {
        this.town = town;
    }
}
