/**
 * 
 */
package model;

import java.util.Date;

import javax.swing.JOptionPane;

/**
 * @author Carlos Massavanhane
 *
 */
public class Agenda {

	/**
	 * 
	 */
 	private Pessoa[] pessoas;
 	
 	/**
 	 * 
 	 */
 	private int quantAmigos;
 	
 	/**
 	 * 
 	 */
 	private int quantConhecidos;
 	
 	
	/**
	 * 
	 */
	public Agenda(int quantPessoas) {
		pessoas=new Pessoa[quantPessoas];
		
		int sorteio;
		
		for(int i=0;i<pessoas.length;i++) {
			sorteio = 1 + (int) (Math.random() * 2);
			if(sorteio==1) {
				pessoas[i]=(Amigo)new Amigo();
				quantAmigos++;
			}else {
				pessoas[i]=(Conhecido)new Conhecido();
				quantConhecidos++;
			}
		}
		
		
		// TODO Auto-generated constructor stub
	}
	
	public void addInformacoes() {
		int idade;
		String nome;
		String email;
		Date data;
		
		String[] nomes= {"Amanda","Felipe"," Bruno","Isabela","Arley","Luana","Valter","Ana","Júlia","Paulo","Maria","Beatriz","Lara","Mariana","Bruna","Eddie","Mantchory","Larissa","Sofia","Camila","Laura","Valentina","Luis","Carlos","Manuel","Felix"};
		int sorteia;
		
		
		for(int i=0; i<this.pessoas.length;i++) {
			sorteia=(int)(Math.random()*nomes.length);
			nome=nomes[sorteia];
			idade=1+(int)(Math.random()*30);
			
			if(pessoas[i] instanceof Amigo) {
				data=new Date(1+(int)(Math.random()*2017), 1+(int)(Math.random()*12), 1+(int)(Math.random()*30));
				((Amigo)pessoas[i]).setNome(nome);
				((Amigo)pessoas[i]).setIdade(idade);
				((Amigo)pessoas[i]).setDataAniversario(data);
			}else if(pessoas[i] instanceof Conhecido) {
				email=nome+"@email.com";
				((Conhecido)pessoas[i]).setNome(nome);
				((Conhecido)pessoas[i]).setIdade(idade);
				((Conhecido)pessoas[i]).setEmail(email);
			}
		}
	}

	public void imprimirAniversarios() {
		String aniversarios="";
		boolean amigos=false;
		for(int i=0;i<this.pessoas.length;i++) {
			if(pessoas[i] instanceof Amigo) {
				aniversarios=aniversarios+"O aniversario de "+ ((Amigo)pessoas[i]).getNome()+" eh "+((Amigo)pessoas[i]).getDataAniversario()+"\n";
				amigos=true;
			}
		}
		if(amigos)
			JOptionPane.showMessageDialog(null, aniversarios);
		else 
			JOptionPane.showMessageDialog(null, "Nao existem amigos cadastrados na agenda");
	}
	
	public void imprimirEmails() {
		String emails="";
		boolean conhecidos=false;
		for(int i=0;i<this.pessoas.length;i++) {
			if(pessoas[i] instanceof Conhecido) {
				emails=emails+"O email de "+ ((Conhecido)pessoas[i]).getNome()+" eh "+((Conhecido)pessoas[i]).getEmail()+"\n";
				conhecidos=true;
			}
		}
		if(conhecidos)
			JOptionPane.showMessageDialog(null, emails);
		else 
			JOptionPane.showMessageDialog(null, "Nao existem conhecidos cadastrados na agenda");
	}

	/**
	 * @return the pessoas
	 */
	public Pessoa[] getPessoas() {
		return pessoas;
	}

	/**
	 * @param pessoas the pessoas to set
	 */
	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}

	/**
	 * @return the quantAmigos
	 */
	public int getQuantAmigos() {
		return quantAmigos;
	}

	/**
	 * @param quantAmigos the quantAmigos to set
	 */
	public void setQuantAmigos(int quantAmigos) {
		this.quantAmigos = quantAmigos;
	}

	/**
	 * @return the quantConhecidos
	 */
	public int getQuantConhecidos() {
		return quantConhecidos;
	}

	/**
	 * @param quantConhecidos the quantConhecidos to set
	 */
	public void setQuantConhecidos(int quantConhecidos) {
		this.quantConhecidos = quantConhecidos;
	}
	
	
}
