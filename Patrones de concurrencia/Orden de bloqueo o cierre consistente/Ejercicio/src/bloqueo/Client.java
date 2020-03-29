package bloqueo;

public class Client {

	public static void main(String[] args) {
		Directory dir1 = new Directory("/home/user1/Destkop/Tests");
		Directory dir2 = new Directory("/home/user1/Destkop/Notes");
		Directory dir3 = new Directory("/home/user1/Destkop/Results");
		
		FileSysUtil_Rev fsutil = new FileSysUtil_Rev();
		fsutil.moveContents(dir1, dir3);
		fsutil.moveContents(dir2, dir3);


	}

}
