package accountKata;

public class Main {

	public static void main(String[] args) {
		
		// compte 1
		Account account1 = new Account();
		
		// Dépot de 100 
		System.out.println("Compte 1: \n");
		account1.deposit(100);
		System.out.println("Nouveau solde est: "+account1.getBalance());
		
		System.out.println();
			
		// compte 2
		Account account2 = new Account();
		
		// retrait de 10 
		account2.withdrawal(10);
		System.out.println("Nouveau solde est: "+account2.getBalance());
		
		System.out.println();
		
		 
		// statement
		account2.print();

	}

}
