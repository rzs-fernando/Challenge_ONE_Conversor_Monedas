package conversor_one;

import javax.swing.JOptionPane;

public class MenuPrincipal {

	public static void main(String[] args) {

		ConversorDeMonedas convertirMonedas = new ConversorDeMonedas();

		ConversorDeTemperaturas convertirTemperaturas = new ConversorDeTemperaturas();

		Menu(convertirMonedas, convertirTemperaturas);
	}

	public static void Menu(ConversorDeMonedas convertirMonedas, ConversorDeTemperaturas convertirTemperaturas) {

		boolean iniciarPrograma = true;

		while (iniciarPrograma) {

			String opcionMenu[] = {"- - Sin seleccionar - -", "Conversor de Monedas", "Conversor de Temperatura" };

			String opcion = (String) JOptionPane.showInputDialog(null, "Elige un Conversor",
					"Menu Conversores ONE - Back End", JOptionPane.QUESTION_MESSAGE, null, opcionMenu, opcionMenu[0]);

			if (opcion != null) {

				switch (opcion) {

				case "Conversor de Monedas":
					convertirMonedas.menuConversiones();
					break;

				case "Conversor de Temperatura":
					convertirTemperaturas.conversorTemperatura();
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "No seleccionaste ningún conversor", "Notificación de Alerta",
							JOptionPane.WARNING_MESSAGE);
					break;

				}

			}

			int continuarPrograma = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?",
					"Challenge Conversor ONE - Back End", JOptionPane.YES_NO_CANCEL_OPTION);

			if (continuarPrograma == JOptionPane.NO_OPTION) {
				iniciarPrograma = false;
			} else if (continuarPrograma == JOptionPane.CANCEL_OPTION) {
				iniciarPrograma = false;
			}

		}

		JOptionPane.showMessageDialog(null, "La aplicación ha finalizado", "Challenge Conversor ONE - Back End",
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);

	}
}
