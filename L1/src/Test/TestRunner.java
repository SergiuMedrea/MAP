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
    }
}
