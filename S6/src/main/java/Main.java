public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionsDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(75, 60, 30.4f);
        weatherData.setMeasurements(80, 65, 29.2f);
        weatherData.setMeasurements(72, 55, 29.5f);

        VGAMonitor vgaMonitor = new VGAMonitor();
        HDMIMonitor hdmiMonitor = new HDMIMonitor();
        VGAtoHDMIAdapter vgAtoHDMIAdapter = new VGAtoHDMIAdapter(hdmiMonitor);


        Computer computer = new Computer(vgAtoHDMIAdapter);
        computer.display();
    }
}