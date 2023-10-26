package TV;

import java.util.Iterator;

public class Remote implements Iterator<String> {
    private int index;
    protected TV tv;

    public Remote(TV tv) {
        this.index = 0;
        this.tv = tv;
    }

    @Override
    public boolean hasNext() {
        return true; //bad idea: foreach is going to be an infinite cycle
    }

    @Override
    public String next() {
        return tv.channelUp();
    }
}
