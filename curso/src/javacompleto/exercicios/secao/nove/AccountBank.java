package javacompleto.exercicios.secao.nove;

public class AccountBank {
	private String accountNumber;
	private String holder;
	private Double balance;
	private Double taxa = 5.00;

	public AccountBank() {

	}

	public AccountBank(String acoountNumber, String name) {
		this.accountNumber = acoountNumber;
		this.holder = name;
		this.balance = 0.0;
	}
	
	public AccountBank(String acoountNumber, String name, double value) {
		this.accountNumber = acoountNumber;
		this.holder = name;
		this.balance = value;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String name) {
		this.holder = name;
	}

	// saque com taxa de 5 reais e deposito

	public void withdraw(double amount) {
		double taxaTemp = taxa + amount;
		this.balance = balance - taxaTemp;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	@Override
	public String toString() {
		return "AccountBank [accountNumber=" + accountNumber + ", holder=" + holder + ", balance=" + balance + ", taxa="
				+ taxa + "]";
	}

}