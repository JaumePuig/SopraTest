
import java.util.Scanner;

public class Algoritmo1 {

	static Scanner sc = new Scanner(System.in);
	static int numero;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeerNumero();
		
		if (EsPar()) {
			while(numero >= 0) {
				System.out.println(numero);
				numero -= 2;
			}
		}else {
			while(numero >= 1) {
				System.out.println(numero);
				numero -= 2;
			}
		}
		

	}
	
	public static void LeerNumero() {
		
		numero = sc.nextInt();
		sc.nextLine();
		
	}
	
	public static boolean EsPar() {
		
		if (numero % 2 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
