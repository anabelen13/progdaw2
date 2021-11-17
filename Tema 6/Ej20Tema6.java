
public class Ej20Tema6 {
	public static void main(String[] args) {
		
		System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
		int capacidad = Integer.parseInt(System.console().readLine());
		int litros = (int)(Math.random() * (capacidad + 1));
		
		for (int i = 0; i < capacidad; i++) {
			if (i < (capacidad - litros)) {
				System.out.println("# #");
			} else {
				System.out.println("#====#");
			}
		}
		System.out.println("######"); // fondo de la cuba
		System.out.print("La cuba tiene una capacidad de " + capacidad);
		System.out.print(" litros y contiene " + litros + " litros de agua.");
	}
}
