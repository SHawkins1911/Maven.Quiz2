package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    List<Integer> test = new ArrayList<>();
    int original = 0;
    public Boolean add(int i) {
        test.add(i);

        return true;

    }

    public Integer size() {

        int temp = test.size();

        return temp - original;
    }

    public List<Integer> getUnique() {
        return null;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {


        return test.contains(valueToAdd);
    }
}
