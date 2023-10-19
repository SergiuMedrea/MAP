public class Spielkarte {
    private int value;
    private Colour color;

    public void setValue(int value) {
        this.value = value;
    }

    public void setColor(String color) {
        this.color = Colour.valueOf(color);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Spielkarte{" +
                "value=" + value +
                ", color='" + color + '\'' +
                '}';
    }

    public Colour getColor() {
        return color;
    }

    public Spielkarte(int value, String color) {
        this.value = value;
        this.color = Colour.valueOf(color);
    }
}
