// 주제 : equls() 오버라이딩
package step16;

public class Exam04 /*extends Object*/ {
  int age;
  int weight;

  public Exam04(int age, int weight) {
    this.age = age;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "오호라..하하하";
  }

  @Override
  public boolean equals(Object other) { // Object 및 Object의 자식클래스의 인스턴스가 올 수있다.
    if (other == null || !(other instanceof Exam04))  // other의 인스턴스가 Exam04
      return false;
    Exam04 obj = (Exam04)other;

    if (this.age != obj.age)
    return false;

    if(this.weight != obj.weight)
    return false;

    return true;

  }

  public static void main(String[] args) {

    Exam04 p = new Exam04(18,90);
    Exam04 p2 = new Exam04(18,90);

    System.out.println(p == p2); // 별도의 Heap에 만들어짐 -> 각자 다른 인스턴스 -> false
    System.out.println("-------------");
    System.out.println(p.equals(p2)); //false

  }
}




/* String.equls()
- 원래 Object로부터 상속받은 equals는 인스턴스가 같은 지를 비교한다.
- 그런데 String 클래스에서 이 메서드를 재정의 하였다.
  인스턴스가 같은 지 비교하는 대신 인스턴스의 내용이 같은지 비교한다.


  Exam03.equals()
- Object로부터 상속받은 메서드이기 때문에 인스턴스가 같은 지를 비교한다.
- String 클래스처럼 내용이 같은 지 비교하고 싶은가?
  => 그럼 오버라이딩 하라!
  => Exam04.java 참고



















*/
