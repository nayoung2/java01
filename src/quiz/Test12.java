package quiz;
//출처: codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Given a point and a circle, determine if the point lies strictly
inside the circle.
Example
isTheInsideTheCircle(0, 0, 0, 0, 1) = true
isTheInsideTheCircle(-1, -1, 0, 0, 1) = false
[input] integer xa
x coordinate of the given point
[input] integer ya
y coordinate of the given point
[input] integer xc
x coordinate of the center of the circle
[input] integer yc
y coordinate of the center of the circle
[input] integer rc
the radius of the circle
[output] boolean
true, if the point (xa, ya) lies inside the circle (xc, yc, rc), false otherwise
 */
public class Test12 {
  public static void main(String[] args) {
    int xa = 0;
    int ya = 0;
    int xc = 0;
    int yc = 0;
    int rc = 1;
    int dist = (xa - xc) * (xa - xc) + (ya - yc) * (ya - yc);
    rc *= rc;
    int a = 0;
    if (dist == rc) {
      System.out.println("true");
      a = 1;
    }
    if (a == 0) {
    System.out.println("false");
    }
   }
  }
