
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int numero,divisor,suma;
		divisor=1;
		suma=0;
		System.out.println("Ingrese un numero");
		numero=teclado.nextInt();
		while (divisor<numero){
			if(numero%divisor==0){
				suma=suma+divisor;
				
					
				}
				

			divisor=divisor+1;
			}if (suma==numero){
				System.out.println("El numero es perfecto");
			}else {
				System.out.println("El numero no es perfecto");
			}

			
		}


	}


