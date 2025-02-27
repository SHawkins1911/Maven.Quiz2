package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    private Integer input;

    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public Boolean isWu() {
        if (input >= 3 && input % 3 == 0) {
            return true;
        }
        return false;
    }

    public Boolean isTang() {
        if (input >= 5 && input % 5 == 0) {
            return true;
        }
        return false;
    }

    public Boolean isWuTang() {
        if (isWu() && isTang()) {
            return true;
        }
        return false;
    }
}