import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    List<Observer> observers;
    private int temperature;
    private int humidity;
    private float airPressure;

    @Override
    public String toString() {
        return "WeatherData{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", airPressure=" + airPressure +
                '}';
    }

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyUser() {
        for(Observer observer: observers) {
            observer.update(temperature, humidity, airPressure);
        }
    }


    public void setMeasurements(int temperature, int humidity, float airPressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.airPressure = airPressure;
        notifyUser();
    }
}
