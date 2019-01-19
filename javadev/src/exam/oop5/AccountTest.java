package exam.oop5;

public class AccountTest {
	public static void main(String[] args) {
		Account.money1 = 10000;
		
		Account ac01 = new Account(10000);
		System.out.println("money1: "+ ac01.money1);
		System.out.println("money2: "+ ac01.money2);
		
		Account ac02 = new Account(10000);
		System.out.println("money1: "+ ac02.money1);
		System.out.println("money2: "+ ac02.money2);
		
		Account ac03 = new Account(10000);
		System.out.println("money1: "+ ac03.money1);
		System.out.println("money2: "+ ac03.money2);
	}
}
