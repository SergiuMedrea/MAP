package Main;

public class NumbersAsArrayOperations {
        private int[] number1;
        private int[] number2;

        public NumbersAsArrayOperations(int[] number1, int[] number2) {
                this.number1 = number1;
                this.number2 = number2;
        }

        //Calculates the sum between the numbers that have the same number of digits
        public void sameLengthNumbersSum() {
                int[] sum = new int[number1.length + 1];
                int carry = 0;

                if (number1.length == number2.length) {
                        for (int i = 0; i < number1.length; i++) {
                                int digit1 = (i < number1.length) ? number1[number1.length - 1 - i] : 0;
                                int digit2 = (i < number2.length) ? number2[number2.length - 1 - i] : 0;

                                int digitSum = digit1 + digit2 + carry;
                                carry = digitSum / 10;
                                sum[number1.length - i] = digitSum % 10;

                        }
                        sum[0] = carry;

                        for (int i = 0; i < sum.length; i++) {
                                System.out.println(sum[i] + " ");
                        }
                } else {
                        System.out.println("Numbers must have the same length");
                }
        }

        //Calculates the sum between the numbers that have the same number of digits
        public void sameLengthNumbersDifference() {
                int[] diff = new int[number1.length];
                int carry = 0;

                if (number1.length == number2.length) {
                        for (int i = number1.length - 1; i >= 0; i--) {
                                int digit1 = number1[i];
                                int digit2 = number2[i];

                                int digitDiff = digit1 - digit2 - carry;
                                if (digitDiff < 0) {
                                        digitDiff += 10;
                                        carry = 1;
                                } else {
                                        carry = 0;
                                }
                                diff[i] = digitDiff;
                        }

                        for (int i = 0; i < diff.length; i++) {
                                System.out.println(diff[i] + " ");
                        }
                } else {
                        System.out.println("Numbers must have the same length");
                }
        }

        //Calculate the multiplication between a big number and a single digit number
        public void singleDigitNumberMultiplication(int n) {
                int[] mul = new int[number1.length + 1];
                int carry = 0;

                for (int i = number1.length - 1; i >= 0; i--) {
                        int digit = number1[i];
                        int digitMul = digit * n + carry;
                        carry = digitMul / 10;
                        mul[i + 1] = digitMul % 10;
                }
                mul[0] = carry;

                for(int i = 0 ; i < mul.length; i++) {
                        System.out.println(mul[i] + " ");
                }
        }

        //Calculate the division between a big number and a single digit number
        public void singleDigitNumberDivision(int n) {
                int[] div = new int[number1.length];
                int carry = 0;

                if(n != 0) {
                        for(int i = 0; i < number1.length; i++) {
                                int digit = number1[i];
                                int digitDiv = digit + carry * 10;
                                carry = digitDiv % n;
                                div[i] = digitDiv / n;
                        }
                        for(int i = 0; i < div.length; i++) {
                                System.out.println(div[i] + " ");
                        }
                } else {
                        System.out.println("The division with 0  is not accepted");
                }
        }
}
