package vetor;

import java.util.ArrayList;
import java.util.Arrays;
public class exm03 {

	public static void main(String[] args) {
		
		String[] disciplinas = {"Matemática", "Filosofia", "História", "Física"};
		ArrayList<String>novaLista = new ArrayList<String> (Arrays.asList(disciplinas));
		novaLista.add("Geografia");
		novaLista.add("Lingua Inglesa");
		
		for (String i: novaLista)
		{
			System.out.println("Disciplina: "+i);
		}
		
	}

}
