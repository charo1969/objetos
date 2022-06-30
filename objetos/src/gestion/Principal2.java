package gestion;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Persona p = new Persona();
		
		System.out.println("Nombre: ");
		p.setNombre(teclado.nextLine());
		
		System.out.println("Apellidos: ");
		p.setApellidos(teclado.nextLine());
		
		System.out.println("Peso:");
		p.setPeso(teclado.nextDouble());
		
		System.out.println("Altura:");
		p.setAltura(teclado.nextDouble());
		
		System.out.println("Tus datos son:");
		p.mostrarPersona();
		
		System.out.println("Tu indice de masa corporal es: "+ p.calculaIMC());
		
		System.out.println(p.estadoPeso());
		
		// mostrar por pantalla con toString
		System.out.println(p);

	}

}
