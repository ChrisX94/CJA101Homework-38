package hw9;

/*
 * 熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
 * 以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢已經入帳戶。假設媽媽一次匯款2000 元,熊大一次提款
 * 1000元,寫一個Java程式模擬匯款10次與提款10次的情形
 */
public class HW9_2 {

	public static void main(String[] args) throws Exception {
		Account account = new Account();
		Deposit deposit = new Deposit(account);
		Withdraw withdraw = new Withdraw(account);
		deposit.start();
		withdraw.start();

	}

}

class Account {
	private int balance;
	public Account() {
	};

	public Account(int balance) {
		this.balance = balance;
	};

	synchronized public void deposit(int amount) {
		while (balance > 3000) {
			System.out.println("媽媽看到餘額有3000以上，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += amount;
		System.out.println("媽媽存了" + amount + " ，帳戶共有:" + balance);
		if (balance > 2000) {
			notify();
			System.out.println("雄大被老媽告知帳戶已經有錢!");
		}
	}

	synchronized public void withdraw(int amount) {

		while (balance < amount) {
			System.out.println("媽媽被雄大要求匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("雄大領了" + amount + " ，帳戶共有:" + balance);
		if (balance <= 2000) {
			notify();
			System.out.println("雄大看到餘額在2000以下，要求匯款");
		}
	}
	


	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

}

class Deposit extends Thread {
	Account account;

	public Deposit(Account account) {
		this.account = account;
		setPriority(10);
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			account.deposit(2000);

		}
	}
}

class Withdraw extends Thread {
	Account account;
	
	public Withdraw(Account account) {
		this.account = account;
		setPriority(10);
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			account.withdraw(1000);

		}
	}

}
class Breaker extends Thread {
	public Breaker() {
		setPriority(1);
	}
	public void run() {
		System.out.println("End");
	}
}