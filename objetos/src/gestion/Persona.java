package gestion;

public class Persona {
	
	// estado del objeto, propiedad o atributo.
	private String nombre;
	private String apellidos;
	private int edad;
	private String sexo; // Hombre o Mujer.
	private double peso;
	private double altura;
	
	//java crea por defecto un constructor. si construyes uno 
	
	// crear constructor sin parámetros 
	
	public Persona() {
		edad=0;
		nombre = "no inicializado";
	}
	/**
	 *  otro constructor se le llama sobrecarga del constructor. porque tiene parámetros.
	 * @param n String nombre de la persona
	 * @param a String apellidos de la persona
	 */
	
	public Persona(String n, String a) {
		nombre=n;
		apellidos=a;
		
	}
	public Persona(String nombre, String apellidos, int edad, String sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	// crear un constructor de copia Persona.
	public Persona(Persona p) {
		this.nombre=p.nombre;
		this.apellidos=p.apellidos;
		this.edad=p.edad;
		this.sexo=p.sexo;
		this.peso=p.peso;
		this.altura=p.altura;
		
	}
	// creamos un metodo.
	public void mostrarPersona() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("Edad: "+this.edad);
		System.out.println("Altura: "+this.altura);
		System.out.println("Peso: "+this.peso);
		System.out.println("Sexo: "+ this.sexo);
	}
	// método getters
	public int getEdad() {
		return this.edad;
	}
	/**
	 * método de la clase que establece la edad de la persona
	 * Si la edad es negativa no se actualiza
	 * 
	 * @param edad int para modificar edad.
	 */
	
	//método setters
	public void setEdad(int edad) {
		if(edad>=0) {
			this.edad=edad;
		}
		
	// hemos creado todos los metodos setters y getters automaticos.	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	/**
	 *  para saber si es mayor de edad.
	 * @return
	 */
	public boolean esMayorDeEdad() {
		if(this.edad >=18) {
			return true;
		}
		return false;
		//return edad>=18;
	}
	
	/**
	 *  calcula el IMC (indice masa corporal) que es el peso kg/(altura en metros)^2
	 */
	
	public double calculaIMC() {
		return  peso/Math.pow(altura/100, 2);
		
		
		
	}
	/**
	 *  calcular el estado del peso de una persona 
	 *  con  el metodo calculaIMC
	 * @return "El Peso Bajo" || "Peso Ideal" || "Sobrepeso"
	 * 
	 */
	
	public String estadoPeso() {
		if(calculaIMC() < 20) {
			return"El Peso Bajo";
		}else if (this.calculaIMC()>=20 && this.calculaIMC()<=25) {
			return "Peso Ideal";
		}else {
			return "Sobrepeso";
		}
	}
	/**
	 * invocar a toString()
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", sexo=" + sexo
				+ ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
}
