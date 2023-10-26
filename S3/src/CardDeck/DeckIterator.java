package CardDeck;

import java.util.Iterator;

public class DeckIterator implements Iterator<Spielkarte> {
    public DeckIterator(Deck deck) {
        this.deck = deck;
    }

    private int index = 0;
    private Deck deck;
    @Override
    public boolean hasNext() {
        return index < deck.getKarten().size();
    }

    @Override
    public Spielkarte next() {
        if(hasNext()) {
            return deck.getKarten().get(index++);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
