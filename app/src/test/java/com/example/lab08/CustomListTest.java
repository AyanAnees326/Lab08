package com.example.lab08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList customList = new CustomList();

        City city1 = new City("Lahore", "Punjab");
        City city2 = new City("Karachi", "Sindh");

        customList.addCity(city1);

        assertTrue(customList.hasCity(city1));
        assertFalse(customList.hasCity(city2));
    }

    @Test
    public void testDeleteCity() {
        CustomList customList = new CustomList();

        City city1 = new City("Lahore", "Punjab");
        City city2 = new City("Karachi", "Sindh");

        customList.addCity(city1);
        customList.addCity(city2);

        customList.deleteCity(city1);

        assertFalse(customList.hasCity(city1));
        assertTrue(customList.hasCity(city2));
    }

    @Test
    public void testCountCities() {
        CustomList customList = new CustomList();

        City city1 = new City("Lahore", "Punjab");
        City city2 = new City("Karachi", "Sindh");

        assertEquals(0, customList.countCities());

        customList.addCity(city1);
        assertEquals(1, customList.countCities());

        customList.addCity(city2);
        assertEquals(2, customList.countCities());
    }
}