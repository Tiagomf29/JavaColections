package br.com.estudos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ClasseArrayList {

	public static void main(String[] args) {
		
		
		/*Criando a lista de cores*/
		ArrayList<String>listaCores = new ArrayList<>();
		
		/*Adicionando a lista de cores*/
		
		listaCores.add("Amarelo");
		listaCores.add("Vermelho");
		listaCores.add("Azul");
		listaCores.add("Verde");
		listaCores.add("Roxo");
		listaCores.add("Lil�s");
		listaCores.add("Preto");
		listaCores.add("Cinza");
		listaCores.add("Branco");
		listaCores.add("Branco"); // A lista aceita valores repetidos
		listaCores.add("");
		
		System.out.println(listaCores);
		
		listaCores.remove(2); // Permite a remo��o por indice
		
		System.out.println(listaCores);
		
		listaCores.remove("Preto"); // Permite a remo��o pelo valor
		
		System.out.println(listaCores);
				
		Collections.sort(listaCores); // Permite a ordena��o
		
		System.out.println(listaCores);
		
		Collections.reverse(listaCores); // Permite a ordena��o reversa
		
		System.out.println(listaCores);
		
		System.out.println(listaCores.get(2)); // Permite a exibi��o do valor por ind�ce da lista
		
		System.out.println(listaCores.contains("Branco")); // Permite varificar se dentro da lista contem um determinado valor
		
		System.out.println(listaCores.indexOf("Vermelho")); // Exibe o indice da lista de um determinado valor
		
		System.out.println(listaCores.isEmpty()); // Verifica se a lista est� vazia
		
		listaCores.set(5, "Rosa"); // Permite a atualiza��o de valores na lista
		
		System.out.println(listaCores);
		
		System.out.println(listaCores.size()); // Exibe o tamanho da lista
		
		// � possivel percorrer a lista utilizando o For Each
		System.out.println("=======");
		for(String cores : listaCores) {
			System.out.println(cores);
		}
		
		// � possivel percorrer a lista atrav�s de for simples acessando os valores pelo m�todo get
		System.out.println("========");
		
		for(int i= 0; i < listaCores.size(); i++) {
			System.out.println(listaCores.get(i));
		}
		
		
	    // � poss�vel percorrer atrav�s de iterator		
		Iterator<String>listaIterator = listaCores.iterator();
		System.out.println("=========");
		
		while(listaIterator.hasNext()) {
			System.out.println(listaIterator.next());
		}
		
		
		
		/*
		 * Como visto, a utiliza��o da classe ArrayList � flex�vel e permite um s�rie de funcionalidades que podem ser muito �til no dia a dia.
		 */
				

	}

}
