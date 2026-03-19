package cuentas;

/**
 * clase principal con los datos de la cuenta en la que se realizan las
 * operaciones
 * 
 * @author Veronica
 */
public class Main {
	/**
	 * Creamos el metodo principal
	 * 
	 * @param args pasamos los parametros
	 */
	public static void main(String[] args) {
		operativa_cuenta(2500);
	}

	/**
	 * Realizaremos operaciones con la siguiente cuenta consultamos saldo, lo
	 * retiramos e ingresamos
	 * 
	 * @param cantidad cantidad inicial con la que se crea la cuenta
	 */
	public static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;
//he añadido el parametro cantidad
		cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", cantidad, 0);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es" + saldoActual);

		try {
			cuenta1.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}
}
