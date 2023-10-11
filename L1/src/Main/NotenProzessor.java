package Main;

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

}