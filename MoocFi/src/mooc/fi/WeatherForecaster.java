package mooc.fi;

import java.util.Random;

//Sleet with the probability 0.1 (10%)
//Snow with the probability 0.3 (30%)
//Sunny with the probability 0.6 (60%)

public class WeatherForecaster {
    private Random random;

    public WeatherForecaster() {
	this.random = new Random();
    }

    public String forecastWeather() {
	double probability = this.random.nextDouble();

	if (probability <= 0.1) {
	    return "Sleet";
	} else if (probability <= 0.4) {
	    return "Snow";
	} else {
	    return "Sunny";
	}

    }

    public int forecastTemperature() {
	return (int) (4 * this.random.nextGaussian() - 3);
    }

}
