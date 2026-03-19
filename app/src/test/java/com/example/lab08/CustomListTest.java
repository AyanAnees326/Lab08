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
}