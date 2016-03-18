//주졔 : 상속 관계에서 인스턴스 변수 초기화 순서와 생성자 호출 순서
// => 좀 더 쉬운 이해를 위해 인스턴스 블록을 제외시킴.

package step14.exam07;

public class Test {
public static void main(String[] args) {
  B p = new B();
  System.out.println(p.v1);
  System.out.println(p.v2);
  System.out.println(p.v3);
  System.out.println(p.v4);
  System.out.println(p.v5);
  }
}

/*

new B(); 에서 인스턴스 생성 절차
1) A 클래스의 인스턴스 메모리 준비
v1-[ null ]
v2-[  0  ]
v3-[false]

2) B 클래스의 인스턴스 메모리 준비

v1-[ null ]
v2-[  0   ]
v3-[ false]
v4-[  3.14f  ]
v5-[\u0000]

3) B 클래스의 생성자 실행
  => super() ---> 4) A 클래스의 생성자 실행 ** 주의! 수퍼 클래스의 생성자 먼저 실행하는 것이 아니라, B 클래스(자식 클래스)의 생성자의 첫 줄이 수퍼 생성자를 호출하는 코드이기 때문에 그렇게 보이는 것!
                      super() ---> 5) Object의 생성자 실행 (모든 클래스들의 수퍼 클래스)
                      6) A의 생성자를 실행       v1 - [유관순] v2 - [ 20 ]
  7) B의 생성자 실행   v1 - [김원봉] v2 - [ 20 ] v3 - [false] v4 - [ 3.14f ] v5 - [ '가'의 유니코드값 ]
8) B의 인스턴스 값 출력
System.out.println(p.v1);
System.out.println(p.v2);
System.out.println(p.v3);
System.out.println(p.v4);
System.out.println(p.v5);





*/
