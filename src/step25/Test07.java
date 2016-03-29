// 주제 : Reflection API - 특정 메서드만 알아내기
package step25;

import java.lang.reflect.Method;

public class Test07 {
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
    
  }
  public static void main(String[] args) throws Exception {
    
    Class<?> clazz = Class.forName("step25.Test07$Member"); 
    
    // Stirng 클래스 정보를 얻는 방법
    // 1) 임의의 string 객체를 만들어서
    // "okok".getClass();
    // 2) class 히든변수 사용
    // String.class
    // 3) Class.forName("java.lang.String")
    // 3가지 중 한 가지 이용
    
    // 메서드의 이름과 그 메서드의 파라미터 타입 정보를 주면
    // 클래스에서 해당 메서드 정보를 찾아서 리턴해준다.
    clazz.getDeclaredMethod("setName", String.class); // 메서드 이름은 setName이고 파라미터 값으로 String을 갖는 메서드를 찾아달라.
    // --> setName(String name) {}
    clazz.getDeclaredMethod("setName", String.class, String.class, String.class);
    // -->  public void setName(String firstName, String middleName, String lastName) {}
    
     // 다음과 같이 존재하지 않는 메서드를 찾으려고 한다면 예외가 발생한다!
    // clazz.getDeclaredMethod("setName", int.class); // int는 class가 아니라 원시 타입이지만 이렇게 타입정보를 가리킬 수 있따.. 그냥 암기ㅠㅠ...
    // --> void setName(int value) {}
        

    
    /*
     public void getDeclaredMethod(String methodName, Class<?>... paramTypes) {   //step06 - Exam06 ~ Exam08
          ...     
     }
     
     ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      Class<?>... paramTypes  => Class 객체를 받는다, 어떤 클래스를 받을지 모른다 --> <?>
       Class 객체를 만드는 방법..?
     Member m = new Member();
     Class c;
     1)
     c = m.getClass();
     2)
     c = Member.class;
     3)
     c = Class.forName("Member");
     
     
     
     */
    
    }
  }



