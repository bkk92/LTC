package mooc.fi;

import java.util.ArrayList;
import java.util.Collections;

public class WeatherForecasterMain {

    public static void main(String[] args) {

	WeatherForecaster forecaster = new WeatherForecaster();
	ArrayList<String> days = new ArrayList<String>();
	Collections.addAll(days, "Mon", "Tue", "Wed", "Thu", "Fri");

	System.out.println("Weather forecast for next week");
	for (String day : days) {
	    String weatherForecast = forecaster.forecastWeather();
	    int temperatureForecast = forecaster.forecastTemperature();

	    System.out.println(day + " : " + weatherForecast + " " + temperatureForecast + " degress.");
	}

    }

}
