package study.essentials.model;

import study.essentials.service.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    double temperaturaEmFahrenheit;
    double temperaturaEmCelsius;

    public double getTemperaturaEmFahrenheit() {
        return temperaturaEmFahrenheit;
    }

    public void setTemperaturaEmFahrenheit(double temperaturaEmFahrenheit) {
        this.temperaturaEmFahrenheit = temperaturaEmFahrenheit;
    }

    public double getTemperaturaEmCelsius() {
        return temperaturaEmCelsius;
    }

    public void setTemperaturaEmCelsius(double temperaturaEmCelsius) {
        this.temperaturaEmCelsius = temperaturaEmCelsius;
    }

    @Override
    public void celsiusParaFahrenheit() {
        double fahrenheit;
        fahrenheit = (getTemperaturaEmCelsius() * 1.8) + 32;
        System.out.println(String.format("Temperatura em Fahrenheit %.2f ºF",fahrenheit));
    }

    @Override
    public void fahrenheitParaCelsius() {
        double celsius;
        celsius = (getTemperaturaEmFahrenheit() - 32) / 1.8;
        System.out.println(String.format("Temperatura em Celsius %.2f ºC",celsius));
    }
}
