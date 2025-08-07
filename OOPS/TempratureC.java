
class Temperature {
    double celsius;

    // Set temperature in Celsius
    void setTemperature(double c) {
        celsius = c;
    }
    double convertToFahrenheit() {
        return (celsius * 9/5) + 32;
    }
    void displayResult() {
        double fahrenheit = convertToFahrenheit();
        System.out.println("Temperature in Celsius   : " + celsius + "°C");
        System.out.println("Converted to Fahrenheit : " + fahrenheit + "°F");
    }
}

public class TemperatureC{
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        temp.setTemperature(37.0); 
        temp.displayResult();
    }
}
