/* 문제 :
 개인 좋아하는 영화 장르를 저장하고 출력하는 프로그램을 작성하라.
 => 각 장르의 선호 여부를 표현할 때 비트로 표현할 것.
 => 비트 연산자를 이용하여 검사할 것.
 => 참고 예제 : Exam06.java
 장르 :
 범죄, 드라마, 코미디, 로맨스,
 스릴러, 가족, 판타지, 액션,
 SF, 애니메이션, 다큐멘터리, 공포

=> 테스트 데이터 :
홍길동이 좋아하는 장르 - 드라마, 액션, SF, 다큐멘터리
*/

package step04;

public class Quiz01up {
  public static void main(String[] args) {

    int[] GENRE_MASK = {0x800, 0x400, 0x200, 0x100, 0x80, 0x40, 0x20, 0x10, 0x8, 0x4, 0x2, 0x1};
    //장르 마스크
    String[] genreTitle = { "범죄", "드라마", "코미디", "로맨스", "스릴러", "가족", "판타지", "액션", "SF", "애니메이션", "다큐멘터리", "공포"};
    //개인들의 정보
    String[] name = new String[]{"홍길동","정수정","최진리"};
    int[] fav = new int[]{0x41A,0x222,0x201};

    //개인들이 좋아하는 장르 출력
    for(int i=0; i<fav.length; i++) {
      System.out.printf("%s님은 ", name[i]);
      for (int a=0; a<genreTitle.length; a++) {
        if ((fav[a] | GENRE_MASK[a]) == GENRE_MASK[a])
        System.out.printf(genreTitle[a]);
      }
        System.out.println("의 장르를 좋아합니다.");


}

  }


}
