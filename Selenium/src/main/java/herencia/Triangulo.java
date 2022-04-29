package herencia;

public class Triangulo extends DosDimensiones {
	
	String estilo;
	
	double area() {
		return base*altura/2;//Aqui se accede a las variables declaradas en la clase padre(DosDimensiones)
	}

	void mostrarEstilo() {
		System.out.println("Triangulo es: " + estilo);
	}
}
