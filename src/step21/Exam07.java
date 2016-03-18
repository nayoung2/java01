// 주제: Collection API - Stack
package step21;

import java.util.Stack;
import java.util.EmptyStackException; //Stack의 pop() 메서드가 모든 데이터를 다 꺼낸 후 남은 데이터가 없으면 EmptyStackException를 던진다.
                                      // java AIP를 통해 확인가능.
// import jaca.util.*; 쓰지 않도록! 딱 봤을 때 어떤걸 사용했는지 알아보기 힘들다.

public class Exam07 {

  static void printList(Stack<String> list) {
    System.out.println("--------------------");
    while(true) {
      try{
      System.out.println(list.pop());
    } catch (EmptyStackException e) {
      break;
      }
    }
  }
  public static void main(String[] args) {

    Stack<String> list = new Stack<>();
    list.add("111");
    list.add("aaa");
    list.add("444");
    list.add("BBB");
    list.add("222");
    list.add("333");
    list.add("aab");
    list.add("aAc");

    printList(list);
/*
    aAc
    aab
    333
    222
    BBB
    444
    aaa
    111
*/

  }
}
