package Main;

import java.util.Arrays;

public class NotenProzessor {
    public int[] nichtAusreichendeNoten(int[] note) {

        for (int j : note) {
            if (j < 0 || j > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return null;
            }
        }

        int[] finaleNoten = new int[0];

        for (int j : note) {
            if (round(j) < 40) {
                finaleNoten = addToArray(finaleNoten, round(j));
            }
        }
        return finaleNoten;
    }

    public int round(int note) {
        if (note < 38) {
            return note;
        } else {
            if (note % 5 > 2) {
                return note + 5 - note % 5;
            } else {
                return note;
            }
        }
    }

    public int[] addToArray(int[] original, int newElement) {
        int[] result = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            result[i] = original[i];
        }
        result[original.length] = newElement;
        return result;
    }

    public double durchschnittswert(int[] note) {
        double durchscnittsnote = 0;
        int sum = 0;

        for(int i = 0; i < note.length; i++) {
            sum += note[i];
        }
        durchscnittsnote = (double) sum / note.length;
        return durchscnittsnote;
    }

    public int[] abgerundeteNoten(int[] note) {
        int[] noten = new int[note.length - 1];
        for(int i = 0; i < note.length; i++) {
            addToArray(noten, round(note[i]));
        }
        return noten;
    }

    public int maximaleAbgerundeteNote(int[] note) {
        int[] roundedNotes = abgerundeteNoten(note);
        Arrays.sort(note);
        return note[note.length - 1];
    }
}