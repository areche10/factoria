package transporte;

public class Fabrica {
	
	public static transporte construir(String tipo) {
		switch (tipo) {
		case "Motocicleta":
		    return new Motocicleta();
		case "Automovil":
			return new Automovil();
		default:
			System.out.println("No se encuentra dicho objeto");
			return null;
		}
	}

}
