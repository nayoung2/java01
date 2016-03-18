package quiz;
//copyright by codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
A round number 어림수,어림잡은 수 is informally 비공식적으로 considered to be an integer that ends with one or more zeros.
Find the smallest round number that is not less than a given value.
Example
nearestRoundNumber(122) = 130
[input] integer value
[output] integer
 */
 public class Test20 {
   public static void main(String[] args) {
    int value = 122;
    while (value % 10 != 0) {
      value++;
    }
    System.out.println(value);
      }
    }
