package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * this returns a sorted list of cities
     * @return
     *      return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks whether a given city is in the list
     * @param city
     *      city to check for in the list
     * @return
     *      return true if city in list, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * deletes city from list if it exists
     * @param city
     *      city to delete
     * @throws IllegalArgumentException
     *      if the city doesn't exist in the list
     */
    public void delete(City city) {
        if (!hasCity(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * returns the number of cities in the list
     * @return
     *      total number of cities in the list
     */
    public int countCities() {
        return cities.size();
    }
}
