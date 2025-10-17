package com.example.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    /**
     * Internal list of cities
     */
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city the City to add
     * @throws IllegalArgumentException if the city already exists
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Return whether the given city is in the list
     * @param city the City to check
     * @return true if the city is present, false if not
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Removes city if present
     * @param city the City to remove
     * @throws IllegalArgumentException if the city is not found
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities in the list
     * @return the count of cities
     */
    public int countCities() {
        return cities.size();
    }
}