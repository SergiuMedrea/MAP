public class CurrentConditionDisplay implements Observer, Display{
    public WeatherData weatherData;
    private int temperature;
    private int humidity;
    private float airPressure;

    public CurrentConditionDisplay(WeatherData weatherData) {
        weatherData.add(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature + " " + humidity + " " + airPressure);
    }

    @Override
    public void update(int temperature, int humidity, float airPressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.airPressure = airPressure;
        display();
    }
}
