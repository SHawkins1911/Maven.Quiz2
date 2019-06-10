package com.zipcodewilmington.assessment2.part2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListUtilityTest {

    @Test
    public void add() {
        List<Integer> test = new ArrayList<>();
        int i = 5;

        test.add(i);

        Assert.assertTrue(test.contains(5));
    }

    @Test
    public void size() {
        List<Integer> test = new ArrayList<>();

        test.add(5);
        test.add(6);

        Integer expected = 2;
        Integer actual = test.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUnique() {
    }

    @Test
    public void join() {
    }

    @Test
    public void mostCommon() {
    }

    @Test
    public void contains() {
    }
}