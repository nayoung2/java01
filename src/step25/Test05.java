// 주제 : Reflection API - 메서드 정보 추출하기2
package step25;

import java.lang.reflect.Method;

public class Test05 {
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
    
    protected void m1() {}
    
    void m2() {}
    
    private void m3() {}
    
  }
  public static void main(String[] args) throws Exception {
    
    Class<?> clazz = Class.forName("step25.Test05$Member"); 
    // 메서드 정보 추출 
    // => public, protected, (default), private 메서드 
    Method[] methods = clazz.getDeclaredMethods();  // 해당 클래스의 메서드
    for (Method m : methods) {
      System.out.println(m.getName());
    }
  
   System.out.println("-------------------");
   
   // => public 메서드들
   methods = clazz.getMethods(); // 상속 받은 public 메서드도 포함 
   for (Method m : methods) {
    System.out.println(m.getName());
    }
  }
}


