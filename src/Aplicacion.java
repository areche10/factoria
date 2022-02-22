import transporte.Fabrica;
import transporte.transporte;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		transporte t1 = Fabrica.construir("Automovil");
		
		t1.arrancar();
		t1.detener();
		System.out.println(t1.tipo());
	}

}
