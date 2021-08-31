package Model;

import GraphCore.DataSet;

public class DataSetModel extends DataSet{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DataSetModel() {
		
	}
	public DataSetModel(int id, String country, String capital) {
		this.country=country;
		this.capital=capital;	
		this.id= id;
		
	}

}
