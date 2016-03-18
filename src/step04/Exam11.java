/* 주제 : 전위/후위 연산자 수행원리 비교 */

package step04;

public class Exam11 {
  public static void main(String[] args) {

    int i = 10;
    int r1 = ++i + ++i + ++i;
    System.out.println(r1);
    // 1) i = 11 ---> r1 = 11 + ++i + ++i
    // 2) i = 12 ---> r1 = 11 + 12 + ++i
    // 3) i = 13 ---> r1 = 11 +12 +13
    // 4) i = 13 ---> r1 = 36

    i = 10;
    r1 = i++ + i++ + i++;
    System.out.println(r1);
    // 1) r1 = 10 + i++ + i++ ---> i = 11
    // 2) r1 = 10 + 11 + i++ ---> i = 12
    // 3) r1 = 10 + 11 + 12 ---> i - 13
    // 4) r1 = 33, i = 13

    i = 10;
    i = i++; // (할당 연산자를 기준으로 l-value = r-value  ===========>  l-value는 변수(메모리) r-value 변수, 값, 식(Expression))
              // 할당 연산자는 가장 마지막에! 오른쪽의 연산이 모두 끝난 후에...
    System.out.println(i);

    }
  }

/*






*/
