package Main;

import java.util.Arrays;

public class ElectronicShop {
    private int[] keyboardPrices;

    private int[] usbDrivePrices;

    public ElectronicShop(int[] keyboardPrices, int[] usbDrivePrices) {
        this.keyboardPrices = keyboardPrices;
        this.usbDrivePrices = usbDrivePrices;
    }

    //Returns the cheapest keyboard
    public int cheapestKeyboard() {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < keyboardPrices.length; i++) {
            if(keyboardPrices[i] >= 0) {
                if (keyboardPrices[i] < min) {
                    min = keyboardPrices[i];
                }
            } else {
                System.out.println("Price of the keyboard must be a positive number");
                return 0;
            }
        }
        return min;
    }

    //Returns the most expensive object
    public int mostExpensiveObject() {
        int max = 0;

        for(int i = 0; i < keyboardPrices.length; i++) {
            if(keyboardPrices[i] >= 0) {
                if (keyboardPrices[i] > max) {
                    max = keyboardPrices[i];
                }
            } else {
                System.out.println("Price of the keyboard must be a positive number");
                return 0;
            }
        }

        for(int i = 0; i < usbDrivePrices.length; i++) {
            if(usbDrivePrices[i] >= 0) {
                if (usbDrivePrices[i] > max) {
                    max = usbDrivePrices[i];
                }
            } else {
                System.out.println("Price of the USB Drive must be a positive number");
                return 0;
            }
        }
        return max;
    }

    //Returns the most expensive keyboard that someone can buy with a certain budget
    public int mostExpensiveAffordableKeyboard(int budget) {
        if(budget < 0) {
            System.out.println("Budget must be a positive number");
            return 0;
        }
        int maxPrice = 0;
        for(int price : keyboardPrices) {
            if(price < budget && price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    //Returns the amount of money that someone spends on keyboard and usb drive
    public int amountOfMoneySpent(int budget) {
        if(budget <= 0) {
            System.out.println("Budget must be a positive number");
            return 0;
        }

        int moneySpent = 0;

        Arrays.sort(keyboardPrices);
        Arrays.sort(usbDrivePrices);

        for(int i = keyboardPrices.length - 1; i >= 0; i--) {
            for(int j = usbDrivePrices.length - 1; j >= 0; j--) {
                int totalCost = keyboardPrices[i] + usbDrivePrices[j];
                if(totalCost <= budget && totalCost > moneySpent) {
                    moneySpent = totalCost;
                }
            }
        }
        return moneySpent;
    }
}
