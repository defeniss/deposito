package cuentas;

/**
 * clase para crear cuentas y saber el nombre, numero, cantidad que tienen y
 * tipo de interes
 * 
 * @author Veronica
 */
public class CCuenta {

	/** Nombre del titular de la cuenta */
	private String nombre;
	/** Numero de cuenta */
	private String cuenta;
	/** Saldo que se tiene en la cuenta */
	private double saldo;
	/** Tipo de interes en la cuenta */
	private double tipoInterés;

	/**
	 * creamos cuenta por defecto
	 */
	public CCuenta() {
	}

	/**
	 * Creamos la cuenta con sus parametros
	 * 
	 * @param nom  nombre del usuario de la cuenta
	 * @param cue  numero de cuenta
	 * @param sal  saldo que posee la cuenta
	 * @param tipo de interes tiene la cuenta
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInterés = tipo;
	}

	// aqui estan los getter y setter generados.
	/**
	 * Obtenemos el nombre del titular de la cuenta
	 * 
	 * @return nombre del titular
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Damos el nuevo nombre del titular de cuenta
	 * 
	 * @param nombre actualizamos en nombre del titular de la cuenta
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtenemos los datos del numero de la cuenta
	 * 
	 * @return nos devuelve los numeros de la cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Ponemos en nuevo numero de cuenta
	 * 
	 * @param cuenta con el nuevo numero de cuenta actualizado
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Obtenemos el saldo que posee la cuenta
	 * 
	 * @return saldo que tenemos en la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Actualizamos la cantidad de saldo que tenemos en la cuenta
	 * 
	 * @param saldo actualizado
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Nos dice que tipo de interes tenemos en la cuenta
	 * 
	 * @return tipoInteres, tipo de interes en nuestra cuenta
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * actualizamos el tipo de interes para la cuenta
	 * 
	 * @param tipoInterés queda actualizado
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Devuelve el estado de la cuenta es decir el saldo que hay
	 * 
	 * @return nos dice que saldo tenemos en la cuenta
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * Ingresamos el dinero en la cuenta
	 * 
	 * @param cantidad que queremos ingresar en la cuenta
	 * @throws Exception si la cantidad que vamos a ingresar es menor que cero
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * Retiramos dinero de la cuenta
	 * 
	 * @param cantidad que queremos retirar
	 * @throws Exception si la cantidad es menor que cero o igual,
	 * o si se pide retirar una cantidad mayor a la que tenemos
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No  hay suficiente saldo");
		saldo = saldo - cantidad;
	}
}
