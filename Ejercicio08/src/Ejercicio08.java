import java.util.Scanner;
	
public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int numero,factorial,contador;
		contador=2; //contador vale 2 porque es el segundo numero a multiplicar y es que se va sumando +1 en cada vuelta para que se multiplique la variable factorial
		factorial=1; //es el primer numero a multiplicar, e ira guardando el resultado de la multiplicacion con la variable contador
		System.out.println("Ingrese un numero");
		numero=teclado.nextInt();
		if (numero>0){
			while (contador<=numero){
				factorial=factorial*contador; //aqui se hace la primera multiplicacion de factorial que es uno por dos
				contador=contador+1;
				
			}System.out.println("El factorial de " +numero + " es "+factorial);
		}
	}

}
