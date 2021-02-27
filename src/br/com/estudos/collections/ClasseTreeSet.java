package br.com.estudos.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class ClasseTreeSet {

	public static void main(String[] args) {
		
		
		TreeSet<Integer>numeros = new TreeSet<>(new Comparator<>() {

			@Override
			public int compare(Integer arg0, Integer arg1) { // Realiza a ordena��o em ordem decrescente de n�meros inteiros
				
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
			numeros.add(r.nextInt(500));
		}
		
		System.out.println("N�o mantem a ordem de inser��o dos elementos e ordena os valores em ordem decrescente por conta do comparator");
        System.out.println(numeros+"\n");
		
        System.out.println("Verifica se est� vazio");
		System.out.println(numeros.isEmpty()+"\n"); 
		
		System.out.println("Verifica o tamanho");
		System.out.println(numeros.size()+"\n"); 
		
		System.out.println("Permite remover elemento pelo nome (40)");
		numeros.remove(40); 
		System.out.println(numeros+"\n");
		
		System.out.println("Verifica se determinado elemento exite(20)");
		System.out.println(numeros.contains(20)+"\n"); 
		
		System.out.println("Exibe os valores menores (ordem crescente) ou maiores (ordem decrescente) que o valor passado no par�metro (100)");
		System.out.println(numeros.headSet(100)+"\n");
		
		System.out.println("Pr�ximo valor da �rvore e que � maior (order crescente) ou menor (ordem decrescente) que o valor passado no par�metro (100)");
		System.out.println(numeros.higher(100)+"\n"); 
		
		System.out.println("Valor que antecede (ordem crescente) ou que sucede (ordem decrescente) o valor passsado no par�metro (100)");
		System.out.println(numeros.lower(100)+"\n");
		
		System.out.println("Primeiro valor do lado esquerdo para a direita da �rvore");
		System.out.println(numeros.first()+"\n");
		
		System.out.println("Primeiro valor do lado direito para a esquerda da �rvore");
		System.out.println(numeros.last()+"\n");	
		
		System.out.println("Exibe e remove o primeiro valor do lado esquerdo da �rvore");
		System.out.println(numeros.pollFirst()); 
		System.out.println(numeros+"\n");
		
		System.out.println("Exibe e remove o primeiro valor do lado direito da �rvore");
		System.out.println(numeros.pollLast()); 
		System.out.println(numeros+"\n");	
		
		System.out.println("Exibe os valores valores que sucedem ou antecedem o valor do parametro (100) que estejam do lado direito da �rvore");
		System.out.println(numeros.tailSet(100));
		System.out.println("");
		
		System.out.println("Lista valores atrav�s de FOR EACH");		
		for(int a : numeros) {
			System.out.println(a);
		}
		System.out.println("");
		
		System.out.println("Lista valores atrav�s de ITERATOR");		
		Iterator<Integer>iteratorNumeros = numeros.iterator();
		while(iteratorNumeros.hasNext()) {
			System.out.println(iteratorNumeros.next());
		}
		System.out.println("");
		System.out.println("N�o permite acessar valores do set atrav�s do m�todo get");
		/*for(int i=0; i < numeros.size(); i++) {
			System.out.println(numeros[i]);
		}*/		

	}

	
}
