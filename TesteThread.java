
import java.util.*;
import java.util.functions.*;

import static java.lang.System.out;

/**
 * Exemplo de outras alternativas para o uso de expressoes lambda.
 */
public class TesteThread {

	public static void main(String args[]){
		String msg = "Runnable em lambda expression ";

		//metodo void
		new Thread(() -> { out.println("Runnable em lambda expression "); }).start();

		new Thread(newRun("outra thread...")).start();		

		new TesteThread().useThis();		

		changeContent(msg);
	}

	public String toString() {
		return "toString de TesteThread";
	}

	//metodo retorna lambda
	static Runnable newRun(String content){
		return () -> { out.println("Runnable em lambda expression "); };
	}

	//metodo utilizando this (referencia para TesteThread)
	void useThis() {
		new Thread(() -> { out.println(this); }).start();
	}

	//lambdas sao objetos imutaveis
	static void changeContent(String s) {
		//nao compila
		//new Thread(() -> { s = "Outro"; }).start();
	}
}


//usar string
//criar um metodo que retorna thread...
//criar um metodo que usa utiliza this (n static)
