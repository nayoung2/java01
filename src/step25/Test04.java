// 주제 : Reflection API - 메서드 정보 추출하기
package step25;

import java.lang.reflect.Method;

public class Test04 {
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
    
    Class<?> clazz = Class.forName("step25.Test04$Member"); // <?> : 컴파일러에게 clazz에게 뭐가 들어가든 신경쓰지 말라고 얘기한다. (내가 알아서 한다!)
                                                                    // 아니면 경고를 띄운다.
    //메서드 정보 추출 
    Method[] methods = clazz.getDeclaredMethods();  // 해당 클래스의 메서드
    for (Method m : methods) {
      System.out.println(m.getName());
    }
  
  System.out.println("-------------------");
  methods = clazz.getMethods(); // 상속 받은 public 메서드도 포함 
  for (Method m : methods) {
    System.out.println(m.getName());
  }
  }
}


