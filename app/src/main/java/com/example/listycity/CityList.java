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
     * this returns a sorted list of cities
     * @return
     *  Return the sorted list
     */
    public List<City>getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    public boolean hasCity(City city){
        for(City item : this.cities){
            if(item==city) {
                return true;
            }
        }
        return false;

    }

    public void delete(City city){
        this.cities.remove(city);

    }

    public int countCities(){
        int count=0;
        for(City item: this.cities){
            count+=1;
        }
        return count;
    }
}
