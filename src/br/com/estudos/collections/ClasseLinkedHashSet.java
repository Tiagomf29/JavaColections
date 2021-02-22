package br.com.estudos.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ClasseLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String>timesFutebol = new LinkedHashSet<>();
		timesFutebol.add("Cruzeiro");
		timesFutebol.add("Atletico");
		timesFutebol.add("Corinthias");
		timesFutebol.add("Palmeiras");
		timesFutebol.add("Gr�mio");
		timesFutebol.add("Internacional");
		timesFutebol.add("S�o Paulo");
		timesFutebol.add("Santos");
		timesFutebol.add("Santos"); // N�o aceita valores repetidos
		
		
		System.out.println(timesFutebol); // Mantem a ordem de inser��o dos elementos
		
		timesFutebol.remove("Atletico"); // Permite remover um elemento atrav�s do valor		
		System.out.println(timesFutebol);
		
		// Collections.sort(timesFutebol); N�o permite a ordena��o ascendente
		// Collections.reverse(timesFutebol); N�o permite a ordena��o descendente
		
		System.out.println(timesFutebol.size()); // Exibe o tamanho
		System.out.println(timesFutebol.isEmpty()); // verifica se est� vazio
		System.out.println(timesFutebol.contains("Cruzeiro")); // Verifica se determinado elemento existe
		
		// � possivel percorrer com FOR EACH
		System.out.println("=============");
		for(String times : timesFutebol) {
			System.out.println(times);
		}
		
		/* N�o � possivel percorer acessando a posi��o de cada elemento atraves do m�todo get
		System.out.println("===========");
		for(int i = 0; i < timesFutebol.size(); i++) {
			System.out.println(timesFutebol.get(i));
		}*/
		
		// � possivel percorrer atrav�s de iterator
		System.out.println("============");
		Iterator<String>iteratorTimes = timesFutebol.iterator();
		while(iteratorTimes.hasNext()) {
			System.out.println(iteratorTimes.next());
		}
	    
		/* A grande vant�gem de se utilizar o linkedHashSet em rela��o ao uso do HashSet � que o linkedHashSet mantem a ordem de inser��o dos 
		 * elementos. Com isso ele se torna um pouco mais lento do que o HashSet*/
		

	}

}
