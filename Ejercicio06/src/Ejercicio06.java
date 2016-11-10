import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int numero,par,impar,contador,division;
		par=0;
		contador=0;
		division=contador/2;
		impar=0;
		boolean fin=false;
		System.out.println("Ingrese un numero");
		numero=teclado.nextInt();
		while (!fin){
			switch (numero){
			case 0: 
				fin=true; break;
			default: 
				System.out.println("Ingrese un numero");
				numero=teclado.nextInt();
				if (division==0){
					par=par+numero;
					System.out.println("La suma");
					
				}
			
			}
		}
		
		

	}

}