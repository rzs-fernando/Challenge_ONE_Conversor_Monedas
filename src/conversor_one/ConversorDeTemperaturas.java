package conversor_one;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorDeTemperaturas {

	ValidarNumeros validarTmp = new ValidarNumeros();
	DecimalFormat FormatearDecimal = new DecimalFormat("#.##");

	public void conversorTemperatura() {

		String[] opcionesTemp = { "- - Elige una conversión - -", "Celsius a Fahrenheit", "Celsius a Kelvin",
				"Fahrenheit a Celsius", "Fahrenheit a Kelvin", "Kelvin a Celsius", "Kelvin a Fahrenheit" };

		String opcionTmp = (String) JOptionPane.showInputDialog(null, "Conversor de Temperatura", "Conversión",
				JOptionPane.QUESTION_MESSAGE, null, opcionesTemp, opcionesTemp[0]);

		if (opcionTmp != null) {

			switch (opcionTmp) {

			case "Celsius a Fahrenheit":
				celsiusFahrenheit();
				break;

			case "Celsius a Kelvin":
				celsiusKelvin();
				break;

			case "Fahrenheit a Celsius":
				fahrenheitCelsius();
				break;

			case "Fahrenheit a Kelvin":
				fahrenheitKelvin();
				break;
				
			case "Kelvin a Celsius":
				kelvinCelsius();
				break;
			
			case "Kelvin a Fahrenheit":
				kelvinFahrenheit();
				break;

			default:
				JOptionPane.showMessageDialog(null, "La opción elegida no es válida", "Error de Selección", JOptionPane.ERROR_MESSAGE);
				conversorTemperatura();
				break;
			}
		}
	}

	public void celsiusFahrenheit() {
		String cantidadTemp = JOptionPane.showInputDialog(null, "Ingrese el valor de Temperatura", "Temperatura",
				JOptionPane.QUESTION_MESSAGE);

		if (cantidadTemp != null) {
			if (validarTmp.esNumero(cantidadTemp)) {
				double registroTmp = Double.parseDouble(cantidadTemp);

				double conversionFah = (9 * registroTmp / 5) + 32;

				JOptionPane.showMessageDialog(null,
						registroTmp + " °C equivale a " + FormatearDecimal.format(conversionFah) + " °F",
						"Conversión Correcta", JOptionPane.INFORMATION_MESSAGE);

			} else {
				JOptionPane.showMessageDialog(null, "Solo se permiten valores numéricos", "Alerta de Error",
						JOptionPane.ERROR_MESSAGE);
				celsiusFahrenheit();
			}
		}
	} // Cierre de método celsiusFahrenheit

	public void celsiusKelvin() {
		String cantidadTemp = JOptionPane.showInputDialog(null, "Ingrese el valor de Temperatura", "Temperatura",
				JOptionPane.QUESTION_MESSAGE);
		if (cantidadTemp != null) {
			if (validarTmp.esNumero(cantidadTemp)) {
				double celsiusKelvin = Double.parseDouble(cantidadTemp);

				double conversionK = 273.15 + celsiusKelvin;
				JOptionPane.showMessageDialog(null,
						celsiusKelvin + " °C equivale a " + FormatearDecimal.format(conversionK) + " °K",
						"Conversión Correcta", JOptionPane.INFORMATION_MESSAGE);

			} else {
				JOptionPane.showMessageDialog(null, "Solo se permiten valores numéricos", "Alerta de Error",
						JOptionPane.ERROR_MESSAGE);
				celsiusKelvin();
			}
		}
	} // Cierre del método CelsiusKelvin

	public void fahrenheitCelsius() {
		String cantidadTemp = JOptionPane.showInputDialog(null, "Ingrese el valor de Temperatura", "Temperatura",
				JOptionPane.QUESTION_MESSAGE);
		if (cantidadTemp != null) {
			if (validarTmp.esNumero(cantidadTemp)) {
				double fahCel = Double.parseDouble(cantidadTemp);

				double conversionCls = 5 * (fahCel - 32) / 9;

				JOptionPane.showMessageDialog(null,
						fahCel + " °F equivale a " + FormatearDecimal.format(conversionCls) + " °C", "Conversión Correcta",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Solo se permiten valores numéricos", "Alerta de Error",
						JOptionPane.ERROR_MESSAGE);
				fahrenheitCelsius();
			}
		}
	} // Cierre del método fahrenheitCelsius

	public void fahrenheitKelvin() {
		String cantidadTemp = JOptionPane.showInputDialog(null, "Ingrese el valor de Temperatura", "Temperatura",
				JOptionPane.QUESTION_MESSAGE);
		if (cantidadTemp != null) {
			if (validarTmp.esNumero(cantidadTemp)) {
				double fahK = Double.parseDouble(cantidadTemp);

				double conversionK = (5 * (fahK - 32) / 9) + 273.15;

				JOptionPane.showMessageDialog(null,
						fahK + " °F equivale a " + FormatearDecimal.format(conversionK) + " °K", "Conversión Correcta",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Solo se permiten valores numéricos", "Alerta de Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	} // Cierre del método fahrenheitKelvin
	
	public void kelvinCelsius() {
		String cantidadTemp = JOptionPane.showInputDialog(null, "Ingrese el valor de Temperatura", "Temperatura",
				JOptionPane.QUESTION_MESSAGE);
		if(cantidadTemp != null) {
			if(validarTmp.esNumero(cantidadTemp)) {
				double kelvin = Double.parseDouble(cantidadTemp);
				
				double conversionCelsius = kelvin - 273.15;
				JOptionPane.showMessageDialog(null,
						kelvin + " °K equivale a " + FormatearDecimal.format(conversionCelsius) + " °C", "Conversión Correcta",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Solo se permiten valores numéricos", "Alerta de Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	} // fin del método kelvinCelsius
	
	public void kelvinFahrenheit() {
		String cantidadTemp = JOptionPane.showInputDialog(null, "Ingrese el valor de Temperatura", "Temperatura",
				JOptionPane.QUESTION_MESSAGE);
		
		if(cantidadTemp != null) {
			if (validarTmp.esNumero(cantidadTemp)) {
				double kelvin = Double.parseDouble(cantidadTemp);
				
				double conversionF = 9 * ((kelvin - 273.15) / 5) + 32;
				
				JOptionPane.showMessageDialog(null,
						kelvin + " °K equivale a " + FormatearDecimal.format(conversionF) + " °F", "Conversión Correcta",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Solo se permiten valores numéricos", "Alerta de Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}	
	} // Cierre del método kelvinFahrenheit

	
}
