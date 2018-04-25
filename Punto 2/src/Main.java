
public class Main {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 20;
		
		if (a==b)
		{
			System.out.println("Ambos valores son iguales");	
		}
		
		else
		{
	
		Compare Comp = new Compare();
		
		System.out.println("El valor mayor es: " + Comp.Higher(a, b));
		
		}
	
	}

}
