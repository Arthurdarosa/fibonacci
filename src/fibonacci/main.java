package fibonacci;

import java.util.Scanner;

/*

codigo para saber a o valor de fibonacci de determinado numero da sequencia

*/

public class main {

	public static void main(String[] args) {
		System.out.println("digite o numero que voce deseja saber da sequencia de fibonacci: ");
		while(true) {
			int numero = new Scanner(System.in).nextInt();
			if(numero>=0) {
				System.out.println(fibonaccirecursivo(numero)+" <- forma recursiva");
				System.out.println(fibonaccilinear(numero)+" <- forma linear");
				break;
			}else {
				System.out.println("numero deve ser positivo");
			}
		}
	}
	
    public static int fibonaccirecursivo(int numero){
        if(numero == 0) {
        	return 0;
        } else {
        	if(numero == 1 || numero == 2){
            	return 1;
        	}
      
        	return fibonaccirecursivo(numero-1) + fibonaccirecursivo(numero -2);
        }
    }
    
    public static int fibonaccilinear(int numero) {
    	if(numero == 0) {
        	return 0;
        } else {
    		if (numero == 1 || numero == 2) {
	    		return 1;
	    		}
	    		int somador1 = 1, somador2 = 1, fibonacci = 1;
	    		for (int i = 3; i <= numero; i++) {
	    		fibonacci = somador1 + somador2;
	    		somador1 = somador2;
	    		somador2 = fibonacci;
	
	    		}
	
	    		return fibonacci;
        }
    }	
}
