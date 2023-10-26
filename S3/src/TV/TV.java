package TV;

import java.util.Iterator;
import java.util.List;

public class TV implements Iterable<String>{
    private String brand;
    private List<String> channels;
    private int index;
    private Remote remote;

    public TV(String brand, List<String> channels) {
        this.brand = brand;
        this.channels = channels;
        this.index = 0;
    }

    public void setRemote(Remote remote) {
        this.remote = remote;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<String> getChannels() {
        return channels;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    @Override
    public String toString() {
        return "TV.TV{" +
                "brand='" + brand + '\'' +
                ", channels=" + channels.get(index) +
                '}';
    }

    public String channelUp() {
        index += 1;
        if(index > channels.size() - 1) {
            index = 0;
        }
        return channels.get(index);
    }

    public String channelDown() {
        index -= 1;
        if(index < 0) {
            index = channels.size() - 1;
        }
        return channels.get(index);
    }

    @Override
    public Iterator<String> iterator() {
        return remote;
    }
}
