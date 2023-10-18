package Main;

public class ArrayOperations {
    public int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    // Returns the biggest number in the array
    public int maxNumber() {
        int max = Integer.MIN_VALUE;

        for (int i : numbers) {
            if(i > max) {
                max = i;
            }
        }

        return max;
    }

    // Returns the smallest number in the array
    public int minNumber() {
        int min = Integer.MAX_VALUE;

        for (int i : numbers) {
            if(i < min) {
                min = i;
            }
        }

        return min;
    }

    // Calculates the maximal sum of n-1 numbers
    public int maxSum() {
        int sum = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        for(int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    // Calculates the minimal sum of n-1 numbers
    public int minSum() {
        int sum = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        for(int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }
}
