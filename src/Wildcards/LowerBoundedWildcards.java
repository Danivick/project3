package Wildcards;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcards {
    public static void main(String[] args) {
        List<Integer>intList = Arrays.asList(10,20,30,40);
        printOnlyIntegerClassorSuperClass(intList);

        List<Number> numberList = Arrays.asList(10,20,30,40);
        printOnlyIntegerClassorSuperClass(numberList);
    }

    public static void printOnlyIntegerClassorSuperClass(List<?super Integer > List){
        System.out.println(List);
    }
}
