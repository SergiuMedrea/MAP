import java.util.ArrayList;
import java.util.List;

public class ForecastDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float airPressure;
    private int counter = 0;
    private List<Float> averageData;

    public ForecastDisplay(WeatherData weatherData) {
        weatherData.add(this);
        averageData = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println("Forecast Conditions: " + averageData.get(0) + " " + averageData.get(1) + " " + averageData.get(2));
    }

    @Override
    public void update(int temperature, int humidity, float airPressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.airPressure = airPressure;
        average();
        display();
    }

    public void average() {
        if (counter == 0) {
            this.averageData.add(temperature);
            this.averageData.add(humidity);
            this.averageData.add(airPressure);
        } else {
            averageData.set(0, (averageData.get(0) * counter + temperature) / (counter + 1));
            averageData.set(1, (averageData.get(1) * counter + humidity) / (counter + 1));
            averageData.set(2, (averageData.get(2) * counter + airPressure) / (counter + 1));
        }
        counter += 1;
    }
}
