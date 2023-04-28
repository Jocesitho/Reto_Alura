package conversor;

import javax.swing.JOptionPane;

public class convesorv2 {

	    
	    public static void main(String[] args) {
	        while(true) {
	        // Pedir al usuario que ingrese una opción
	        String opcion = JOptionPane.showInputDialog(null, "Ingrese una opción: \n 1 - Dólar a Euro \n 2 - Euro a Dólar \n 3 - Dólar a Yen \n 4 - Yen a Dólar \n 5 - Euro a Yen \n 6 - Yen a Euro \n 7 - Otra conversión");
	        
	        // Verificar que el usuario haya ingresado un número válido
	        double cantidad = 0;
	        boolean cantidadValida = false;
	        while (!cantidadValida) {
	            try {
	                String cantidadStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir:");
	                cantidad = Double.parseDouble(cantidadStr);
	                cantidadValida = true;
	            } catch (NumberFormatException |NullPointerException e) {
	                JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida.");
	            }
	        }
	        
	        // Verificar que el usuario haya ingresado una opción válida
	        int opcionInt = Integer.parseInt(opcion);
	        switch (opcionInt) {
	            case 1:
	                convertirDolarAEuro(cantidad);
	                break;
	            case 2:
	                convertirEuroADolar(cantidad);
	                break;
	            case 3:
	                convertirDolarAYen(cantidad);
	                break;
	            case 4:
	                convertirYenADolar(cantidad);
	                break;
	            case 5:
	               convertirEuroAYen(cantidad);
	                break;
	            case 6:
	                convertirYenAEuro(cantidad);
	                break;
	            case 7:
	                String monedaOrigen = JOptionPane.showInputDialog(null, "Ingrese la moneda de origen:");
	                String monedaDestino = JOptionPane.showInputDialog(null, "Ingrese la moneda de destino:");
	                double tasa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la tasa de conversión:"));
	                convertirMoneda(cantidad, monedaOrigen, monedaDestino, tasa);
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "Ingrese una opción válida.");
	        }
	        }
	    }
	    
	    // Métodos de conversión
	    public static void convertirDolarAEuro(double cantidad) {
	        double tasa = 0.85;
	        double resultado = convertirMoneda(cantidad, "Dólar", "Euro", tasa);
	        JOptionPane.showMessageDialog(null, cantidad + " dólares son " + resultado + " euros.");
	    }
	    
	    public static void convertirEuroADolar(double cantidad) {
	        double tasa = 1.18;
	        double resultado = convertirMoneda(cantidad, "Euro", "Dólar", tasa);
	        JOptionPane.showMessageDialog(null, cantidad + " euros son " + resultado + " dólares.");
	    }
	    
	    public static void convertirDolarAYen(double cantidad) {
	        double tasa = 109.07;
	        double resultado = convertirMoneda(cantidad, "Dólar", "Yen", tasa);
	        JOptionPane.showMessageDialog(null, cantidad + " dólares son " + resultado + " yenes.");
	    }
	    
	    public static void convertirYenADolar(double cantidad) {
	        double tasa = 0.0092;
	        double resultado = convertirMoneda(cantidad, "Yen", "Dólar", tasa);
	        JOptionPane.showMessageDialog(null, cantidad + " yenes son " +resultado+"dolares");
	    }
	    public static void convertirEuroAYen(double cantidad) {
	        double tasa = 129.06;
	        double resultado = convertirMoneda(cantidad, "Euro", "Yen", tasa);
	        JOptionPane.showMessageDialog(null, cantidad + " euros son " + resultado + " yenes.");
	    }

	    public static void convertirYenAEuro(double cantidad) {
	        double tasa = 0.0077;
	        double resultado = convertirMoneda(cantidad, "Yen", "Euro", tasa);
	        JOptionPane.showMessageDialog(null, cantidad + " yenes son " + resultado + " euros.");
	    }

	    public static double convertirMoneda(double cantidad, String monedaOrigen, String monedaDestino, double tasa) {
	        double resultado = cantidad * tasa;
	        return resultado;
	    }
	    

}
