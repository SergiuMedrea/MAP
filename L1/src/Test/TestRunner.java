package Test;

public class TestRunner {
    public static void run() {
        NotenProzessorTest notenProzessorTest = new NotenProzessorTest();

        notenProzessorTest.addToArrayTest();

        ArrayOperationsTest arrayOperationsTest = new ArrayOperationsTest();

        arrayOperationsTest.maxNumberTest();
        arrayOperationsTest.minNumberTest();
        arrayOperationsTest.maxSumTest();
        arrayOperationsTest.minSumTest();
    }
}
