package Casita;

public class Bienvenida {
	// Estas son constantes 
	final static String NAME ="�lvaro";
	final static int AGE = 30;
	
	// Eso es un m�todo pincipal
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola, me llamo"+" "+ NAME+" "+"Y tengo"+" "+ AGE+" "+"A�os");
	//Esto es una Variable local
		int numero = AGE; 

	}
		//Esta es una funci�n
		public static int getAge() {
			return AGE;
			
		}
}
