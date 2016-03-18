// 주제: Collection API - ArratList2
package step21;

import java.util.ArrayList;
import java.util.Date;

public class Exam02 {
  public static void main(String[] args) {
    ArrayList<Object> list = new ArrayList<>();
    list.add("홍길동");
    list.add("임꺽정");
    list.add(new Integer(10));
    list.add(new Date());

    System.out.println(list.indexOf("임꺽정")); // OK
    // indexOf() 레퍼런스 주소가 아니라 내용을 비교한다.
    System.out.println(list.indexOf(new String("임꺽정")));  // OK 주소가 아니라 그 안의 내용을 비교

    System.out.println("홍길동" == new String("홍길동")); // 서로 다른 레퍼런스. => false
    System.out.println(list.contains(new String("홍길동"))); // 레퍼런스 주소가 다름에도 불구하고 내용이 같기때문에 정확히 찾아낸다.
                                                             // 내용이 같은지 비교

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("오호라");
    list2.add("우헤헤");

    list.addAll(list2);

    // for (레퍼런스 : 배열 또는 Collection 타입 객체) {}
    // => 이 방식은 배열 또는 컬렉션 전체를 반복한다. (도중에 멈출 수 없다.)
    for (Object element : list) { // ListArray는 Collection 타입 객체
      System.out.println(element);
    }
  }
}
