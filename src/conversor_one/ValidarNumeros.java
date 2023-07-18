package conversor_one;

public class ValidarNumeros {
	// Método para realizar la validación de "sólo números, incluso decimales"
	public boolean esNumero(String texto) {
		try {
			Double.parseDouble(texto);
			return texto.matches("[0-9]+(\\.[0-9]+){0,1}$");
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
