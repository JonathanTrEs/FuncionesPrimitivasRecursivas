//http://www.lcc.uma.es/~ezeqlr/talf/prim.pdf
//suma, sucesor, predecesor, cero, la de uno es hacer el sucesor de 0.
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int opc = 0;
		boolean salir = false;
		while(!salir) {
			System.out.println("1. Calcular potencia");
			System.out.println("2. Salir");
			System.out.print(">_");
			opc = Integer.parseInt(in.next());
			if(opc == 1) {
				System.out.println("Inroduzca los valores de X e Y. (X^Y)");
				System.out.print("X= ");
				x = Integer.parseInt(in.next());
				System.out.print("Y= ");
				y = Integer.parseInt(in.next());
				Potencia potencia = new Potencia();
				System.out.println("X^Y= " + potencia.calcularPotencia(x,y));
				System.out.println();
			}
			else {
				System.out.println("Programa Finalizado");
				salir = true;
			}
		}
		in.close();
	}
}
