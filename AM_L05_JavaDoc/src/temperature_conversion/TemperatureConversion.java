package temperature_conversion;

import java.nio.channels.ClosedChannelException;

//Inline Comment: Will not go into java doc

/*
 * Block Comment: Will not go into java doc
 */

/**
 * The TemperatureConverion Java application prints a table converting Celsius to Farenheit
 * 
 * @author Nick DeNobrgea <A HREF="mailto:denon47@mail.sunysuffolk.edu"> denon47@mail.sunysuffolk.edu </A>
 * 
 * @version v1.0
 * 
 * @see <A HREF = "src/temperature_conversion/TemperatureConversion.java"> Java Source Code </A>
 * 
 */

public class TemperatureConversion {
    /**
     * The main method prints a Celsois to Farenheit conversion table
     * 
     * The bounds of the table range from -50C to +50C in 10-degree increments
     * 
     * @param args Not used in this implemntation
     */

    public static void main(String[] args) {
        final double TABLE_BEGIN = -50.0;
        final double TABLE_END = 50.0;
        final double TABLE_STEP = 10.0;

        double celsius;
        double farenheit;

        System.out.println("TEMPERATURE CONVERSION");
        System.out.println("----------------------");
        System.out.println("CELSIUS      FARENHEIT");
        for(celsius = TABLE_BEGIN; celsius <= TABLE_END; celsius += TABLE_STEP){
            farenheit = celsiusToFarenheit(celsius);
            System.out.printf("%6.2fC", celsius);
            System.out.printf("%14.2fF\n", farenheit);
        }
        System.out.println();

    }

    //By default, private methods are not included in JavaDoc
    /**
     * Converts a temperature from Celsius degrees to Farenheit degrees
     * @param celsius. Celsius degree
     * @return The temperature converted to Farenheit
     * @throws java.lang.IllegalArgumentException indicating that celsius degree is less than 
     * smallest temperature (-273.16)
     */
    public static double celsiusToFarenheit(double celsius) {
       final double MIN_CELSIUS = -273.16;
       if(celsius < MIN_CELSIUS){
            throw new IllegalArgumentException("Argument " + celsius + " is too small");
       }
       return (9.0/5.0) * celsius + 32;
    }
}
