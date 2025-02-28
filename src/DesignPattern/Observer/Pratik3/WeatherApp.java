package DesignPattern.Observer.Pratik3;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation=new WeatherStation();

        Observer phoneDisplay=new PhoneDisplay();
        Observer tvDisplay=new PhoneDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        weatherStation.setWeather("Sunny");
    }
}
