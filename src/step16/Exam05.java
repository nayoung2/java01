// 주제 : hashCode() 오버라이딩
package step16;

public class Exam05 /*extends Object*/ {
  int age;
  int weight;

  public Exam05(int age, int weight) {
    this.age = age;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "오호라..하하하";
  }

  @Override
  public boolean equals(Object other) { // Object 및 Object의 자식클래스의 인스턴스가 올 수있다.
    if (other == null || !(other instanceof Exam05))  // other의 인스턴스가 Exam04
      return false;
    Exam05 obj = (Exam05)other;

    if (this.age != obj.age)
    return false;

    if(this.weight != obj.weight)
    return false;

    return true;

  }

  @Override
  public int hashCode() {
    StringBuffer buf = new StringBuffer();
    buf.append(Integer.toString(age));  //String은 같은 값에 대해 같은 해시코드를 갖기 때문에 내가 가진 int 값을 String으로 바꿔서
    buf.append(","); //age 18-weight 80과 age 1 - weight 880 구분해주려고
    buf.append(Integer.toString(weight));

    String str = buf.toString();
    int value = str.hashCode();
    return value;
    //return buf.toString().hashCode();   // buf.toString의 리턴 값(buf를 toString한 값) (= String 인스턴스)에 대해 .hashCode() 한 리턴값(= int값)
  }

  public static void main(String[] args) {


    String s = new String("Hello");
    String s2 = new String("Hello");
    System.out.println(s == s2);
    System.out.println(s.equals(s2));
    System.out.printf("%d --- %d\n", s.hashCode(), s2.hashCode());
    System.out.println("--------------------------");


    Exam05 p = new Exam05(18,90);
    Exam05 p2 = new Exam05(18,90);
    System.out.println(p == p2);
    System.out.println(p.equals(p2));
    System.out.printf("%d --- %d\n", p.hashCode(), p2.hashCode());

  }
}


/*
hashCode() 재정의 하는 이유?
- 같은 값을 갖는 인스턴스에 대해 같은 해시코드를 리턴하게 함으로써
  인스턴스 비교를 더 쉽게 만든다



*/
