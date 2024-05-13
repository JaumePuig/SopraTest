
import java.util.Scanner;

public class Algoritmo2 {

	static Scanner sc = new Scanner(System.in);
	static Persona[] personas = new Persona[50];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeerPersonas();
		
		System.out.println(Mayores());
		System.out.println(Menores());
		System.out.println(MayoresM());
		System.out.println(MenoresF());
		System.out.println(PorcentajeMayores());
		System.out.println(PorcentajeMujeres());

	}
	
	public static void LeerPersonas() {
		
		for (int i = 0; i < 50; i++) {
			
			
			System.out.println("Sexo? Masculino = 0, Femenino = 1");
			int nuevoSexo = sc.nextInt();
			
			System.out.println("Edad?");
			int nuevaEdad = sc.nextInt();
			
			Persona nuevaPersona = new Persona(nuevoSexo, nuevaEdad);
			personas[i] = nuevaPersona;
			
		}

	}
	
	public static int Mayores() {
		
		int mayores = 0;
		
		for (Persona persona : personas) {
			
			if (persona.edad >= 18) {
				mayores++;
			}
			
		}
		
		return mayores;
		
	}
	
	public static int Menores() {
		
		int menores = 0;
		
		for (Persona persona : personas) {
			
			if (persona.edad < 18) {
				menores++;
			}
			
		}
		
		return menores;
		
	}
	
	public static int MayoresM() {
		
		int mayoresM = 0;
		
		for (Persona persona : personas) {
			if (persona.edad >= 18) {
				if (persona.sexo == 0) {
					mayoresM++;
				}
			}
		}
		
		return mayoresM;
	}
	
	public static int MenoresF() {
		
		int menoresF = 0;
		
		for (Persona persona : personas) {
			
			if (persona.edad < 18) {
				if (persona.sexo == 1) {
					menoresF++;
				}
			}
			
		}
		
		return menoresF;
		
	}
	
	public static int PorcentajeMayores() {
		
		int porcentajeMayores = (Mayores() * 100) / personas.length;
		
		return porcentajeMayores;
		
	}
	
	public static int PorcentajeMujeres() {
		
		int mujeres = 0;
		
		for (Persona persona : personas) {
			if (persona.sexo == 1) {
				mujeres++;
			}
		}
		
		int porcentajeMujeres = (mujeres * 100) / personas.length;
		
		return porcentajeMujeres;
		
	}
	
}
