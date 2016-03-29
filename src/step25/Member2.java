package step25;

public class Member2 {
  
  String name;
  public static int count = 0;

  public Member2() {
    System.out.println("Member2()...");
  }

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }  
  
  protected void m1() {}
  
  void m2() {}
  
  private void m3() {}  

}
