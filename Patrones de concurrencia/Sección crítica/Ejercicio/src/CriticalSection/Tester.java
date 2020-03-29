package CriticalSection;

class Tester extends Thread{
	private String msg;
	
	public Tester(String msg) {
		this.msg = msg;
		start();
	}
	
	public void run() {
		FileLogger logger = FileLogger.getFileLogger();
		logger.log(msg);
	}
	
}