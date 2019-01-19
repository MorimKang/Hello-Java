package exam.oop5;

public class Account {
	static int money1; //미리 만들어놓고 부를때마다 공유해서 씀.
	int money2;
	
	public Account(int money) {
		money1 += money;
		money2 += money;
	}
	
}
