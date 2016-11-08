/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverter;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormatService {
    NumberFormat fmt = new DecimalFormat("#0.00");
    
    public Double twoDecimalPlacesFormat(double temp){
        return Double.parseDouble(fmt.format(temp));
    }
}
