package org.example;

import javax.lang.model.type.MirroredTypeException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DataProcessor<T extends Coffee> {
    public List<T> getAnotherCoffees(int min, int max, List<T> list) throws MyException{
        if (max<min) throw new MyException("Максимальное значение меньше минимального");
        return list.stream()
                .filter(item -> item.getCost()>min && item.getCost()<=max)
                .sorted((a,b)->{
                    return Integer.compare(a.getCost(), b.getCost());
                })
                .limit(2)
                .toList();
    }

    public Optional<T> searchCost(Integer cost, List<T> list){
        return list.stream()
                .filter(item -> item.getCost()==cost).findFirst();
    }
}


