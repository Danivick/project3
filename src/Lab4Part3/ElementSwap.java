package Lab4Part3;

public class ElementSwap {
    int[] numbers = {1,2,3,5,10};
    int el1;
    int el2;


    public ElementSwap(){
        int el1 = 0;
        int el2 = 3;
        int temp = numbers[el1];
        numbers[el1] = numbers[el2];
        numbers[el2] = temp;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ElementSwap run = new ElementSwap();
        System.out.println();
    }
}
