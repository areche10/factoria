package transporte;

public class Motocicleta implements transporte {

	@Override
	public void arrancar() {
		System.out.println("Estoy arrancando el Automovil...");
		
	}

	@Override
	public void detener() {
		System.out.println("Estoy deteniendo el Motocicleta...");
		
	}

	@Override
	public String tipo() {
		
		return "Motocicleta";
	}

}
