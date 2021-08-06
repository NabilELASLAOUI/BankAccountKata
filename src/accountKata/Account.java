package accountKata;

public class Account {
	
	// Solde du compte
	private double balance;
	
	// Le r�lev� du compte: servira � stocker toutes les op�rations
	private Statement statement;
	
	
	public Account(){
		statement = new Statement();
		// on initialise le compte avec un solde de 0
		balance=0;
		
	}
	
	// un autre constructeur si on veut initialiser le compte avec un solde de d�part
	public Account(double balance){
		this();
		statement = new Statement();
		this.balance=balance;
	}
	
	//Op�ration de retrait	
	// mamount: le montant � retir�
	public void withdrawal(double amount){
		
		// on v�rifie si ce montant existe dans le compte
		// on peut v�rifier aussi si on n'a pas saisi une chaine de caract�re
		if((balance-amount)>= 0){			
			// on fait le retrait
			balance-=amount;
			// on stocke cette op�ration
			Operation operation=new Operation("WITHDRAWAL",amount);
			statement.addOperation(operation);			
			System.out.println("Retrait effectu�");
		}
		else
			System.out.println("Le solde n'est pas suffisant.");
	}
	
	// op�ration de d�p�t
	// mamount: le montant � retir�
	public void deposit(double amount){
				
		// on rajoute le montant au solde du compte
		balance+=amount;
		// on stocke l'op�ration
		Operation operation=new Operation("DEPOSIT   ",amount);
		statement.addOperation(operation);
		System.out.println("D�p�t effectu�.");
		
	}	
	
	// Pour afficher le releve du compte.	
	public void  print(){
		System.out.println("Voici votre releve: ");
		System.out.println("-------=======---------");	
		System.out.println("OPERATION    MONTANT    DATE ");
		System.out.println("----------------------------");	
		System.out.println(statement.print());
		System.out.println("SOLDE:   "+balance);
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
}
