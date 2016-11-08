/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverter;




/**
 *
 * @author Chris
 */
public class ConverterService {
    
    
    
    public final double convertToCelsius(double temp){
        return (temp - 32) * (5.0/9.0);
    }
    public final double convertToFahrenheit(double temp){
        return ((temp * 9.0/5.0) + 32);
    }
//    public final String convertCelsiusToKelvin(double temp){
//        return fmt.format((temp + 273.15));
//    }
//    public final String convertFahrenheitToKelvin(double temp){
//        return fmt.format((temp + 459.67) * (5.0/9.0));
//    }
    
}
