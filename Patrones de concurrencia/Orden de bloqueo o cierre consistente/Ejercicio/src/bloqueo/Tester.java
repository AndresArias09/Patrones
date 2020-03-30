package bloqueo;

class Tester extends Thread{
	
	Directory src;
	Directory dest;
	
	public Tester(Directory src,Directory dest) {
		this.src = src;
		this.dest = dest;
		start();
	}
	
	public void run() {
		FileSysUtil_Rev fsutil = new FileSysUtil_Rev();
		fsutil.moveContents(src, dest);
	}
	
}