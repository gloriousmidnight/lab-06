package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Constructs a new city w/ name and province
     * @param city
     *      city name
     * @param province
     *      province name
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * returns city name
     * @return
     *      city name
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * returns province name
     * @return
     *      province name
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * compares this city w/ another city based on city name alphabetically
     * @param o
     *      city to be compared
     * @return
     *      negative int if city name less than o, zero if equal, positive if greater
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * indicates whether other object equal to this City, equal if city and
     * province names equal
     * @param o   the reference object with which to compare.
     * @return
     *      ture if equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }

    /**
     * returns hash code for this City based on city name/province
     * @return
     *      hash code value for this City
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
