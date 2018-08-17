/**
 * 
 */
package view;

import javax.swing.JOptionPane;

import model.Agenda;

/**
 * @author Carlos Massavanhane
 *
 */
public class TestaAgenda {

	/**
	 * 
	 */
	public TestaAgenda() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantP=Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas deseja na agenda"));
		Agenda agenda=new Agenda(quantP);
		
		JOptionPane.showMessageDialog(null, "A quantidade de amigos eh: "+ agenda.getQuantAmigos() + "\n a quantidade de conhecidos eh: "+ agenda.getQuantConhecidos());
		
		agenda.addInformacoes();
		agenda.imprimirAniversarios();
		agenda.imprimirEmails();
	}

}
