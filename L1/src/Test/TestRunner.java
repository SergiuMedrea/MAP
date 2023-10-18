package Test;

public class TestRunner {
    public static void run() {
        NotenProzessorTest notenProzessorTest = new NotenProzessorTest();

        System.out.println("Test P1\n");
        notenProzessorTest.nichtAusreichendeNoten();
        notenProzessorTest.round();
        notenProzessorTest.durchschnittswert();
        notenProzessorTest.abgerundeteNoten();
        notenProzessorTest.maximaleAbgerundeteNote();
        System.out.println("Tests for P1 passed\n");

        ArrayOperationsTest arrayOperationsTest = new ArrayOperationsTest();

        System.out.println("\nTest P2\n");
        arrayOperationsTest.maxNumber();
        arrayOperationsTest.minNumber();
        arrayOperationsTest.maxSum();
        arrayOperationsTest.minSum();
        System.out.println("Tests for P2 passed\n");

        NumbersAsArrayOperationsTest numbersAsArrayOperationsTest = new NumbersAsArrayOperationsTest();

        System.out.println("\nTest P3\n");
        numbersAsArrayOperationsTest.sameLengthNumbersSum();
        numbersAsArrayOperationsTest.sameLengthNumbersDifference();
        numbersAsArrayOperationsTest.singleDigitNumberMultiplication();
        numbersAsArrayOperationsTest.singleDigitNumberDivision();
        System.out.println("Tests for P3 passed\n");

        ElectronicShopTest electronicShopTest = new ElectronicShopTest();

        System.out.println("\nTest P4\n");
        electronicShopTest.cheapestKeyboard();
        electronicShopTest.mostExpensiveObject();
        electronicShopTest.mostExpensiveAffordableKeyboard();
        electronicShopTest.amountOfMoneySpent();
        System.out.println("Tests for P4 passed\n");
    }
}
