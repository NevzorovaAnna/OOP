package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DataProcessorTest{

    private final DataProcessor<Coffee> dataProcessor = new DataProcessor<>();

    private final List<Coffee> coffees = new ArrayList<>(Arrays.asList(
            new Coffee(20, 2, 10, 5),
            new Coffee(15, 7, 5, 10),
            new Coffee(10, 5, 0, 5),
            new Pirog(30, 2),
            new Pirog(35, 4)
    ));

    @Test
    void getAnotherCoffees() throws MyException{
        List<Coffee> filteredList = dataProcessor.getAnotherCoffees(10, 20, coffees);

        assertEquals(2,filteredList.size());
        assertEquals(15,filteredList.get(0).getCost());
        assertEquals(20, filteredList.get(1).getCost());
    }

    @Test
    void searchCost() {
        var searchResultFalse = dataProcessor.searchCost(5,coffees);
        var searchResultTrue = dataProcessor.searchCost(20, coffees);
        Optional<Coffee> searchResultEmpty = dataProcessor.searchCost(5, new ArrayList<>());

        assertFalse(searchResultEmpty.isPresent());
        assertFalse(searchResultFalse.isPresent());
        assertTrue(searchResultTrue.isPresent());
        assertEquals(1, searchResultTrue.get().id);
    }
    @Test
    void filterException() {
        assertThrows(Exception.class, () -> dataProcessor.getAnotherCoffees(20, 10, coffees));
    }
}