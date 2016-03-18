// 주제 : hashCode() 오버라이딩
package step16;

public class Exam06 /*extends Object*/ {
  int age;
  int weight;

  public Exam06(int age, int weight) {
    this.age = age;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "[" + this.age + "," + this.weight + "]";  //문자열과 숫자를 더하면 숫자를 문자열로 변환해서 다른 문자열과 결합시킴
  }

  @Override
  public boolean equals(Object other) { // Object 및 Object의 자식클래스의 인스턴스가 올 수있다.
    if (other == null || !(other instanceof Exam06))  // other의 인스턴스가 Exam04
      return false;
    Exam06 obj = (Exam06)other;

    if (this.age != obj.age)
    return false;

    if(this.weight != obj.weight)
    return false;

    return true;

  }

  @Override
  public int hashCode() {
    StringBuffer buf = new StringBuffer();
    buf.append(Integer.toString(age));
    buf.append(",");
    buf.append(Integer.toString(weight));

    String str = buf.toString();
    int value = str.hashCode();
    return value;

  }

  public static void main(String[] args) {

    Exam06 p = new Exam06(18,90);
    //String v = p.toString(); // "[18,90]"
    //System.out.println(v); // println(String)  (String을 받는 println) => 파라미터로 넘어오는 문자열을 그대로 출력한다.
    System.out.println(p); // println(Exam06) ==> println(Object) (어떤 객체든 파라미터로 받을 수 있음 ) 메서드 호출 --> 파라미터로 넘어오는
                          // 객체에 대해 toString()메서드를 호출, 실행한 후 그 리턴 값을 출력한다.
    // System.out.println(p.toString()); // System.out.println(p);와 같다

    // 간단하게 p 객체(p가 가리키는 객체, p 레퍼런스가 가리키는 인스턴스)의
    // 내용을 확인한다.

//println에 문자열을 주면 문자열 그대로 출력, String이나 원시 타입이 아닌 클래스의 주소값을 주면 자체적으로 toString을 실행하고 출력
  }
}


/*
toString() 재정의 하는 이유?
- 간단하게 인스턴스의 값을 확인하고 싶을 때. (그 외에는 특별하게 toString()을 재정의 할 이유가 없다.)


*/
