import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int numero;

		System.out.println("Ingrese el numero");
		numero=teclado.nextInt();

		if (numero%2==0){
			System.out.println("Este numero no es primo");

		}else {
			System.out.println("Es un numero primo");

		}


	}

}
