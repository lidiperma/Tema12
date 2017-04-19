
package tema12;

import java.text.NumberFormat;


public class Moneda {

    
    public static void main(String[] args) {
        
        NumberFormat moneda = NumberFormat.getCurrencyInstance();
        String monedaFormateada = moneda.format (1000);
        System.out.println(monedaFormateada);
        
    }
    
}
