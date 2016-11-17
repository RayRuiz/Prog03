
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int numero,divisor;
		divisor=1;
		System.out.println("Ingrese un numero");
		numero=teclado.nextInt();
		while (divisor<numero){
			if(numero%divisor==0){
				System.out.println("Sus divisores son " + divisor);


			}

			divisor=divisor+1;
		}


	}

}
