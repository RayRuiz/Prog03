import java.util.Scanner;

public class Ejercicio04 {	

	public static void main (String[] args) {
	Scanner teclado=new Scanner (System.in);



	int numero,divisor=2;
	boolean esPrimo=true;

	System.out.println ("Introduzca el numero:");
	numero=teclado.nextInt();
	


	while (esPrimo && divisor <numero) {

	esPrimo=numero%divisor !=0;
	divisor++;
	}
	if (esPrimo==true){
		System.out.println("Este numero es primo");
	}else {
		System.out.println("Este numero no es primo");
	}
	
	}
}