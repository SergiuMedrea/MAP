package Test;

import Main.ArrayOperations;

public class ArrayOperationsTest {
    int[] numbers = {4, 8, 3, 10, 17};

    ArrayOperations arrayOperations = new ArrayOperations(numbers);

    //Test maxNumber
    public void maxNumberTest() {
        assert arrayOperations.maxNumber() == 17;
        assert arrayOperations.maxNumber() != 17;
        System.out.println("2.1 maxNumberTest passed");
    }


    //Test minNumber
    public void minNumberTest() {
        assert arrayOperations.minNumber() == 3;
//        assert arrayOperations.minNumber() != 3;
        System.out.println("2.2 minNumberTest passed");
    }

    //Test maxSum
    public void maxSumTest() {
        assert arrayOperations.maxSum() == 39;
//        assert arrayOperations.maxSum() != 39;
        System.out.println("2.3 maxSumTest passed");
    }

    //Test minSum
    public void minSumTest() {
        assert arrayOperations.minSum() == 25;
//        assert arrayOperations.mimSum() != 25;
        System.out.println("2.4 minSumTest passed");

    }
}
