import java.util.Scanner;

public class divisor {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int numero,indice;
		indice=1;
		System.out.println("Ingrese un numero");
		numero=teclado.nextInt();
		while (indice<numero){
			if(numero%indice==0){
				System.out.println("Sus divisores son " + indice);


			}

			indice=indice+1;
		}


	}

}
