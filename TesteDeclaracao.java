
import java.util.*;

import static java.lang.System.out;

/**
  * Exemplo demonstra as formas para definir uma expressao lambda.
  */
public class TesteDeclaracao {

	public static void main(String args[]){
		List<String> nomes = Arrays.asList(new String[]{"Pedro","Carolina","Ana","Bruno"});

		//lambda expression
		Collections.sort(nomes, (s1, s2) -> s1.compareToIgnoreCase(s2) );

		//target typing
		Comparator<String> c = (String s1, String s2) -> s1.compareToIgnoreCase(s2);
		Collections.sort(nomes, c);

		//method reference
		Collections.sort(nomes, String::compareToIgnoreCase);

		for (String n: nomes){
			out.println(n);
		}

	}

}
