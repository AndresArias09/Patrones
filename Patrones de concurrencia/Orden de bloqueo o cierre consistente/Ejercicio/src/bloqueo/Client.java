package bloqueo;

public class Client {

	public static void main(String[] args) {
		Directory dir1 = new Directory("/home/user1/Destkop/Tests");
		Directory dir2 = new Directory("/home/user1/Destkop/Notes");
		
		Tester t1 = new Tester(dir1, dir2);
		Tester t2 = new Tester(dir2, dir1);
	}

}
