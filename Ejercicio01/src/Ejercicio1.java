import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int a,b,suma,indice;
		indice=0;
		suma=0;
		System.out.println("Ingrese el valor a");
		a=teclado.nextInt();
		System.out.println("Ingrese el valor  b");
		b=teclado.nextInt();
		indice=indice+a;
		if (a<=b){
			while (indice<b){
			 suma=(indice+1)+indice;
			 indice=indice+1;
			}System.out.println(suma);
		}else {
			System.out.println("a tiene que ser menor que b");
		}

	}

}
