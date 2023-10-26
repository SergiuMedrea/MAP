package TV;

import java.util.Iterator;

public class SmartRemote extends Remote {

    public SmartRemote(TV tv) {
        super(tv);
    }

    @Override
    public String next() {
        System.out.println("Changing channel...");
        return tv.channelUp();
    }
}
