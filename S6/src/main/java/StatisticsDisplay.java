public class StatisticsDisplay implements Observer, Display{
    private int temperature;
    private int humidity;
    private float airPressure;
    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.add(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics Conditions: " + (temperature + 1) + " " + (humidity + 1)+ " " + (airPressure + 1));
    }

    @Override
    public void update(int temperature, int humidity, float airPressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.airPressure = airPressure;
        display();
    }
}
