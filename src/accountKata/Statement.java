package accountKata;

import java.util.ArrayList;

public class Statement {

	private ArrayList <Operation> operations;
	
	// Constructeur 
	public Statement(){
		operations= new ArrayList <Operation> ();
	}
	// Ajout d'une operation 
	public void addOperation(Operation newOperation){
		operations.add(newOperation);
	}
	
	
	/** 
	 *  un string qui servira pour l'affichage de l'operations.
	 * 
	 */
	public String print(){
		
		String statement = new String();
		
		for(int i=0; i<operations.size(); i++)
		{
			statement+=operations.get(i).print();
			statement+="\n";
		}
		return statement;
	}
}
