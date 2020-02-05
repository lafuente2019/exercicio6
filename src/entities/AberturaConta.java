package entities;

//criando classe com atributos da conta e com metodos Necessarios 

public class AberturaConta {
	
	private int accountNumber ;
	private String name;
	private double depositValue;
	private int taxSaque = 5;
	
	public AberturaConta(int accountNumber, String name, double initialDeposit) {
		
		this.accountNumber = accountNumber;
		this.name = name;
		addDeposit(initialDeposit);
			
	}
	public AberturaConta(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
		
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getName() {
			return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public  double getDepositValue() {
		return this.depositValue;
	}
	public int getTaxSaque() {
		return this.taxSaque;
	}
	public double addDeposit(double value) {
		return this.depositValue += value;
	}
	public double valorSaque(double value) {
		
		return this.depositValue += - value - taxSaque;
		
	}
	public String toString() {
		return "account Number: " + accountNumber + ", "
				+ " Name: " + name + ", "
		        + " Saldo conta: $ " + depositValue;
	}
}
