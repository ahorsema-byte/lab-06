package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities= new ArrayList<>();

    /**
     * this adds a city to the list if the city does not exist
     * @param city
     * this is a candidate city to add
     */
    public void add(City city){
        if(cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *  Return the sorted list
     */
    public List<City>getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This returns true or false, depending on whether the city is in the list or not.
     * @param city
     * the city being checked
     * @return
     * false if the city is not in the list
     * true if the city is in the list
     */
    public boolean hasCity(City city){
        return this.cities.contains(city);
    }

    /**
     * Removes a city from the list.
     * Throws an exception if that city was not in the list originally
     * @param city
     * The city to be removed
     */
    public void delete(City city){
        if (hasCity(city)) {
            this.cities.remove(city);
        }
        else {
            throw new IllegalArgumentException();
        }

    }

    /**
     * Counts the number of cities in the list
     * @return
     * An integer representing the number of cities in the list
     */
    public int countCities(){
        int count=0;
        for(City item: this.cities){
            count+=1;
        }
        return count;
    }
}
