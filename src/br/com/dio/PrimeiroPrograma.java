package br.com.dio;

import br.com.dio.model.Gato;

/**
 * @author Josiany
 *
 */
public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato gato = new Gato();
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
		
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World!" + (a+b));*/
	}
}
	
	class Livro {
		private String nome;
		private String npag;
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNpag() {
			return npag;
		}
		public void setNpag(String npag) {
			this.npag = npag;
		}
	}


