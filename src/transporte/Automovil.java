package transporte;

public class Automovil implements transporte {

	@Override
	public void arrancar() {
		System.out.println("Estoy arrancando el Automovil...");
	}

	@Override
	public void detener() {	
		System.out.println("Estoy deteniendo el Automovil...");
	}

	@Override
	public String tipo() {
		return "Automovil";
	}

}
