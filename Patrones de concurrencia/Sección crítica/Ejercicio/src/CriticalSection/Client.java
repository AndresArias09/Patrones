package CriticalSection;

public class Client {

	public static void main(String[] args) {
		Tester t1 = new Tester("Message from thread 1");
		Tester t2 = new Tester("Message from thread 2");
		Tester t3 = new Tester("Message from thread 3");
	}
	
}
