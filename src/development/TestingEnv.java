package development;

import Class.BA;

public class TestingEnv {

	public static void main(String[] args) throws Exception {
		BA ba = new BA(20);
		System.out.println(ba.getBalance());
		System.out.println("expected 20.0");
		ba.deposit(5);
		System.out.println(ba.getBalance());
		System.out.println("expected 25.0");
		ba.withdraw(5);
		System.out.println(ba.getBalance());
		System.out.println("expected 20.0");
	}

}
