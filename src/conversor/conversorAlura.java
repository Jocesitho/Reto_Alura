package conversor;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class conversorAlura extends RuntimeException {
	public static void main(String[] args) {
		boolean continuarPrograma = true;
		while (continuarPrograma) {
			String[] opciones = { "Conversor de Moneda", "Conversor de Temperatura", "Conversor Unidades de Longitud",
					"Salir" };
			String eleccion = (String) JOptionPane.showInputDialog(null, "Elige lo que deseas hacer: ",
					"Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

			if (eleccion.equals("Conversor de Moneda")) {
				DecimalFormat formatearConversor = new DecimalFormat("#.####");

				String[] opcion = { "Peso Colombiano a Dolar", "Peso Colombiano a Euros",
						"Peso Colombiano a Libras Esterlinas", "Peso Colombiano a Yenes", "Peso Colombiano a Won",
						"Peso Colombiano a MXN", "Peso Colombiano a Real", "Dolar a Peso Colombiano",
						"Euros a Peso Colombiano", "Libras Esterlinas a Peso Colombiano", "Yenes a Peso Colombiano",
						"Won a Peso Colombiano", "MXN a Peso Colombiano", "Real a Peso Colombiano" };
				String Cambio = (String) JOptionPane.showInputDialog(null, "Elige lo que deseas hacer: ",
						"Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, opcion, opciones[0]);

				String input = JOptionPane.showInputDialog(null, "Ingrese Cantidad ");
				double PesosC = 0;
				try {
					PesosC = Double.parseDouble(input);
				} catch (NullPointerException  |IllegalArgumentException e) {
					JOptionPane.showMessageDialog(null, "Valor no valido");
				}
				if (Cambio.equals("Peso Colombiano a Dolar")) {
					double Dolar = PesosC * 0.00021;
					JOptionPane.showMessageDialog(null,
							PesosC + " Pesos Colombianos son: " + formatearConversor.format(Dolar) + " Dolares");

				} else if (Cambio.equals("Peso Colombiano a Euros")) {
					double Euro = PesosC * 0.00020;
					JOptionPane.showMessageDialog(null,
							PesosC + " Pesos Colombianos son: " + formatearConversor.format(Euro) + " Euros ");

				} else if (Cambio.equals("Peso Colombiano a Libras Esterlinas")) {
					double Libra = PesosC * 0.00017;
					JOptionPane.showMessageDialog(null, PesosC + " Pesos Colombianos son: "
							+ formatearConversor.format(Libra) + " Libras Esterlinas ");

				} else if (Cambio.equals("Peso Colombiano a Yenes")) {
					double Yen = PesosC * 0.028;
					JOptionPane.showMessageDialog(null,
							PesosC + " Pesos Colombianos son: " + formatearConversor.format(Yen) + " Yenes ");

				} else if (Cambio.equals("Peso Colombiano a Won")) {
					double Won = PesosC * 0.27;
					JOptionPane.showMessageDialog(null,
							PesosC + " Pesos Colombianos son: " + formatearConversor.format(Won) + " Won ");

				} else if (Cambio.equals("Peso Colombiano a MXN")) {
					double Mxn = PesosC * 0.0039;
					JOptionPane.showMessageDialog(null,
							PesosC + " Pesos Colombianos son: " + formatearConversor.format(Mxn) + " Mexicanos ");

				} else if (Cambio.equals("Peso Colombiano a Real")) {
					double Real = PesosC * 0.0011;
					JOptionPane.showMessageDialog(null,
							PesosC + " Pesos Colombianos son: " + formatearConversor.format(Real) + " Reales ");

				} else if (Cambio.equals("Dolar a Peso Colombiano")) {
					double d = PesosC * 4754.37;
					JOptionPane.showMessageDialog(null,
							PesosC + " Dolares son: " + formatearConversor.format(d) + " Pesos Colombianos ");

				} else if (Cambio.equals("Euros a Peso Colombiano")) {
					double euro = PesosC * 5115.37;
					JOptionPane.showMessageDialog(null,
							PesosC + " Euros son: " + formatearConversor.format(euro) + " Pesos Colombianos ");

				} else if (Cambio.equals("Libras Esterlinas a Peso Colombiano")) {
					double libra = PesosC * 5816.85;
					JOptionPane.showMessageDialog(null, PesosC + " Libras Esterlinas son: "
							+ formatearConversor.format(libra) + " Pesos Colombianos ");

				} else if (Cambio.equals("Yenes a Peso Colombiano")) {
					double yenes = PesosC * 36.30;
					JOptionPane.showMessageDialog(null,
							PesosC + " Yenes son: " + formatearConversor.format(yenes) + " Pesos Colombianos ");

				} else if (Cambio.equals("Won a Peso Colombiano")) {
					double won = PesosC * 3.65;
					JOptionPane.showMessageDialog(null,
							PesosC + " Won son: " + formatearConversor.format(won) + " Pesos Colombianos ");

				} else if (Cambio.equals("MXN a Peso Colombiano")) {
					double mxn = PesosC * 257.71;
					JOptionPane.showMessageDialog(null,
							PesosC + " MXN son: " + formatearConversor.format(mxn) + " Pesos Colombianos ");

				} else if (Cambio.equals("Real a Peso Colombiano")) {
					double real = PesosC * 906.18;
					JOptionPane.showMessageDialog(null,
							PesosC + " Reales son: " + formatearConversor.format(real) + " Pesos Colombianos ");
				}
				int confirmar = JOptionPane.showConfirmDialog(null, "Desea Continuar Usando El Programa", "confirmar",
						JOptionPane.YES_NO_CANCEL_OPTION);

				if (confirmar == JOptionPane.NO_OPTION || confirmar == JOptionPane.CANCEL_OPTION) {
					continuarPrograma = false;
					JOptionPane.showMessageDialog(null, "El Programa Finalizo");

				}
			}

			if (eleccion.equals("Conversor de Temperatura")) {

				String[] opcion = { "Converit de Celsius a Fahrenheit", "convertir de Celsius a Kelvin",
						"Converit de Fahrenheit a Celsius", "Converit de Fahrenheit a Kelvin",
						"Converit de Kelvin a Celsius", "Converit de  Kelvin a Fahrenheit" };
				String op = (String) JOptionPane.showInputDialog(null, "Elige lo que deseas hacer: ",
						"Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE, null, opcion, opciones[0]);
				String ValorIngresado = JOptionPane.showInputDialog(null, "Ingrese el  valor");
				double valor = 0.00;
				try {
					valor = Double.parseDouble(ValorIngresado);
				} catch (NumberFormatException | NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Valor no valido");
					System.exit(0);
				}
				double res = 0.00;
				if (op.equals("Converit de Celsius a Fahrenheit")) {
					res = (valor * 1.8 + 32);
					JOptionPane.showMessageDialog(null, valor + " Grados Celsius son: " + res + " Grados Fahrenheit");
				} else if (op.equals("convertir de Celsius a Kelvin")) {
					res = (valor + 273.15);
					JOptionPane.showMessageDialog(null, valor + " Grados Celsius son: " + res + " Grados Kelvin");
				} else if (op.equals("Converit de Fahrenheit a Celsius")) {
					res = (valor - 32) / 18;
					JOptionPane.showMessageDialog(null, valor + " Grados Fahrenheit son: " + res + " Grados Celsius");
				} else if (op.equals("Converit de Fahrenheit a Kelvin")) {
					res = (valor - 32) * 5 / 9 + 273.15;
					JOptionPane.showMessageDialog(null, valor + " Grados Fahrenheit son: " + res + " Grados Kelvin");
				} else if (op.equals("Converit de Kelvin a Celsius")) {
					res = (valor - 273.15);
					JOptionPane.showMessageDialog(null, valor + " Grados Kelvin son: " + res + " Grados Celsius");
				} else if (op.equals("Converit de  Kelvin a Fahrenheit")) {
					res = 1.8 * (valor - 273.15) + 32;
					JOptionPane.showMessageDialog(null, valor + " Grados Kelvin son: " + res + " Grados Fahrenheit");
				}

				int continuar = JOptionPane.showConfirmDialog(null, "Desea Continuar Usando El Programa", "confirmar",
						JOptionPane.YES_NO_CANCEL_OPTION);

				if (continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CANCEL_OPTION) {
					continuarPrograma = false;
					JOptionPane.showMessageDialog(null, "El Programa Finalizo");
				}

			}

			if (eleccion.equals("Conversor Unidades de Longitud")) {
				DecimalFormat formatearCon = new DecimalFormat("#.####");

				String[] opcion = { "m a mm", "m a cm", "m a dc", "m a Km", "mm a m", "cm a m", "dm a m", "Km a m" };
				String cam = (String) JOptionPane.showInputDialog(null, "Elige lo que deseas hacer: ",
						"Conversor de Unidades de Longitud", JOptionPane.QUESTION_MESSAGE, null, opcion, opciones[0]);

				String entrada = JOptionPane.showInputDialog(null, "Ingrese Cantidad ");
				double val = 0.00;
				try {
					val = Double.parseDouble(entrada);

				} catch (NumberFormatException | NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Valor no valido");
				}
				if (cam.equals("m a mm")) {
					double metromm = val * 1000;
					JOptionPane.showMessageDialog(null, val + " m son: " + formatearCon.format(metromm) + " mm");

				} else if (cam.equals("m a cm")) {
					double metrocm = val * 100;
					JOptionPane.showMessageDialog(null, val + " m son: " + formatearCon.format(metrocm) + " cm ");

				} else if (cam.equals("m a dm")) {
					double metrodm = val * 10;
					JOptionPane.showMessageDialog(null, val + " m son: " + formatearCon.format(metrodm) + " dm ");
				} else if (cam.equals("m a Km")) {
					double metroKm = val / 1000;
					JOptionPane.showMessageDialog(null, val + " m son: " + formatearCon.format(metroKm) + " Km ");

				} else if (cam.equals("mm a m")) {
					double metromm = val / 1000;
					JOptionPane.showMessageDialog(null, val + " mm son: " + formatearCon.format(metromm) + " m ");

				} else if (cam.equals("cm a m")) {
					double metrocm = val / 100;
					JOptionPane.showMessageDialog(null, val + " cm son: " + formatearCon.format(metrocm) + " m ");

				} else if (cam.equals("dm a m")) {
					double metrodm = val / 10;
					JOptionPane.showMessageDialog(null, val + " dm son: " + formatearCon.format(metrodm) + " m ");

				} else if (cam.equals("Km a m")) {
					double metrokm = val * 1000;
					JOptionPane.showMessageDialog(null, val + " Km son: " + formatearCon.format(metrokm) + " m ");
				}

				int confirmar = JOptionPane.showConfirmDialog(null, "Desea Continuar Usando El Programa", "confirmar",
						JOptionPane.YES_NO_CANCEL_OPTION);

				if (confirmar == JOptionPane.NO_OPTION || confirmar == JOptionPane.CANCEL_OPTION) {
					continuarPrograma = false;
					JOptionPane.showMessageDialog(null, "El Programa Finalizo");
				}
			}

			if (eleccion.equals("Salir")) {
				JOptionPane.showMessageDialog(null, "Finalizo el Programa");
				System.exit(0);
			}
		}
	}
}
