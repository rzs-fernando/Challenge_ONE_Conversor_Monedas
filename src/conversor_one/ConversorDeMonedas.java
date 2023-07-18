package conversor_one;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorDeMonedas {

	ValidarNumeros validar = new ValidarNumeros();
	DecimalFormat FormatearDecimal = new DecimalFormat("#.##");


	public void menuConversiones() {

		String[] opcionMoneda = {"- - Elige una conversión - -","De Pesos a Dólar", "De Pesos a Euros", "De Pesos a Libras Esterlinas",
				"De Pesos a Yen Japonés", "De Pesos a Won Coreano",

				"De Dólar a Pesos", "De Euros a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos",
				"De Won Coreano a Pesos" };

		String opcion = (String) JOptionPane.showInputDialog(null,
				"¿Á que moneda desea convertir su dinero?", "Tipo De Moneda", JOptionPane.QUESTION_MESSAGE, null,
				opcionMoneda, opcionMoneda[0]);

		if (opcion != null) {

			switch (opcion) {
			case "De Pesos a Dólar":
				convertirDePesosADolar();
				break;

			case "De Dólar a Pesos":
				convertirDeDolarAPesos();
				break;

			case "De Pesos a Euros":
				convertirDePesosAEuros();
				break;

			case "De Euros a Pesos":
				convertirDeEurosAPesos();
				break;

			case "De Pesos a Libras Esterlinas":
				convertirDePesosALibrasEsterlinas();
				break;

			case "De Libras Esterlinas a Pesos":
				convertirDeLibrasEsterlinasAPesos();
				break;

			case "De Pesos a Yen Japonés":
				convertirDePesosAYen();
				break;

			case "De Yen Japonés a Pesos":
				convertirDeYenAPesos();
				break;

			case "De Pesos a Won Coreano":
				convertirDePesosAWon();
				break;

			case "De Won Coreano a Pesos":
				convertirDeWonAPesos();
				break;

			default:
				JOptionPane.showMessageDialog(null, "La opción elegida no es válida", "Error de Selección", JOptionPane.ERROR_MESSAGE);
				menuConversiones();
				break;
			}
		}
	}

	public void convertirDePesosADolar() {

		String cambioPeso = JOptionPane.showInputDialog(null, "Indique la cantidad de dinero a convertir",
				"Ingreso de Moneda", JOptionPane.QUESTION_MESSAGE);

		if (cambioPeso != null) {
			if (validar.esNumero(cambioPeso)) {
				double cantidadPesos = Double.parseDouble(cambioPeso);

				double cambioUSD = 17.14;

				double cantidadUSD = cantidadPesos / cambioUSD;

				JOptionPane.showMessageDialog(null, "Tienes $" + FormatearDecimal.format(cantidadUSD) + " Dólares.",
						"Cambio de Pesos a Dolar éxitoso", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Solo se permiten valores numéricos", "Alerta de Error",
						JOptionPane.ERROR_MESSAGE);
				convertirDePesosADolar();
			}
		}
	} // Fin del método 1 convertirDePesoADolar

	public void convertirDeDolarAPesos() {

		String cambioDolar = JOptionPane.showInputDialog(null, "Indique la cantidad de dinero a convertir",
				"Ingreso de Moneda", JOptionPane.QUESTION_MESSAGE);

		if (cambioDolar != null) {
			if (validar.esNumero(cambioDolar)) {
				double cantidadDolar = Double.parseDouble(cambioDolar);

				double cambioUSD = 17.14;

				double cantidadPesos = cantidadDolar * cambioUSD;

				JOptionPane.showMessageDialog(null, "Tienes $" + FormatearDecimal.format(cantidadPesos) + " Pesos.",
						"Cambio de Dolar a Pesos éxitoso", JOptionPane.INFORMATION_MESSAGE);

			} else {
				JOptionPane.showMessageDialog(null, "Solo se permiten valores numéricos", "Alerta de Error",
						JOptionPane.ERROR_MESSAGE);
				convertirDeDolarAPesos();
			}
		}
	} // Fin del método 2 convertirDeDolarAPeso

	public void convertirDePesosAEuros() {

		String cambioPeso = JOptionPane.showInputDialog(null, "Indique la cantidad de dinero a convertir",
				"Ingreso de Moneda", JOptionPane.QUESTION_MESSAGE);

		if (cambioPeso != null) {
			if (validar.esNumero(cambioPeso)) {
				double cantidadPesos = Double.parseDouble(cambioPeso);

				double cambioEUR = 18.82;

				double cantidadEUR = cantidadPesos / cambioEUR;

				JOptionPane.showMessageDialog(null, "Tienes $" + FormatearDecimal.format(cantidadEUR) + " Euros.",
						"Cambio de Pesos a Euros éxitoso", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Solo se permiten valores numéricos", "Alerta de Error",
						JOptionPane.ERROR_MESSAGE);
				convertirDePesosAEuros();
			}
		}
	} // Fin del método 3 convertirDePesoAEuros

	public void convertirDeEurosAPesos() {
		String cambioEuro = JOptionPane.showInputDialog(null, "Indique la cantidad de dinero a convertir",
				"Ingreso de Moneda", JOptionPane.QUESTION_MESSAGE);

		if (cambioEuro != null) {
			if (validar.esNumero(cambioEuro)) {
				double cantidadPesos = Double.parseDouble(cambioEuro);

				double cambioEUR = 18.82;

				double cantidadMXN = cantidadPesos * cambioEUR;

				JOptionPane.showMessageDialog(null, "Tienes $" + FormatearDecimal.format(cantidadMXN) + " Pesos.",
						"Cambio de Euros a Pesos éxitoso", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Solo se permiten valores numéricos", "Alerta de Error",
						JOptionPane.ERROR_MESSAGE);
				convertirDePesosAEuros();
			}
		}
	} // Fin del método 4 convertirDeEurosAPesos

	public void convertirDePesosALibrasEsterlinas() {
		String cambioPesos = JOptionPane.showInputDialog(null, "Indique la cantidad de dinero a convertir",
				"Ingreso de Moneda", JOptionPane.QUESTION_MESSAGE);

		if (cambioPesos != null) {
			if (validar.esNumero(cambioPesos)) {
				double cantidadPesos = Double.parseDouble(cambioPesos);

				double cambioGBP = 22.03;

				double cantidadGBP = cantidadPesos / cambioGBP;

				JOptionPane.showMessageDialog(null,
						"Tienes $" + FormatearDecimal.format(cantidadGBP) + " Libras Esterlinas.",
						"Cambio de Pesos a Libras Esterlinas éxitoso", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Solo se permiten valores numéricos", "Alerta de Error",
						JOptionPane.ERROR_MESSAGE);
				convertirDePesosAEuros();
			}
		}
	} // Fin del método 5 convertirDePesosALibrasEsterlinas

	public void convertirDeLibrasEsterlinasAPesos() {
		String cambioLibras = JOptionPane.showInputDialog(null, "Indique la cantidad de dinero a convertir",
				"Ingreso de Moneda", JOptionPane.QUESTION_MESSAGE);

		if (cambioLibras != null) {
			if (validar.esNumero(cambioLibras)) {
				double cantidadGBP = Double.parseDouble(cambioLibras);

				double CambioGBP = 22.03;

				double cantidadMXN = cantidadGBP * CambioGBP;

				JOptionPane.showMessageDialog(null, "Tienes $" + FormatearDecimal.format(cantidadMXN) + " Pesos.",
						"Cambio de Libras Esterlinas a Pesos éxitoso", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Solo se permiten valores numéricos", "Alerta de Error",
						JOptionPane.ERROR_MESSAGE);
				convertirDePesosAEuros();
			}
		}
	} // Fin del método 6 convertirDeLibrasEsterlinasAPesos

	public void convertirDePesosAYen() {
		String cambioPesos = JOptionPane.showInputDialog(null, "Indique la cantidad de dinero a convertir",
				"Ingreso de Moneda", JOptionPane.QUESTION_MESSAGE);

		if (cambioPesos != null) {
			if (validar.esNumero(cambioPesos)) {
				double cantidadPesos = Double.parseDouble(cambioPesos);

				double cambioJPY = 0.12;

				double cantidadJPY = cantidadPesos / cambioJPY;

				JOptionPane.showMessageDialog(null, "Tienes $" + FormatearDecimal.format(cantidadJPY) + " Yen Japonés.",
						"Cambio de Pesos a Yen Japonés éxitoso", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Solo se permiten valores numéricos", "Alerta de Error",
						JOptionPane.ERROR_MESSAGE);
				convertirDePesosAEuros();
			}
		}
	} // Fin del método 7 convertirDePesosAYen

	public void convertirDeYenAPesos() {
		String cambioYen = JOptionPane.showInputDialog(null, "Indique la cantidad de dinero a convertir",
				"Ingreso de Moneda", JOptionPane.QUESTION_MESSAGE);

		if (cambioYen != null) {
			if (validar.esNumero(cambioYen)) {
				double cantidadPesos = Double.parseDouble(cambioYen);

				double cambioJPY = 0.12;

				double cantidadPesoMx = cantidadPesos * cambioJPY;

				JOptionPane.showMessageDialog(null, "Tienes $" + FormatearDecimal.format(cantidadPesoMx) + " Pesos.",
						"Cambio de Yen Japonés a Pesos éxitoso", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Solo se permiten valores numéricos", "Alerta de Error",
						JOptionPane.ERROR_MESSAGE);
				convertirDePesosAEuros();
			}
		}
	} // Fin del método 8 convertirDeYenAPesos

	public void convertirDePesosAWon() {
		String cambioPesos = JOptionPane.showInputDialog(null, "Indique la cantidad de dinero a convertir",
				"Ingreso de Moneda", JOptionPane.QUESTION_MESSAGE);

		if (cambioPesos != null) {
			if (validar.esNumero(cambioPesos)) {
				double cantidadPesos = Double.parseDouble(cambioPesos);

				double cambioKRW = 0.013;

				double cantidadKRW = cantidadPesos / cambioKRW;

				JOptionPane.showMessageDialog(null, "Tienes $" + FormatearDecimal.format(cantidadKRW) + " Won Coreano.",
						"Cambio de Pesos a Won Coreano éxitoso", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Solo se permiten valores numéricos", "Alerta de Error",
						JOptionPane.ERROR_MESSAGE);
				convertirDePesosAEuros();
			}
		}
	} // Fin de método 9 convertirDePesosAWon

	public void convertirDeWonAPesos() {
		String cambioWon = JOptionPane.showInputDialog(null, "Indique la cantidad de dinero a convertir",
				"Ingreso de Moneda", JOptionPane.QUESTION_MESSAGE);

		if (cambioWon != null) {
			if (validar.esNumero(cambioWon)) {
				double cantidadPesos = Double.parseDouble(cambioWon);

				double cambioKRW = 0.013;

				double cantidadPesoMX = cantidadPesos * cambioKRW;

				JOptionPane.showMessageDialog(null, "Tienes $" + FormatearDecimal.format(cantidadPesoMX) + " Pesos.",
						"Cambio de Won Coreano a Pesos éxitoso", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Solo se permiten valores numéricos", "Alerta de Error",
						JOptionPane.ERROR_MESSAGE);
				convertirDePesosAEuros();
			}
		}
	} // Fin de método 9 convertirDeWonAPesos
}
