package condicionales;

public class Switch_Ejemplo {

	public static void main(String[] args) {
		int i = 9;
		
		switch(i) {
		case 0:
			System.out.println("i es cero");
			break;
		case 1:
			System.out.println("i es uno");
			break;
		case 2:
			System.out.println("i es dos");
			break;
		default:
			System.out.println("i es mayor que dos");
			break;
		}

	}

}