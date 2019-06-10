package com.zipcodewilmington.assessment2.part2;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int length = array1.length + array2.length;
       Integer [] result = new Integer[length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);

        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        List<Integer> result = Arrays.asList(array);
        Collections.rotate(result, index-1);
        Integer [] outcome = result.toArray(new Integer[result.size()]);
        return outcome;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count1 = 0;
        int count2 =0;

        for (Integer value : array1) {
            if (value == valueToEvaluate) {
                count1++;
            }
            for (Integer integer : array2)
                if (integer == valueToEvaluate) {
                    count2++;
                }
        }
        return count1 + count2;
    }

    public Integer mostCommon(Integer[] array) {
        Arrays.sort(array);
        int max = 1;
        int tempCount;
        int temp = 0;
        Integer result = array[0];
        int n = array.length;
        for (int i = 0; i <= n-1 ; i++) {
            temp = (Integer)array[i];
            tempCount = 0;
            for (int j = 1; j < n ; j++) {

                if (temp == (Integer)array[j]){
                    tempCount++;
                }
                if(tempCount > max){
                    result = temp;
                    max = (Integer)array[i-1];
                }
            }
        }


        return result;
    }
}
