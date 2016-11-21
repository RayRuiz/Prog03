import java.util.Scanner;	
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		int cuadrado=1,triangulo=2,rectangulo=3,orden;
		
		System.out.println("Que orden desea realizar:"
				+ "  1=Cuadrado "
				+ " 2=Triangulo "
				+ " 3=Rectangulo" );
		orden=teclado.nextInt();
		if (orden==cuadrado){
			int lado,aCuadrado;
			System.out.println("Ingrese el lado del cuadrado");
			lado=teclado.nextInt();
			aCuadrado=lado*lado;
			System.out.println("El Area es " + aCuadrado);
		}
			
		if (orden==triangulo){
				int base,altura,aTriangulo;
				System.out.println("Ingrese la altura del triguanlo");
				altura=teclado.nextInt();
				System.out.println("Ingrese la base del triguanlo");
				base=teclado.nextInt();
				aTriangulo=base*altura/2;
				System.out.println("El Area es " + aTriangulo);
				
		}
		
		if (orden==rectangulo){
			int lado1,lado2,aRectangulo;
			System.out.println("Ingrese un lado del rectangulo");
			lado1=teclado.nextInt();
			System.out.println("Ingrese en otro lado del rectangulo");
			lado2=teclado.nextInt();
			aRectangulo=lado1*lado2;
			System.out.println("El Area es " + aRectangulo);
		
		}
		
		
		
		
	}
}
