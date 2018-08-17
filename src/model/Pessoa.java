/**
 * 
 */
package model;

/**
 * @author Carlos Massavanhane
 *
 */
public abstract class Pessoa {

	private String nome;
	private int idade;
	
		
	/**
	 * @param nome
	 * @param idade
	 */
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}


	/**
	 * 
	 */
	public Pessoa() {
		// TODO Auto-generated constructor stub
		this.idade=0;
		this.nome="indefinido";
	}


	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}


	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	

}
