// 주제: Collection API - List vs Set memememememeememmeemmeememememeeeemem
package step21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.AbstractCollection;



public class Exam09 {

  static void printList(AbstractCollection/*HashSet과 ArrayList의 공통클래스*/<String> list) {
    System.out.println("--------------------");
    for(Object value : list.toArray()) { // ArrayList는 있지만 HashSet이 get() 메서드를 갖지 않기 때문에.
      System.out.println(value);
    }
    /*
    Object[] arr = list.toArray();
    for(int i = 0; i < arr.length; < i++) {
      System.out.println(arr[i]);
    }
    */
  }

  public static void main(String[] args) throws Exception {
    ArrayList<String> list = new ArrayList<>();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    list.add("홍길동");
    list.add("임꺽정");

    HashSet<String> set = new HashSet<>(); // 중복 제거, 해시코드의 순서대로 출력.
    // set.add(new String("홍길동"));
    set.add("홍길동");
    set.add("임꺽정");
    set.add("유관순");
    // set.add(new String("홍길동")); // 인스턴스가 달라도 그 내의 값이 같으면 튕겨낸다.
    set.add("홍길동");
    set.add("임꺽정");

    printList(list);
    printList(set);

  }
}


/*
# List
- 데이터 중복을 허용한다.
- 들어간 순서대로 꺼낼 수 있다.

# Set(집합)
- 데이터 중복을 허용하지 않는다.
- 저장할 때 인스턴스의 해시코드(hashcode())를 사용한다.
  => 꺼낼 때 저장한 순서대로 꺼내지지 않는다.
*/
