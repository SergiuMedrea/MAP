package org.example;


public class CosineSimilarity  implements Similarity {
    final BagOfWords encoder;

    CosineSimilarity(BagOfWords encoder) {
        this.encoder = encoder;
    }

    @Override
    public double transform(String a, String b) {
        return 0;
    }
}
