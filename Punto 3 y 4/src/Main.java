import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nomb = "Federico";
		System.out.println("Bienvenido " + nomb);
		
		System.out.println("Ingrese su nombre");
		
		Scanner scanner = new Scanner(System.in);
		
		nomb = scanner.nextLine();
		scanner.close();
	
		System.out.println("Bienvenido "+ nomb);
	
	}

}
