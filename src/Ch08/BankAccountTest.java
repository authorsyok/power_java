package Ch08;

class BankAccount {
	int accountNumber;		// 계좌번호
	String ouner;			// 예금주
	int balance;			// 잔액
	
	void deposit(int amount) {	// 저금
		balance += amount;
	}
	
	void withdraw(int amount) { // 인출
		balance -= amount;
	}
	
	public String toString() {
		return "현재 잔액은 " + balance + "입니다.";
	}
}

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount myAccount = new BankAccount();
		
		myAccount.deposit(10000);
		System.out.println(myAccount);
		myAccount.withdraw(5000);
		System.out.println(myAccount);
	}
}
