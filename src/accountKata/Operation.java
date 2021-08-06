package accountKata;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Operation {

	private String type;
	private double amount;
	private Date date;
	
	// Opération effectuée au moment du retrait	
	public Operation(String type, double amount){
		this.setAmount(amount);
		this.setType(type);
		this.setDate(new Date());
	}
	
	// Opération effectuée a  la date: date
	
	public Operation(String type, double amount, Date date ){
		this(type,amount);
		this.setDate(date);
	}
	
	public String print(){
		String operation= new String();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		operation= type +"  "+amount+"  "+ dateFormat.format(date);
		return operation;	
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

}
