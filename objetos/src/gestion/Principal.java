package gestion;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1;//definimos la variable
		
		p1=new Persona();//la instanciamos
		
		Persona p2 = new Persona();// la definimos y la instanciamos a la vez.
		
		Persona p3 =new Persona("Charo","Castro",23,"Mujer", 55, 165);
		System.out.println(p3);
		
		
		// hacer una copia se crea un constructor se hacen objetos diferentes.
		Persona copia = new Persona(p3);
		
		//se crea una referencia en un mismo objeto.
		Persona referencia = p3;
		
		System.out.println(copia);
		System.out.println(p3);
		
		System.out.println("La persona 3 es ");
		p3.mostrarPersona();
		System.out.println("La persona copia es ");
		copia.mostrarPersona();
		
		System.out.println("La edad de p3 es "+p3.getEdad());
		
		p3.setEdad(31);
		System.out.println("La edad de p3 es "+p3.getEdad());
		p3.setEdad(8);
		
		// saber si es mayor de edad
		if(p3.esMayorDeEdad()) {
			System.out.println(p3.getNombre() + " es mayor de edad");
			
		}else {
			System.out.println(p3.getNombre() + " NO es mayor de edad");
			
			
		}
	}

}
