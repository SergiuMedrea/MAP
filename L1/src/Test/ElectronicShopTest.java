package Test;

import Main.ElectronicShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectronicShopTest {

    @Test
    void cheapestKeyboard() {
        System.out.println("\n4.1 Testing cheapestKeyboard");

        // Test with positive keyboard prices
        int[] keyboardPrices = {30, 50, 20, 10};
        int[] usbDrivePrices = {40, 60, 25, 15};
        ElectronicShop electronicShop = new ElectronicShop(keyboardPrices, usbDrivePrices);
        assertEquals(10, electronicShop.cheapestKeyboard());

        // Test with negative keyboard prices, expecting 0 as the minimum price
        int[] negativePrices = {-20, -10, -5};
        int[] usbDrivePrices2 = {40, 60};
        ElectronicShop electronicShop2 = new ElectronicShop(negativePrices, usbDrivePrices2);
        assertEquals(0, electronicShop2.cheapestKeyboard());

        // Test with an empty array, expecting 0 as there are no prices
        int[] emptyPrices = {};
        int[] usbDrivePrices3 = {40, 60};
        ElectronicShop electronicShop3 = new ElectronicShop(emptyPrices, usbDrivePrices3);
        assertEquals(Integer.MAX_VALUE, electronicShop3.cheapestKeyboard());

        System.out.println("4.1 cheapestKeyboard Test passed\n");
    }

    @Test
    void mostExpensiveObject() {
        System.out.println("\n4.2 Testing mostExpensiveObject");

        // Test with positive prices for both keyboards and USB drives
        int[] keyboardPrices = {30, 50, 20, 10};
        int[] usbDrivePrices = {40, 60, 25, 15};
        ElectronicShop electronicShop = new ElectronicShop(keyboardPrices, usbDrivePrices);
        assertEquals(60, electronicShop.mostExpensiveObject());

        // Test with negative prices for both keyboards and USB drives, expecting 0 as the maximum price
        int[] negativeKeyboardPrices = {-30, -50, -20, -10};
        int[] negativeUsbDrivePrices = {-40, -60, -25, -15};
        ElectronicShop electronicShop2 = new ElectronicShop(negativeKeyboardPrices, negativeUsbDrivePrices);
        assertEquals(0, electronicShop2.mostExpensiveObject());

        // Test with positive prices for keyboards and negative prices for USB drives
        int[] positiveKeyboardPrices = {30, 50, 20, 10};
        int[] negativeUsbDrivePrices2 = {-40, -60, -25, -15};
        ElectronicShop electronicShop3 = new ElectronicShop(positiveKeyboardPrices, negativeUsbDrivePrices2);
        assertEquals(0, electronicShop3.mostExpensiveObject());

        System.out.println("4.2 mostExpensiveObject Test passed\n");
    }

    @Test
    void mostExpensiveAffordableKeyboard() {
        System.out.println("\n4.3 Testing mostExpensiveAffordableObject");

        // Test with positive budget and affordable keyboard prices
        int[] keyboardPrices = {30, 50, 20, 10};
        int[] usbDrivePrices = {40, 60, 25, 15};
        ElectronicShop electronicShop = new ElectronicShop(keyboardPrices, usbDrivePrices);
        assertEquals(50, electronicShop.mostExpensiveAffordableKeyboard(60));

        // Test with positive budget and no affordable keyboards, expecting 0 as no affordable keyboard
        int[] keyboardPrices2 = {30, 50, 20, 10};
        int[] usbDrivePrices2 = {40, 60, 25, 15};
        ElectronicShop electronicShop2 = new ElectronicShop(keyboardPrices2, usbDrivePrices2);
        assertEquals(0, electronicShop2.mostExpensiveAffordableKeyboard(5));

        // Test with negative budget, expecting 0 as budget cannot be negative
        int[] keyboardPrices3 = {30, 50, 20, 10};
        int[] usbDrivePrices3 = {40, 60, 25, 15};
        ElectronicShop electronicShop3 = new ElectronicShop(keyboardPrices3, usbDrivePrices3);
        assertEquals(0, electronicShop3.mostExpensiveAffordableKeyboard(-10));

        System.out.println("4.3 mostExpensiveAffordableObject Test passed\n");
    }

    @Test
    void amountOfMoneySpent() {
        System.out.println("\n4.4 Testing amountOfMoneySpent");

        // Test with positive budget and affordable options for both keyboard and USB drive
        int[] keyboardPrices = {30, 50, 20, 10};
        int[] usbDrivePrices = {40, 60, 25, 15};
        ElectronicShop electronicShop = new ElectronicShop(keyboardPrices, usbDrivePrices);
        assertEquals(70, electronicShop.amountOfMoneySpent(70));

        // Test with positive budget and no affordable options, expecting 0 as no affordable combination
        int[] keyboardPrices2 = {30, 50, 20, 10};
        int[] usbDrivePrices2 = {40, 60, 25, 15};
        ElectronicShop electronicShop2 = new ElectronicShop(keyboardPrices2, usbDrivePrices2);
        assertEquals(0, electronicShop2.amountOfMoneySpent(5));

        // Test with negative budget, expecting 0 as budget cannot be negative
        int[] keyboardPrices3 = {30, 50, 20, 10};
        int[] usbDrivePrices3 = {40, 60, 25, 15};
        ElectronicShop electronicShop3 = new ElectronicShop(keyboardPrices3, usbDrivePrices3);
        assertEquals(0, electronicShop3.amountOfMoneySpent(-10));

        System.out.println("4.4 amountOfMoneySpent Test passed\n");
    }
}