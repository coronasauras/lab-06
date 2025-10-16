package com.example.listycity;

/**
 * This is a class that defines a city
 */
public class City {
    /**
     * The name of the city
     */
    private String city;
    /**
     * The province where the city is located in
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
}
