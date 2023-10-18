package Test;
import Main.NotenProzessor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotenProzessorTest {

    @Test
    void nichtAusreichendeNoten() {
        NotenProzessor notenProzessor = new NotenProzessor();

        // Test with valid grades, expecting [30, 35] to be filtered out and returned
        System.out.println("\n1.1 Testing nicht ausreichend Note");
        int[] input1 = {30, 40, 35, 50, 60};
        int[] expected1 = {30, 35};
        assertArrayEquals(expected1, notenProzessor.nichtAusreichendeNoten(input1));

        // Test with invalid grade (less than 0), expecting null
        int[] input2 = {-5, 60, 75, 90};
        assertNull(notenProzessor.nichtAusreichendeNoten(input2));

        // Test with invalid grade (greater than 100), expecting null
        int[] input3 = {105, 40, 80, 95};
        assertNull(notenProzessor.nichtAusreichendeNoten(input3));

        // Test with all grades above 40, expecting an empty array
        int[] input4 = {45, 50, 55, 60};
        int[] expected4 = {};
        assertArrayEquals(expected4, notenProzessor.nichtAusreichendeNoten(input4));
        System.out.println("1.1 Nicht ausreichend Test passed\n");
    }

    @Test
    void round() {
        System.out.println("\nTesting round");

        NotenProzessor notenProzessor = new NotenProzessor();

        // Test rounding a grade less than 38, expecting the same grade
        assertEquals(35, notenProzessor.round(35));

        // Test rounding a grade between 38 and 40, expecting 40
        assertEquals(40, notenProzessor.round(39));

        // Test rounding a grade between 41 and 43, expecting 45
        assertEquals(45, notenProzessor.round(43));

        // Test rounding a grade that doesn't round, expecting the same grade
        assertEquals(92, notenProzessor.round(92));

        // Test rounding a unexpected grade, expecting 0
        assertEquals(0, notenProzessor.round(-10));
        assertEquals(0, notenProzessor.round(140));
        System.out.println("Round Test passed\n");
    }

    @Test
    void durchschnittswert() {
        System.out.println("\n1.2 Testing Durchschnittswert");

        NotenProzessor notenProzessor = new NotenProzessor();

        // Test with grades [50, 60, 70], expecting average of 60
        int[] input1 = {50, 60, 70};
        assertEquals(60.0, notenProzessor.durchschnittswert(input1));

        // Test with an empty array, expecting 0.0
        int[] input2 = {};
        assertEquals(0.0, notenProzessor.durchschnittswert(input2));

        // Test with unexpected notes, expecting 0.0
        int[] input3 = {-2, 10, 101};
        assertEquals(0.0, notenProzessor.durchschnittswert(input3));
        System.out.println("1.2 Durchschnittswert Test passed\n");
    }

    @Test
    void abgerundeteNoten() {
        System.out.println("\n1.3 Testing abgerundetete Noten");

        NotenProzessor notenProzessor = new NotenProzessor();

        // Test with grades [45, 55, 67], expecting [45, 55, 65] after rounding
        int[] input1 = {45, 55, 67};
        int[] expected1 = {45, 55, 67};
        assertArrayEquals(expected1, notenProzessor.abgerundeteNoten(input1));

        // Test with an empty array, expecting an empty array
        int[] input2 = {};
        int[] expected2 = {};
        assertArrayEquals(expected2, notenProzessor.abgerundeteNoten(input2));

        // Test with unexpected notes, expecting 0.0
        int[] input3 = {-2, 10, 101};
        assertEquals(0, notenProzessor.durchschnittswert(input3));
        System.out.println("1.3 Abgerundetete Noten test passed\n");
    }

    @Test
    void maximaleAbgerundeteNote() {
        System.out.println("\n1.4 Testing maximale abgerundete Note");

        NotenProzessor notenProzessor = new NotenProzessor();

        // Test with grades [48, 53, 62, 75], expecting maximum rounded grade 65
        int[] input1 = {48, 53, 62, 75};
        assertEquals(75, notenProzessor.maximaleAbgerundeteNote(input1));

        // Test with an empty array, expecting 0
        int[] input2 = {};
        assertEquals(0, notenProzessor.maximaleAbgerundeteNote(input2));

        // Test with unexpected notes, expecting 0.0
        int[] input3 = {-2, 10, 101};
        assertEquals(0, notenProzessor.durchschnittswert(input3));
        System.out.println("1.4 Maximale abgerundete Note passed\n");
    }
}
