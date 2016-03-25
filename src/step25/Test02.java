// 주제 : 클래스 정보 알아내기 2
package step25;

public class Test02 {
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
    //1) 방법1 => 인스턴스를 통해서 Class 객체 얻기
    Member m = new Member();
    Class clazz1 = m.getClass();
    System.out.println(clazz1.getName());
    
    //2) 방법2 => 해당 클래스의 숨겨진 스태틱 변수 "class"를 사용하기
    // 모든 클래스는 숨겨진 스태틱 변수 "class"가 있다. (스태틱 -> 클래스명으로 호출가능)
    // 스태틱 변수 "class"는 해당 클래스의 정보를 가리킨다.
    Class clazz2 = Member.class; //<-- 파일 확장자 아니다!! (파일명 아님!!) Member의 클래스 정보를 담고있음..
    Member.count = 10; //<-- "class" 변수는 "count"와 같은 스태틱 변수이다.
    System.out.println(clazz2.getName());
    System.out.println(Member.class.getName());
    
    //3) 방법3 => 클래스의 이름을 사용하여 클래스 정보를 알아내기. (가장 많이 사용)
    Class clazz3 = Class.forName("step25.Test02$Member");    
    System.out.println(clazz3.getName());
  }
}

// 이클립스는 저장하는 순간 JVM을 이용하여 자동으로 컴파일한당.