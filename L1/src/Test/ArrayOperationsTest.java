package Test;

import Main.ArrayOperations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {

    @Test
    void maxNumber() {
        System.out.println("\n2.1 Testing maxNumber");

        // Test with positive numbers
        int[] input1 = {3, 8, 1, 5, 12};
        ArrayOperations operations1 = new ArrayOperations(input1);
        assertEquals(12, operations1.maxNumber());

        // Test with negative numbers
        int[] input2 = {-5, -2, -9, -1};
        ArrayOperations operations2 = new ArrayOperations(input2);
        assertEquals(-1, operations2.maxNumber());

        // Test with empty array, expecting Integer.MIN_VALUE as there is no maximum
        int[] input3 = {};
        ArrayOperations operations3 = new ArrayOperations(input3);
        assertEquals(Integer.MIN_VALUE, operations3.maxNumber());
        System.out.println("2.1 maxNumber Test passed\n");
    }

    @Test
    void minNumber() {
        System.out.println("\n2.2 Testing minNumber");

        // Test with positive numbers
        int[] input1 = {3, 8, 1, 5, 12};
        ArrayOperations operations1 = new ArrayOperations(input1);
        assertEquals(1, operations1.minNumber());

        // Test with negative numbers
        int[] input2 = {-5, -2, -9, -1};
        ArrayOperations operations2 = new ArrayOperations(input2);
        assertEquals(-9, operations2.minNumber());

        // Test with empty array, expecting Integer.MAX_VALUE as there is no minimum
        int[] input3 = {};
        ArrayOperations operations3 = new ArrayOperations(input3);
        assertEquals(Integer.MAX_VALUE, operations3.minNumber());

        System.out.println("2.2 minNumber Test passed\n");
    }

    @Test
    void maxSum() {
        System.out.println("\n2.3 Testing maxSum");

        // Test with positive numbers
        int[] input1 = {3, 8, 1, 5, 12};
        ArrayOperations operations1 = new ArrayOperations(input1);
        assertEquals(28, operations1.maxSum());

        // Test with negative numbers
        int[] input2 = {-5, -2, -9, -1};
        ArrayOperations operations2 = new ArrayOperations(input2);
        assertEquals(-8, operations2.maxSum());

        // Test with empty array, expecting 0 as there is no sum to calculate
        int[] input3 = {};
        ArrayOperations operations3 = new ArrayOperations(input3);
        assertEquals(0, operations3.maxSum());

        System.out.println("2.3 maxSum Test passed\n");
    }

    @Test
    void minSum() {
        System.out.println("\n2.4 Testing minSum");

        // Test with positive numbers
        int[] input1 = {3, 8, 1, 5, 12};
        ArrayOperations operations1 = new ArrayOperations(input1);
        assertEquals(17, operations1.minSum());

        // Test with negative numbers
        int[] input2 = {-5, -2, -9, -1};
        ArrayOperations operations2 = new ArrayOperations(input2);
        assertEquals(-16, operations2.minSum());

        // Test with empty array, expecting 0 as there is no sum to calculate
        int[] input3 = {};
        ArrayOperations operations3 = new ArrayOperations(input3);
        assertEquals(0, operations3.minSum());

        System.out.println("2.4 minSum Test passed\n");
    }
}

