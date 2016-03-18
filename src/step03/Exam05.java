/* 주제 : char[] 배열을 이용하여 String 물건 만들기 */

package step03;

public class Exam05 {
  public static void main(String[]args) {
    char[] c = {'H', 'e', 'l', 'l', 'o'};
    // new String(c); String 물건을 만들었는데 주소가 없으면 쓸모가 없음... 주소
    String s = new String(c); // (char 배열(의 주소)를 받는 생성자)
    // 1) new String(c) : c 배열의 값을 가지고 String 물건을 만든다.
    // 2) 물건의 주소를 그 자리에 둔다.
    // 3) 물건의 주소를 s 메모리에 저장한다.
    System.out.println(s);
    //println(String 물건의 주소) : 물건이 있는 주소로 찾아가서 String 물건의 내용을 출력한다.


    int i = 10;
    System.out.println(i);
    // println(값) : 값을 출력한다.
// 즉 println이 알아서 값이 넘어오면 그대로 값을 출력하고, 물건의 주소가 넘어오면 물건이 있는 주소로 찾아가 그 내용을 출력한다.


    }
  }

/*


*/
