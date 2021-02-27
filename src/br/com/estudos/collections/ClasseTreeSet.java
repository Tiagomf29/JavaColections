package br.com.estudos.collections;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class ClasseTreeSet {

	public static <T> void main(String[] args) {
		
		
		TreeSet<Integer>numeros = new TreeSet<>(new Comparator<>() {

			@Override
			public int compare(Integer arg0, Integer arg1) { // Realiza a orden��o em ordem decrescente n�meros inteiros
				
				if(arg0 < arg1) {
					return 1;
				}else
					if(arg0 > arg1) {
						return -1;
					}else {
						return 0;
					}
			}
		});
		
		Random r = new Random();
		for(int i = 0; i < 20; i ++) {
			numeros.add(r.nextInt(100));
		}
		
        System.out.println(numeros); // N�o mantem a ordem de inser��o dos elementos
		
		System.out.println(numeros.isEmpty()); // Verifica se est� vazio
		
		System.out.println(numeros.size()); // Verifica a tamanho
		
		numeros.remove(40); // Permite remover elemento pelo nome
		System.out.println(numeros);
		
		System.out.println(numeros.contains(20)); // Verifica se determinado elemento exite
		
		System.out.println("===");
		System.out.println(numeros.headSet(100)); // Exibe os valores menores que o valor passado no par�metro 
		
		System.out.println("===*");
		System.out.println(numeros.higher(100)); // Pr�ximo valor da �rvore e que � maior que o valor passado no par�metro	
		
		System.out.println("===**");
		System.out.println(numeros.lower(100));	// Valor que antecede o valor passsado no par�metro
		
		System.out.println("===***");
		System.out.println(numeros.first()); //Primeiro valor do lado esquerdo da �rvore.
		
		System.out.println("===****");
		System.out.println(numeros.last()); //�ltimo valor do lado direito da �rvore.	
		
		System.out.println("===*****");
		System.out.println(numeros.pollFirst()); //Exibe e remove o primeiro valor do lado esquerdo da �rvore.
		System.out.println(numeros);
		
		System.out.println("===*****");
		System.out.println(numeros.pollLast()); //Exibe e remove o �ltimo valor do lado esquerdo da �rvore.
		System.out.println(numeros);	


	}

	
}
