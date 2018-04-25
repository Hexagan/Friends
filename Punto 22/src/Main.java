
public class Main {

	public static void main(String[] args) {
		
		String titulo1 = "La bella y graciosa moza marchose a lavar la ropa";
		String titulo2 = "La bella y graciosa moza marchose a lavar la ropa, la mojó en el arroyuelo y cantando la lavó, la frotó sobre una piedra, la colgó de un abedul";
		int a=0,e=0,i=0,o=0,u=0,total,j;
		
		for (j = 0; j < titulo1.length(); j++) {
			
			if(titulo1.charAt(j) == 'a') 
			{
				a++;
			}
			
			if(titulo1.charAt(j) == 'e')
			{
				e++;
			}
			
			if(titulo1.charAt(j) == 'i') 
			{
				i++;
			}
			
			if(titulo1.charAt(j) == 'o') 
			{
				o++;
			}
			
			if(titulo1.charAt(j) == 'u') 
			{
				u++;
			}
		}
		

		
		for (j = 0; j < titulo2.length(); j++) {
			
			if(titulo2.charAt(j) == 'a') 
			{
				a++;
			}
	
			if(titulo2.charAt(j) == 'e')
			{
				e++;
			}
			
			if(titulo2.charAt(j) == 'i') 
			{
				i++;
			}
			
			if(titulo2.charAt(j) == 'o') 
			{
				o++;
			}
			
			if(titulo2.charAt(j) == 'u') 
			{
				u++;
			}
			
		}
		
		total = (a+e+i+o+u);
		
		System.out.println("La cantidad de vocales 'a' es de: " + a);
		System.out.println("La cantidad de vocales 'e' es de: " + e);
		System.out.println("La cantidad de vocales 'i' es de: " + i);
		System.out.println("La cantidad de vocales 'o' es de: " + o);
		System.out.println("La cantidad de vocales 'u' es de: " + u);
		System.out.println("La cantidad total de vocales es de: " + total);
		
	}
}
