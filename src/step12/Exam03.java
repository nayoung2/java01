/* 주제: 인스턴스 변수에 접근 */
package step12;

public class Exam03 {
  int instanceValue = 1000; //new 라는 명령어를 만나야 생성됨

  public void instanceMethod() {
    this.instanceValue = 2000;
  }


  static {
    // 인스턴스 주소가 있어야만 접근할 수 있다.
    // instanceValue = 3000; // Error!

    // static 블록은 인스턴스를 생성하기도 전에 실행되기 때문에
    // 인스턴스 주소가 있을 턱이 없다.
    // =>this 변수가 존재하지도 않는다.
    //this.instanceValue = 3000; // Error!
  }

  // 스태틱 메서드는 인스턴스 주소 없이 호출할 수 있다. **
  // 만약 인스턴스 주소 없이 호출하면 어떡할건데?
  static void staticMethod() {
    // 그래서 스태틱 메서드는 this라는 변수가 없다
   // this.instanceValue = 4000; //오류!
  }

  public static void main(String[] args) {

    Exam03.staticMethod(); // ** class 이름으로 스태틱 메서드 호출 (인스턴스 주소 없이 호출 가능)
                          //=> 아직 인스턴스가 존재하지 않기 때문에 인스턴스 변수에 접근할 수 없다.
                          // 인스턴스가 존재할 때와 존재하지 않을 때를 따로 분리시켜서 매 번 작성하기 힘들기 때문에 아예 인스턴스 메서드랑 스태틱 메서드로 나눈 것 이다.
                          //(만약 매 번 분류한다면 스태틱 메서드 안에  if (this != null) { ... } else { ... } 와 같이 this가 존재할 때와 존재하지 않을 때를 구분해서 다른 동작을
                          // 하게 만들어주어야 하는데.. 이러면 짜기도 복잡하고 다른 개발자가 보기에도 힘들다.... )
                          //문법적으로 아예 스테틱 메서드에서는 인스턴스 변수에 접근할 수 없도록 막아놓았다..
                          // 그냥 자바 문법이 인스턴스에는 접근 못해! 접근하려면 인스턴스가 생성되어야만 쓸 수 있는 인스턴스메소드를 통해 접근해! 라고 정해져 있다..

    // 인스턴스 주소 없이는 인스턴스 변수에 접근할 수 없다.
    //instanceValue = 5000; // Error

    // 인스턴스 메서드는 인스턴스 주소 없이 호출할 수 없다.
    //Exam03.instanceMethod(); // 문법적으로 불가!

    Exam03 p = new Exam03();
    p.instanceValue = 6000; //OK
    p.instanceMethod();
    System.out.println(p.instanceValue);



  }
}


/*
인스턴스 변수 및 메서드에 접근
- 인스턴스 주소가 있어야만 가능하다.

자바 메서드의 종류
1) 인스턴스가 있어야만 작업이 가능한 명령어는
  => 인스턴스 메서드에 작성한다.
2) 인스턴스 없이 작업할 수 있는 명령어는
  => 스태틱 메서드에 작성한다.
















*/
