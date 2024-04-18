package diatance.distance.project;

import java.util.function.Function;

public class UnitConversionAndStringToCustomType {

    // Function<Double, Double>
    public static double convertUnit(double value, Function<Double, Double> conversionFunction) {
        return conversionFunction.apply(value);
    }

   // Function<String, T>
    public static <T> T convertString(String input, Function<String, T> conversionFunction) {
        return conversionFunction.apply(input);
    }

    public static void main(String[] args) {
      // kilometers to miles and then to meters
        double kilometers = 2 ;
        double miles = convertUnit(kilometers, km -> km * 0.621371);
        double meters = convertUnit(miles, mi -> mi * 1609.34);
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        System.out.println(miles + " miles is equal to " + meters + " meters.");

        // Test string to custom type conversion
        String personName = "Avenger";
        String name = convertString(personName, Function.identity());
        System.out.println("Name: " + name);
    }
}
