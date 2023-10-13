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
        int min = 999999999;

        for(int i = 0; i < keyboardPrices.length; i++) {
            if(keyboardPrices[i] < min) {
                min = keyboardPrices[i];
            }
        }
        return min;
    }

    //Returns the most expensive object
    public int mostExpensiveObject() {
        int max = 0;

        for(int i = 0; i < keyboardPrices.length; i++) {
            if(keyboardPrices[i] > max) {
                max = keyboardPrices[i];
            }
        }

        for(int i = 0; i < usbDrivePrices.length; i++) {
            if(usbDrivePrices[i] > max) {
                max = usbDrivePrices[i];
            }
        }
        return max;
    }

    //Returns the most expensive keyboard that someone can buy with a certain budget
    public int mostExpensiveAffordableKeyboard(int budget) {
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
        int moneySpent = 0;

        Arrays.sort(keyboardPrices);
        Arrays.sort(usbDrivePrices);

        for(int i = keyboardPrices.length - 1; i >= 0; i--) {
            for(int j = usbDrivePrices.length - 1; j >= 0; j--) {
                if(keyboardPrices[i] + usbDrivePrices[j] < budget && keyboardPrices[i] + usbDrivePrices[j] > moneySpent) {
                    moneySpent = keyboardPrices[i] + usbDrivePrices[i];
                }
            }
        }
        return moneySpent;
    }
}
