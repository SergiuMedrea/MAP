package Test;

import Main.NumbersAsArrayOperations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumbersAsArrayOperationsTest {

    @Test
    void sameLengthNumbersSum() {
        System.out.println("\n3.1 Testing sum");

        // Test with two same-length positive numbers
        int[] num1 = {1, 2, 3};
        int[] num2 = {4, 5, 6};
        NumbersAsArrayOperations operations1 = new NumbersAsArrayOperations(num1, num2);
        int[] expectedSum1 = {0, 5, 7, 9};
        int[] result1 = operations1.sameLengthNumbersSum();
        assertArrayEquals(expectedSum1, result1);

        // Test with two same-length negative numbers
        int[] num3 = {-1, -2, -3};
        int[] num4 = {-4, -5, -6};
        NumbersAsArrayOperations operations2 = new NumbersAsArrayOperations(num3, num4);
        int[] expectedSum2 = {0, -5, -7, -9};
        int[] result2 = operations2.sameLengthNumbersSum();
        assertArrayEquals(expectedSum2, result2);

        // Test with two numbers of different lengths, expecting "Numbers must have the same length"
        int[] num5 = {1, 2, 3};
        int[] num6 = {4, 5, 6, 7};
        NumbersAsArrayOperations operations3 = new NumbersAsArrayOperations(num5, num6);
        assertNull(operations3.sameLengthNumbersSum());

        System.out.println("3.1 Sum Test passed\n");
    }

    @Test
    void sameLengthNumbersDifference() {
        System.out.println("\n3.2 Testing difference");

        // Test with two same-length positive numbers (num1 > num2)
        int[] num1 = {7, 2, 5};
        int[] num2 = {4, 1, 3};
        NumbersAsArrayOperations operations1 = new NumbersAsArrayOperations(num1, num2);
        int[] expectedDiff1 = {3, 1, 2};
        int[] result1 = operations1.sameLengthNumbersDifference();
        assertArrayEquals(expectedDiff1, result1);

        // Test with two same-length positive numbers (num1 < num2)
        int[] num3 = {4, 1, 3};
        int[] num4 = {7, 2, 5};
        NumbersAsArrayOperations operations2 = new NumbersAsArrayOperations(num3, num4);
        int[] expectedDiff2 = {6, 8, 8};
        int[] result2 = operations2.sameLengthNumbersDifference();
        assertArrayEquals(expectedDiff2, result2);

        // Test with two numbers of different lengths, expecting "Numbers must have the same length"
        int[] num5 = {1, 2, 3};
        int[] num6 = {4, 5, 6, 7};
        NumbersAsArrayOperations operations3 = new NumbersAsArrayOperations(num5, num6);
        assertNull(operations3.sameLengthNumbersDifference());

        System.out.println("3.2 Difference Test passed\n");
    }

    @Test
    void singleDigitNumberMultiplication() {
        System.out.println("\n3.3 Testing multiplication");

        // Test with a positive number and a single digit positive multiplier
        int[] num1 = {1, 2, 3};
        NumbersAsArrayOperations operations1 = new NumbersAsArrayOperations(num1, new int[]{});
        int multiplier1 = 3;
        int[] expectedMul1 = {0, 3, 6, 9};
        int[] result1 = operations1.singleDigitNumberMultiplication(multiplier1);
        assertArrayEquals(expectedMul1, result1);

        // Test with a negative number and a single digit negative multiplier
        int[] num2 = {-1, -2, -3};
        NumbersAsArrayOperations operations2 = new NumbersAsArrayOperations(num2, new int[]{});
        int multiplier2 = -2;
        int[] expectedMul2 = {0, 2, 4, 6};
        int[] result2 = operations2.singleDigitNumberMultiplication(multiplier2);
        assertArrayEquals(expectedMul2, result2);

        System.out.println("3.3 Multiplication Test passed\n");
    }

    @Test
    void singleDigitNumberDivision() {
        System.out.println("\n3.4 Testing division");

        // Test with a positive number and a single digit positive divisor
        int[] num1 = {3, 6, 9};
        NumbersAsArrayOperations operations1 = new NumbersAsArrayOperations(num1, new int[]{});
        int divisor1 = 3;
        int[] expectedDiv1 = {1, 2, 3};
        assertArrayEquals(expectedDiv1, operations1.singleDigitNumberDivision(divisor1));

        // Test with a negative number and a single digit positive divisor
        int[] num2 = {-3, -6, -9};
        NumbersAsArrayOperations operations2 = new NumbersAsArrayOperations(num2, new int[]{});
        int divisor2 = 3;
        int[] expectedDiv2 = {-1, -2, -3};
        assertArrayEquals(expectedDiv2, operations2.singleDigitNumberDivision(divisor2));

        // Test with a positive number and divisor 0, expecting "The division with 0 is not accepted"
        int[] num3 = {3, 6, 9};
        NumbersAsArrayOperations operations3 = new NumbersAsArrayOperations(num3, new int[]{});
        int divisor3 = 0;
        assertNull(operations3.singleDigitNumberDivision(divisor3));

        System.out.println("3.4 Division Test passed\n");
    }
}
