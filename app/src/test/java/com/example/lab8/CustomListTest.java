package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    @Test
    public void testHasCity() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Edmonton", "AB"));
        cities.add(new City("Vancouver", "BC"));
        CustomList customList = new CustomList(null, cities);

        assertTrue(customList.hasCity("Edmonton"));
        assertTrue(customList.hasCity("Vancouver"));

        // Testing for a city that doesn't exist
        assertFalse(customList.hasCity("Toronto"));
    }

    @Test
    public void testDeleteCity() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Edmonton", "AB"));
        cities.add(new City("Vancouver", "BC"));
        CustomList customList = new CustomList(null, cities);

        assertTrue(customList.hasCity("Edmonton"));
        assertTrue(customList.hasCity("Vancouver"));

        // Deleting a city that exists
        customList.deleteCity("Edmonton");
        assertFalse(customList.hasCity("Edmonton"));

        // Deleting a city that doesn't exist, expect no changes
        customList.deleteCity("Toronto");
        assertFalse(customList.hasCity("Toronto"));
    }

    @Test
    public void testCountCities() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Edmonton", "AB"));
        cities.add(new City("Vancouver", "BC"));
        cities.add(new City("Toronto", "ON"));
        CustomList customList = new CustomList(null, cities);

        // Verify that the count is correct
        assertEquals(3, customList.getCount());
    }

}
