package Ch08;

class BankAccount {
	int accountNumber;		// ���¹�ȣ
	String ouner;			// ������
	int balance;			// �ܾ�
	
	void deposit(int amount) {	// ����
		balance += amount;
	}
	
	void withdraw(int amount) { // ����
		balance -= amount;
	}
	
	public String toString() {
		return "���� �ܾ��� " + balance + "�Դϴ�.";
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
