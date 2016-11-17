import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int media,mayor,menor,numero,contador,acumulador;
		media=0;
		contador=0;
		acumulador=0;
		System.out.println("Ingrese el numero");
		numero=teclado.nextInt();
		menor = numero;
		mayor= numero;
		while ( numero != 0){
			acumulador=acumulador+numero;
			if (numero>mayor){
				mayor=numero;
			}
			if (numero<menor){
				menor=numero;
				
			}contador=contador+1;
			System.out.println("Ingrese el numero");
			numero=teclado.nextInt();
		}media=acumulador/contador;
		System.out.println("La media es "+ media);
		System.out.println("El numero mayor es "+mayor);
		System.out.println("El numero menor es "+menor);
		
		
	}
}
