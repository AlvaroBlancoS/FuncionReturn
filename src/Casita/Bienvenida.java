package Casita;

public class Bienvenida {
	// Estas son constantes 
	final static String NAME ="Álvaro";
	final static int AGE = 30;
	
	// Eso es un método pincipal
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola, me llamo"+" "+ NAME+" "+"Y tengo"+" "+ AGE+" "+"Años");
	//Esto es una Variable local
		int numero = AGE; 

	}
		//Esta es una función
		public static int getAge() {
			return AGE;
			
		}
}
