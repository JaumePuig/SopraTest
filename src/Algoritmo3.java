
import java.util.Scanner;

public class Algoritmo3 {

	static Scanner sc = new Scanner(System.in);
	static int horasTrabajadas;
	static int tarifa;
	static float sueldo;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeerHorasTrabajadas();
		LeerTarifa();
		
		if (horasTrabajadas > 40) {
			sueldo = 40 * tarifa;
			int horasExtras = horasTrabajadas - 40;
			sueldo += horasExtras * (tarifa * 1.5f);
		}else {
			sueldo = horasTrabajadas * tarifa;
		}
		
		System.out.println(sueldo);

	}
	
	public static void LeerHorasTrabajadas() {
		
		horasTrabajadas = sc.nextInt();
		
	}
	
public static void LeerTarifa() {
		
	tarifa = sc.nextInt();
		
	}
	
}
