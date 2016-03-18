package quiz;

//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Determine whether the given string is a concatenation of another string
to itself.
Example
for 'tandemtandem' output should be true
for 'qqq' or '2w2ww' output should be false
[input] string inputString
[output] boolean
true if inputString represents a string concatenated to itself,
false otherwise
*/

public class Test16 {
  public static void main(String[] args) {

    String inputString = "abcdabcd";
    int len = inputString.length();
    int a = 0;
if (len % 2 == 1) {
  System.out.println("false");
  a = 1;
}
for (int i = 0; i < len/2; i++) {
  if (inputString.charAt(i) != inputString.charAt(i + len / 2)) {
    System.out.println("false");
    a = 1;
    break;
  }
}
if (a == 0) {
System.out.println("true");
}

   }
  }
