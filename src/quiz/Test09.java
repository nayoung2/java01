package quiz;

//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!

/*
Given first two elements of an arithmetic progression, find its n-th element. (arithmetic progression : 등차수열)
[input] integer element1
1st element of the arithmetic progression
[input] integer element2
2nd element of the arithmetic progression
[input] integer n
positive integer
[output] integer
n-th element of the arithmetic progression
 */
public class Test09 {
  public static void main(String[] args) {
    int element1 = 2;
    int element2 = 5;
    int n = 5;
    System.out.println(element1 + (element2 - element1)*(n-1));
  }
}
