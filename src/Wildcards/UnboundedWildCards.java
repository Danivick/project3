package Wildcards;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCards {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30, 40);

        List<Double> doubleList = Arrays.asList(11.5, 13.6, 67.8, 47.3);

        printList(intList);
        printList(doubleList);
    }
    private  static void printList(List <?>list){
        System.out.println(list);
    }

}
