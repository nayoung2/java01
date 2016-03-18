package quiz;

//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Reverse a given integer by rearranging its digits.
Example
numberReverse(123) = 321
numberReverse(120) = 21
[input] integer input
positive integer
[output] integer
 */
public class Test14 {
  public static void main(String[] args) {
    int input = 123;
    int reversed = 0;
while (input != 0) {
  reversed = reversed * 10 + input % 10;
  input /= 10;
}
    System.out.println(reversed);
   }
  }
