import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int numero,divisor=2, contador;
		boolean esPrimo=true;
		contador=3; // empezamos por contador 3 para evitar la operaciones con 1 y 2 ya que no dejari entrar porque divisor es 2.

		System.out.println ("Introduzca el numero:");
		numero=teclado.nextInt();
		
		 while(contador<=numero){
			 //volvemos a declarar las variables divisor y esPrimo para que tomen el valor inicial.
			 divisor=2;
			 esPrimo=true;
			
			 while (esPrimo && divisor < contador) {
				esPrimo= contador%divisor !=0;
				divisor=divisor+1;
						
				
			}
			 
			 if (esPrimo){
					System.out.println(contador);
				}
						
		
			 contador++; 
		}
	}
}	
	

		
		

	


