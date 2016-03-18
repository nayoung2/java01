/* 주제 : String 주요 도구 사용법5 */

package step03;

public class Exam11 {
  public static void main(String[]args) {
  String str = "이제 잠이 오지 않습니다 커피가 짱입니다.";

  boolean b = str.startsWith("이제"); //특정 문자열로 시작하는 지 여부 판별
  System.out.println(b);

  b = str.endsWith("입니다"); // 값 X(물건 X), "입니다" String 문자열의 주소를 주고받음 ( . 가 빠져서 false)
  System.out.println(b);

  b = str.contains("커피"); // 문자열 안에 "커피"란 문자열을 포함하고 있는지 판별
  System.out.println(b);    //str이라는 객체 안의 contains라는 메서드에 "커피"의 주소값을 넘기면 contains가 그 주소로 가 "커피"라는 것을 알아낸 후 문자열에서 커피를 찾음"

  String[] arr = str.split(" ");
  // 공백으로 쪼갠 문자열을 배열로 만들어 그 배열의 주소를 리턴.
  // => new String[]{"이제", "잠이", "오지", "않습니다", "커피가", "짱입니다."}
  // 물건(object)를 주고 받을 수는 없다. => 주소를 주고 받을 뿐이다.
  // 오직 primitive type (byte,short,int,long,float,double,boolean,char)만
  //값을 주고받을 수 있다.
  // (primitive type을 제외한 나머지 (String, 배열 등..)은 물건) 저낭

System.out.println(arr.length);
System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);
System.out.println(arr[3]);
System.out.println(arr[4]);
System.out.println(arr[5]);

    }
  }


/*














*/
