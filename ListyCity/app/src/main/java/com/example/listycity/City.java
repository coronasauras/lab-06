package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a city
 */
public class City implements Comparable{
    /**
     * The name of the city
     */
    private String city;
    /**
     * The name of province where the city is located
     */
    private String province;

    /**
     * Constructs a new city, with specified city name and province name
     * @param city the name of the city
     * @param province the name of the province where the city is located
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city
     * @return the city name as a String
     */
    String getCityName() {

        return this.city;
    }

    /**
     * Returns the name of the province where the city is located
     * @return the province name as a string
     */
    String getProvinceName() {

        return this.province;
    }

    /**
     * Compares this City object with another City object
     * @param o the object to be compared
     * @return a negative integer, zero, or a positive integer as this city name is less than, equal to, or greater than the specified name (lexicographically)
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * Two City objects are equal if both name and province match
     * @param o the object to compare with
     * @return true if o is a City with identical name and province
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof City)) {
            return false;
        }
        City that = (City) o;
        return city.equals(that.city) && province.equals(that.province);
    }

    /**
     * Generates a hash code based on city name and province
     * @return hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
