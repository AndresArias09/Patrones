package cierre;
public class Item {

  private String name;
  private ReadWriteLock rwLock;
  private String status;


  public Item(String n) {
    name = n;
    rwLock = new ReadWriteLock();
    status = "N";
  }

  public void checkOut(String member) {
    rwLock.getWriteLock();
    status = "Y";
    FileLogger.getFileLogger().log(member +" has been issued a write lock-ChkOut");
    rwLock.done();
  }

  public String getStatus(String member) {
    rwLock.getReadLock();
    FileLogger.getFileLogger().log(member +" has been issued a read lock");
    rwLock.done();
    return status;
  }

  public void checkIn(String member) {
    rwLock.getWriteLock();
    status = "N";
    FileLogger.getFileLogger().log(member +" has been issued a write lock-ChkIn");
    rwLock.done();
  }
}
