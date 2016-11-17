import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int numero,divisor=2, contador;
		contador=1;
		boolean esPrimo=true;
		
		boolean fin = false;

		System.out.println ("Introduzca el numero:");
		numero=teclado.nextInt();
		

		  while (!fin) {
		
			while (esPrimo && divisor <numero) {
				esPrimo=numero%divisor !=0;
				divisor++;
			}
					
			
			if (esPrimo==true){
				System.out.println("Este el primo por exeso mas cercano: "+ numero);
				fin = true;
			}else {
				System.out.println("Sigo buscando el primo más cercano por arriba");
			}
			
			esPrimo = true;
			divisor = 2 ;
			numero++;
		
		}
		
	}

		
		

	}


