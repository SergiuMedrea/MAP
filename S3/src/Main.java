import TV.*;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<CardDeck.Spielkarte> karten = new ArrayList<>();
//        karten.add(new CardDeck.Spielkarte(10, "Kreuz"));
//        karten.add(new CardDeck.Spielkarte(9, "Herz"));
//        karten.add(new CardDeck.Spielkarte(7, "Pik"));
//
//        CardDeck.Deck deck = new CardDeck.Deck(karten);
//
//        for (int i = 0; i < deck.getKarten().size(); i++) {
//            System.out.println(deck.getKarten().get(i).toString());
//        }
//
//        System.out.println();
//        for(CardDeck.Spielkarte s: deck) {
//            System.out.println(s);
//        }

        RemoteFactory remoteFactory = new RemoteFactory();
        TV tv = new TV("cheap", List.of("Digi", "Antena3", "KanalD"));
        Remote basic = remoteFactory.creatRemote("basic", tv);
        tv.setRemote(basic);

        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();

        System.out.println(tv);

        Remote smart = remoteFactory.creatRemote("smart", tv);
        tv.setRemote(smart);

        smart.next();
        smart.next();

        System.out.println(tv);
    }
}