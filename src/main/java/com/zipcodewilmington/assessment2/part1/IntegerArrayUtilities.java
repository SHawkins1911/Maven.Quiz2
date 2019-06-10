package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;
import java.util.List;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length%2 == 0;
    }

    public Integer[] range(int start, int stop) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i <= stop ; i++) {
            result.add(i);
        }

        return result.toArray(new Integer[result.size()]);
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array [1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int x = array[array.length-1];
        int y = array[array.length-2];
        return x*y;
    }

}
