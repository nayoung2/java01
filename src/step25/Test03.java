// 주제 : 클래스 정보를 통해서 인스턴스 생성하기
package step25;

public class Test03 {
  static class Member {
    String name;
    public static int count = 0;
    
    
    public Member() {
      System.out.println("Member()...");
    }

    public String getName() {
      return name;
    }


    public void setName(String name) {
      this.name = name;
    }  
    
  }
  public static void main(String[] args) throws Exception {
    // 1) 클래스 정보를 얻기
    Class clazz = Class.forName("step25.Test02$Member");    
    System.out.println(clazz.getName());
    
    // 2) 인스턴스 생성하기
    Member m = (Member)clazz.newInstance();
    
    
    
  }
}

// 이클립스는 저장하는 순간 JVM을 이용하여 자동으로 컴파일한당.