import java.util.Scanner;
public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int numero,suma,contador;
		contador=0; //variable para contar la veces que se ingresa un numero
		suma=0;
		boolean fin;
		fin=false;
		System.out.println("Ingrese un numero");
		numero=teclado.nextInt();
		suma=suma+numero;

		while (!fin) // la condicion para que se ejecute el bucle
			{
			switch (numero){

			case 0: 
				suma=suma+numero;
				fin=true; // es la condicion para que salga del bucle cuando metemos 0
				break;

			default:
				System.out.println("Ingrese un numero");
				numero=teclado.nextInt();
				suma=suma+numero;
				contador++;
			}
		}System.out.println("La suma total de los numeros ingresados es " +suma);
		System.out.println("Se han ingresado numeros " +contador+ " veces");

	}

}
