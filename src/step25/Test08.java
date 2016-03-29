// 주제 : Reflection API - 특정 메서드만 알아내기
package step25;

import java.lang.reflect.Method;

public class Test08 {
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
    
    public void setName(String firstName, String middleName, String lastName) {
      this.name = firstName + " " + middleName + " " + lastName;
    }

    @Override
    public String toString() {
      return "Member [name=" + name + "]";
    }
    
    //오른쪽 클릭 -> Source -> generate toString()    
    
    
  }
  public static void main(String[] args) throws Exception {
    
    Class<?> clazz = Class.forName("step25.Test08$Member"); 
    
    // 1) 인스턴스 생성
    Object obj = clazz.newInstance();
    
    // 2) setName() 메서드 찾기    
    Method m1 = clazz.getDeclaredMethod("setName", String.class); 
    
    // 3) 메서드 호출하기
    //=> 문법 : invoke(인스턴스, (메서드에 전달 할)값, 값, 값, ...)
    //=> 스태틱 메서드인 경우, 인스턴스는 null을 주면 된다.
    //=> 인스턴스 메서드인 경우, 반드시 인스턴스 주소를 줘야 한다.
    m1.invoke(obj, "홍길동");
            
    System.out.println(obj);
    
    m1 = clazz.getMethod("setName", String.class, String.class, String.class);
    
    m1.invoke(obj, "길동", "오호라", "홍");
    System.out.println(obj);
  
    }
  }



