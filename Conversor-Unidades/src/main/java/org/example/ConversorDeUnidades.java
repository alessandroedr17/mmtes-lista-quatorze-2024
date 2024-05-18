package org.example;

public class ConversorDeUnidades {
    // Conversor de metros para quilômetros
    public double metrosParaQuilometros(double metros) {
        return metros / 1000;
    }

    // Conversor de quilômetros para metros
    public double quilometrosParaMetros(double quilometros) {
        return quilometros * 1000;
    }

    // Conversor de Celsius para Fahrenheit
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Conversor de Fahrenheit para Celsius
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
