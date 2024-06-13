import java.util.Scanner;
//Task-01
public class TemperatureConverter
{
public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("TASK 01");
        System.out.println("The program is represented by Jeegnasa Makwana");
        System.out.println("Temperature Converter");
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the original unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        String originalUnit = scanner.next().toUpperCase();

        double celsius = 0;
        double fahrenheit = 0;
        double kelvin = 0;

        switch (originalUnit) 
       {
            case "C":
                celsius = temperature;
                fahrenheit = celsiusToFahrenheit(celsius);
                kelvin = celsiusToKelvin(celsius);
                break;
            case "F":
                fahrenheit = temperature;
                celsius = fahrenheitToCelsius(fahrenheit);
                kelvin = celsiusToKelvin(celsius);
                break;
            case "K":
                kelvin = temperature;
                celsius = kelvinToCelsius(kelvin);
                fahrenheit = celsiusToFahrenheit(celsius);
                break;
            default:
                System.out.println("Invalid unit of measurement.");
                return;
        }

        System.out.println("Converted Temperatures:");
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

        scanner.close();
    }

    // Conversion functions
    public static double celsiusToFahrenheit(double celsius) 
    {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) 
    {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) 
   {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) 
   {
        return kelvin - 273.15;
    }
}