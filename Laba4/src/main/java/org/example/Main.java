package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws MyException {
        List<Coffee> coffees = new ArrayList<>(Arrays.asList(
                new Coffee(20, 2, 10, 5),
                new Coffee(15, 7, 5, 10),
                new Coffee(10, 5, 0, 5),
                new Pirog(30, 2),
                new Pirog(35, 4)
        ));

        List<Barista> barista = new ArrayList<>(Arrays.asList(
                new Barista("Александр"),
                new Barista("Евгений"),
                new Barista("Григорий"),
                new Barista("Глеб"),
                new Barista("Антон")
        ));

        StaticEda.Pribyl(coffees);
        StaticEda.Print(coffees);


        DataProcessor<Coffee> dataProcessor = new DataProcessor<>();

        System.out.println();
        System.out.println("Необходимо вывести кофе, где стоимость больше 10, но меньше или равна 20,\n" +
                "отсортированный по увеличению стоимости максимумом в 2 элемента.\n" +
                "Сделать по поиск по стоимости.");
        System.out.println();

        List<Coffee> filteredList = dataProcessor.getAnotherCoffees(10, 20, coffees);
        Optional<Coffee> SearchResults = dataProcessor.searchCost(20, coffees);
        System.out.println("Сортировка:");
        for (Coffee item : filteredList){
            item.getInfo();
        }
        System.out.println("Поиск:");
        SearchResults.ifPresent(Coffee::getInfo);
        System.out.println("------------------------");
    }
}
