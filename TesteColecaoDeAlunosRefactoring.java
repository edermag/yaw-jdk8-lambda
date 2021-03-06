
import java.util.*;
import java.util.functions.*;

import static java.lang.System.out;

/**
 * Demonstracao de como tirar proveito de colecoes com metodo default.
 */
public class TesteColecaoDeAlunosRefactoring {

	public static void main(String args[]){
		List<Aluno> alunos = buildAlunos(); 

		out.println("---------------\nAlunos da turma:");
		//navegacao atraves de metodo...
		alunos.forEach(a -> { out.println("\t" + a); });
		

		//aplicando filtro para considerar somente os aprovados
		out.println("---------------\nAprovados:");
		alunos.filter(a -> a.isAprovado()).forEach(a -> { out.println("\t" + a); });

		//copiando dados filtrados de uma colecao pra outra
		List<Aluno> aprovados = alunos.filter(a -> a.isAprovado()).into(new ArrayList<Aluno>());
		out.println("---------------\nPrimeira nota aprovada:");
		System.out.println("\t" + aprovados.map(a -> a.getNota()).getFirst());		
	}

	static List<Aluno> buildAlunos() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno("Claudia", 7));
		alunos.add(new Aluno("Paula", 9));
		alunos.add(new Aluno("Ricardo", 6));
		alunos.add(new Aluno("Flavia", 4));
		alunos.add(new Aluno("Mario", 8));
		alunos.add(new Aluno("Ana", 5));
		return alunos;
	}
}
