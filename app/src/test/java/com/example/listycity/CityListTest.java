package com.example.listycity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CityListTest {
    private CityList mockCityList(){
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity(){
        return new City("Edmonton","Alberta");
    }

    @Test
    void testAdd(){
        CityList cityList = mockCityList();
        assertEquals(1,cityList.getCities().size());
        City city = new City("Saskatoon","Saskatchewan");
        cityList.add(city);
        assertEquals(2,cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }
    @Test
    void testAddException(){
        CityList cityList = mockCityList();
        City city = new City("YellowKnife", "Northwest Territories");
        cityList.add(city);
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }

    @Test
    void testGetCities(){
        CityList cityList = mockCityList();
        assertEquals(0,mockCity().compareTo(cityList.getCities().get(0)));
        City city = new City("Iqaluit", "Nunavut");
        cityList.add(city);
        assertEquals(0,city.compareTo(cityList.getCities().get(0)));
        assertEquals(0,mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    void testHasCity(){
        CityList cityList = mockCityList();
        City cityTrue = mockCity();
        City cityFalse = new City("Saskatoon","Saskatchewan");
        assertTrue(cityList.hasCity(cityTrue));
        assertFalse(cityList.hasCity(cityFalse));
    }

    @Test
    void testDeleteCity(){
        CityList cityList= mockCityList();
        City cityTrue = mockCity();
        City cityExcept = new City("Saskatoon","Saskatchewan");
        cityList.delete(cityTrue);
        assertEquals(0,cityList.countCities());
        assertThrows(IllegalArgumentException.class, () ->{
            cityList.delete(cityExcept);
        });
    }

    @Test
    void testCountCities(){
        CityList cityList= mockCityList();
        City extraCity = new City("Saskatoon", "Saskatchewan");
        cityList.add(extraCity);
        assertEquals(2,cityList.countCities());
        cityList.delete(extraCity);
        cityList.delete(mockCity());
        assertEquals(0,cityList.countCities());
    }
}
