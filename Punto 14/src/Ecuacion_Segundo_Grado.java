
public class Ecuacion_Segundo_Grado {
		
		public double Second_Grade1 (double a, double b, double c) {
			
			double result1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		
			System.out.println(result1);
			
			return result1;
		}
		
		public double Second_Grade2 (double a, double b, double c) {
			
			double result2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			
			System.out.println(result2);
			
			return result2;
		}
			
	}

