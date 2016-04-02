package main.java.hello;

public class Greeting {

  private final long id;
  private final String content;
  private GreetingHelper anotherObject;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
    this.anotherObject = new GreetingHelper(); 
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  /**
   * @return the anotherObject
   */
  public GreetingHelper getAnotherObject() {
    return anotherObject;
  }

  /**
   * @param anotherObject the anotherObject to set
   */
  public void setAnotherObject(GreetingHelper anotherObject) {
    this.anotherObject = anotherObject;
  }
}
