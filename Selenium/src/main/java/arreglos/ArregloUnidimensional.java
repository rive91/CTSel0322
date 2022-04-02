package arreglos;

public class ArregloUnidimensional {

	public static void main(String[] args) {
		//Ejemplo de declaracion arrays
		int intArray[];
		int []intArray2;
		long longArray[];
		
		//declara un array de strings
		String[] arr;
		
		//asignando memoria para 5 posiciones/valores
		arr = new String[5];
		
		//inicializa el primer elemento del array
		arr[0] = "cero";
		
		//inicializa el segundo elemento del array
		arr[1] = "uno";
		
		//sucesivamente
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";

		//System.out.println("El elemento en la posicion 2 es: " + arr[2]);
		//System.out.println("El elemento en la posicion 4 es: " + arr[4]);
		
		for (int i = 0; i<arr.length;i++) {//arr.length calcula la longitud del arreglo
			System.out.println("Elemento en el indice " + i + ": " + arr[i] );
		}

		System.out.println();
		
		String[] sArray = new String[] {"cero","uno"};
		for (int i = 0; i<sArray.length;i++) {
			System.out.println("Elemento en el indice " + i + ": " + sArray[i] );

		}
	}

}
