package accountKata;

public class Account {
	
	// Solde du compte
	private double balance;
	
	// Le rélevé du compte: servira à stocker toutes les opérations
	private Statement statement;
	
	
	public Account(){
		statement = new Statement();
		// on initialise le compte avec un solde de 0
		balance=0;
		
	}
	
	// un autre constructeur si on veut initialiser le compte avec un solde de départ
	public Account(double balance){
		this();
		statement = new Statement();
		this.balance=balance;
	}
	
	//Opération de retrait	
	// mamount: le montant à retiré
	public void withdrawal(double amount){
		
		// on vérifie si ce montant existe dans le compte
		// on peut vérifier aussi si on n'a pas saisi une chaine de caractère
		if((balance-amount)>= 0){			
			// on fait le retrait
			balance-=amount;
			// on stocke cette opération
			Operation operation=new Operation("WITHDRAWAL",amount);
			statement.addOperation(operation);			
			System.out.println("Retrait effectué");
		}
		else
			System.out.println("Le solde n'est pas suffisant.");
	}
	
	// opération de dépôt
	// mamount: le montant à retiré
	public void deposit(double amount){
				
		// on rajoute le montant au solde du compte
		balance+=amount;
		// on stocke l'opération
		Operation operation=new Operation("DEPOSIT   ",amount);
		statement.addOperation(operation);
		System.out.println("Dépôt effectué.");
		
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
