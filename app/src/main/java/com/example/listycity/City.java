package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * Constructor for City class
     * @param city
     * A string of the city name
     * @param province
     * A string of the province name
     */
    City(String city, String province){
        this.city=city;
        this.province=province;
    }

    /**
     * A getter for the city name
     * @return
     * A string of the city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * A getter for the province name
     * @return
     * A string of the province name
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares two city names
     * @param o
     * Other city to compare
     * @return
     * An integer of the difference between the two names
     */
    @Override
    public int compareTo(City o) {
        City city= (City)o;
        return this.city.compareTo(city.getCityName());
    }
}
