import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int numero,par,impar,contador;
		par=0;
		contador=1;
		impar=0;
		boolean fin=false;
		System.out.println("Ingrese un numero");
		numero=teclado.nextInt();
		while (!fin){


			switch (numero){
			case 0: 
				fin=true; break;
			default: 

				if (contador%2==0){
					par=par+numero;

				}else {
					impar=impar+numero;}
				System.out.println("Ingrese un numero");
				numero=teclado.nextInt();

			}contador=contador+1;

		}System.out.println("la suma de los numero par es " +par);
		System.out.println("la suma de los numero impar es " +impar);



	}

}