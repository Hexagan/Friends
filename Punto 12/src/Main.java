
public class Main {

	public static void main(String[] args) {
			int c=1;
			
			while(c>=1 && c<=100) 
			{ 
				if(c%2==0 || c%3==0) {
					System.out.println(c++);	
				}
				else
				{
					System.out.println(c+ " No es divisible por 2 o por 3" );
					c++;
				}
				 
			}
		}
	}

