package br.com.estudos.collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ClasseQueue {

	public static void main(String[] args) {
		
		/* A classe Queue possui algumas caracteristicas diferentes da classe ArrayListe por exemplo. 
		A mesmo � bastante �til para implementa��es de estrutura de dados do tipo FILA, ou seja,
		o primeiro elemento que entra na fila � a primeira que sai. */
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Marcelo");
		fila.add("Jo�o");
		fila.add("Rogerio");
		fila.add("Silvia");
		fila.add("Carmem");
		fila.add("Carmem"); // Aceita valores repetidos
		fila.add("");
		fila.add(null);
		
		System.out.println(fila); // Exibe todos os valores da fila na ordem de inser��o		
		
		fila.remove("Rogerio");
		System.out.println(fila); // Permite a remo��o de um valor da fila
		
		// Collections.sort(fila); N�o permite ordena��o
		
		// Collections.reverse(fila); N�o permite ordena�ao reversa
		
		// fila.set(1,"Teste"); N�o permite atualiza��o
		
		fila.poll(); // Exibe o valor do primeiro elemento da fila e o remove
		System.out.println(fila);
		
		System.out.println(fila.peek()); // Exibe o o valor do primeiro elemento da fila e n�o o remove. 
		System.out.println(fila);
		
		// Caso o valor seja null, o mesmo � apresentando na tela		
		Queue<String> teste = new LinkedList<>();
		System.out.println(teste.peek());
		
		
		// � poss�vel percorrer a fila com FOR EACH
		System.out.println("======");
		for(String nomes : fila) {
			System.out.println(nomes);
		}
		
		/*N�o � poss�vel percorrer a fila com for comum acessando o m�todo get
		for(int i=0; i < fila.size(); i++) {
			System.out.println(fila.get(i));
		}
		*/
		
	    // � poss�vel percorrer a fila com iterator
		System.out.println("======");
		Iterator<String>iteratorFila = fila.iterator();
		while(iteratorFila.hasNext()) {
			System.out.println(iteratorFila.next());
		}
		System.out.println("======");		
		
		System.out.println(fila.element()); // Tamb�m exibe o valor do primeiro elemento da fila e n�o o remove
		System.out.println(fila);
		
		// No entanto, caso o valor retornado seja null, uma excess�o ser� lan�ado
		System.out.println(teste.element());		
		

	}

}
