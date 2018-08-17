/**
 * 
 */
package model;

import java.util.Date;

/**
 * @author Carlos Massavanhane
 *
 */
public class Amigo extends Pessoa {
	
	private Date dataAniversario;

	/**
	 * 
	 */
	public Amigo() {
		super();
		this.dataAniversario=null;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the dataAniversario
	 */
	public Date getDataAniversario() {
		return dataAniversario;
	}

	/**
	 * @param dataAniversario the dataAniversario to set
	 */
	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	
	

}
