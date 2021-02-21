import java.util.HashSet;
import java.util.Iterator;

public class ClasseHashSet {

	public static void main(String[] args) {
		
		HashSet<String> paises = new HashSet<>();
		
		paises.add("Brasil");
		paises.add("Uruguai");
		paises.add("Argentina");
		paises.add("Inglaterra");
		paises.add("Palonia");
		paises.add("Colombia");
		paises.add("Estados Unidos");
		paises.add("Alemanha");
		paises.add("Alemanha"); // N�o permite valores repetidos
		paises.add(null);
		paises.add("");
		
		System.out.println(paises); //N�o considera a ordem de inser��o
		
		paises.remove("Palonia"); // Pemite a remo��o de um determinado elemento
		System.out.println(paises);
		
		// Collections.sort(paises); N�o permite ordena��o ascendente
		// Collections.reverse(paises); N�o permite ordena��o descendente
		
		// System.out.println(paises.get(0)); N�o permite acessar valores pel m�todo get
		
		System.out.println(paises.size()); // Retorna o tamanho do set
		
		System.out.println(paises.contains("Brasil")); // Verifica se o valor passado como par�metro existe no Set
		
		System.out.println(paises.isEmpty()); // Verifica se o Set est� vazio
		
		// percorre o set sem considerar a ordem de inser��o
		System.out.println("==================x");
		for(String a: paises) {
			System.out.println(a);
		}
		
		/* n�o permite acessar valores do set atrav�s do m�todo get
		System.out.println("===================");
		for(int i = 0; i < paises.size(); i++) {
			System.out.println(paises.get(i));
		}*/
		
		//Permite percorrer o set atrav�s de iterator
		System.out.println("=======================");
		Iterator<String>paisesIterator = paises.iterator();
		while(paisesIterator.hasNext()) {
			System.out.println(paisesIterator.next());
		}
				
		paises.clear(); // limpa a lista
		
		System.out.println(paises.isEmpty()); // Verifica se o set est� vazio
		
		/* O HashSet tem como caracter�stica principal n�o manter a ordem dos seus elementos conforme a inser��o dos mesmos,
		 * n�o permite ordena��o e reordena��o dos elementos, n�o permite elementos repetidos e n�o permite o acesso a qualquer 
		 * elemento atrav�s de posi��o do set por algum m�todo como por exemplo o m�todo get que existe no ArrayList */
				
		
	}

}
