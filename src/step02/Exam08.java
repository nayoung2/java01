/* 주제 : 2차원 배열 */

package step02;

public class Exam08{
  public static void main(String[]args){
/*
int[][] scores = {   //2차원일 경우 배열을 2개 찍는다
  {100, 90, 90},
  {90, 90, 90},
  {80, 100, 100},
  {80, 80, 70}
};
*/

  int[][] scores = {   //2차원일 경우 배열을 2개 찍는다
    {100, 90, 90, 100, 70},
    {90, 90, 90},
    {80, 100},
    {80, 80, 70, 60}
  };  //배열 안에 배열을 나열할 뿐이기 때문에 안의 각 배열의 size가 고정된 것이 X
/*
System.out.print(scores[0][0]);
System.out.print(scores[0][1]);
System.out.print(scores[0][2]);
*/

System.out.printf("%d %d %d\n", scores[0][0], scores[0][1], scores[0][2]);



// printf : 출력의 형식을 정해놓고 출력 ( 출력의 형식 : "%d %d %d\n" ) f : format
//%d - 10진수로 출력


  }
}
