// 주제: Collection API - Queue
package step21;

import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedDeque;
// import jaca.util.*; 쓰지 않도록!

public class Exam08 {

  static void printList(ConcurrentLinkedDeque<String> list) {
    System.out.println("--------------------");
    String value = null;
    while((value = list.poll()) != null) {
      System.out.println(value);
    }
  }

  public static void main(String[] args) throws Exception { // Exception 오류 JVM에게 미뤄버린다....
    ConcurrentLinkedDeque<String> list = new ConcurrentLinkedDeque<>();
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
111
aaa
444
BBB
222
333
aab
aAc
*/
  }
}
