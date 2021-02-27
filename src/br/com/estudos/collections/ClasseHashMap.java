package br.com.estudos.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ClasseHashMap {
		
	
	public static void main(String[] args) {
		
		HashMap<Integer, Pessoa> pessoas = new HashMap<>();
		
		for(int i = 0; i < 20; i++) {	
		    Pessoa a = new Pessoa();
			a.setCpf(5000+i);
			a.setNome("NomePessoa"+i);
			pessoas.put(500+i, a);	//Insere ou atualiza dados do hash map (N�o aceita chaves repetidas)					
		}
		
		System.out.println("Id do objeto juntamente com informa��es do objeto pessoa (N�o mantem a ordem de inser��o dos objetos)");
		System.out.println(pessoas.toString()+"\n");
		
		System.out.println("Verifica se a o hash map cont�m a chave de n�mero 12");
		System.out.println(pessoas.containsKey(12)+"\n");
		
		System.out.println("Verifica se o hash map est� vazia");
		System.out.println(pessoas.isEmpty()+"\n");
		
		System.out.println("Verifica o tamanho da lista");
		System.out.println(pessoas.size()+"\n");
		
		System.out.println("Exibindo todas as chaves do hash map");
		System.out.println(pessoas.keySet()+"\n");
		
		System.out.println("Percorrendo as chaves e objetos do hash map com for each");
		for(Integer a : pessoas.keySet()) {
			
			System.out.println("Chave: " +a+" Nome:"+pessoas.get(a).getNome() + " Cpf: "+pessoas.get(a).getCpf());
		}	
		System.out.println("");			
		System.out.println("Percorrendo as chaves e objetos do hash map com for each");	
		for (Entry<Integer, Pessoa> pair : pessoas.entrySet()) {
    	   System.out.println(pair.getKey()+" - "+pair.getValue());
       }
		System.out.println("");			
		System.out.println("Percorrendo o hash map considerando para buscar as chaves do hash map por iterator");
		Set<Integer>chaves = pessoas.keySet();
		Iterator<Integer>chavesIterator = chaves.iterator();
		while(chavesIterator.hasNext()) {
			System.out.println(chavesIterator.next());
		}	
		
		// Hash Map n�o aceita ordena��o
		
	}

	public static class Pessoa{
		
		private int cpf;
		private String nome;
		
		public int getCpf() {
			return cpf;
		}
		public void setCpf(int cpf) {
			this.cpf = cpf;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Nome:"+this.getNome()+" Cpf:"+this.getCpf();
		}		
				
	}
	
}
