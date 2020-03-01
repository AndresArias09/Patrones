package bridge;
import java.util.*;

public class Client {
  public static void main(String[] args) {
    //Create an appropriate implementer object
	  
	
    MessageLogger flogger = new FileLogger();
    MessageLogger clogger = new ConsoleLogger();

    //Choose required interface object and
    // configure it with the implementer object
   
    Message msg = new EncryptedMessage(flogger);

    msg.log("Test Message");
    
    msg = new TextMessage(flogger);

    msg.log("Test Message");

  }
}
