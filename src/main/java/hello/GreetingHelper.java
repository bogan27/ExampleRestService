package main.java.hello;

public class GreetingHelper {
  private String letter1;
  private String letter2;

  public GreetingHelper() {
    this.letter1 = "A";
    this.setLetter2("B");
  }

  /**
   * @return the letter1
   */
  public String getLetter1() {
    return letter1;
  }

  /**
   * @param letter1 the letter1 to set
   */
  public void setLetter1(String letter1) {
    this.letter1 = letter1;
  }

  /**
   * @return the letter2
   */
  public String getLetter2() {
    return letter2;
  }

  /**
   * @param letter2 the letter2 to set
   */
  public void setLetter2(String letter2) {
    this.letter2 = letter2;
  }

}
