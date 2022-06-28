package Wildcards;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30, 40);
        System.out.println("Total sum is: " + sum(intList));

        List<Double> doubleList = Arrays.asList(13.2, 15.6, 9.7, 22.5);
        System.out.println("Total sum is: " + sum(doubleList));
    }
    private static double sum(List < ?extends Number > myList) {
        double sum = 0.0;
        for(Number iterator: myList){
            sum = sum + iterator.doubleValue();
        }
        return sum;
    }
}
