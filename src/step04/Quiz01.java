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
//class - 새로운 데이터타입을 정의할 때, 기능들을 분류할 때 사용된다.
//refactoring 재사용성이 좋게끔 코드를 개선하는 활동 (더 객체지향적으로)
package step04;

public class Quiz01 {
  public static void main(String[] args) {

    //장르 마스크
    int cri = 0x800;
    int dra = 0x400;
    int co = 0x200;
    int ro = 0x100;
    int s = 0x080;
    int fm = 0x040;
    int f = 0x020;
    int ac = 0x010;
    int sf = 0x008;
    int ani = 0x004;
    int dc = 0x002;
    int ho = 0x001;

    //개인들의 정보
    String[] name = new String[]{"홍길동","정수정","최진리"};
    int[] fav = new int[]{(dra | ac | sf | dc),(cri | ro | f),0x201};

    //개인들이 좋아하는 장르 출력
    for(int i=0; i<fav.length; i++) {

    System.out.printf("%s님은 ", name[i]);
    if((fav[i]&cri)==cri)
    System.out.printf("범죄 ");

    if((fav[i]&dra)==dra)
    System.out.printf("드라마 ");;

    if((fav[i]&co)==co)
    System.out.printf("코미디 ");

    if((fav[i]&ro)==ro)
    System.out.printf("로맨스 ");
    if((fav[i]&s)==s)
    System.out.printf("스릴러 ");
    if((fav[i]&fm)==fm)
    System.out.printf("가족 ");
    if((fav[i]&f)==f)
    System.out.printf("판타지 ");
    if((fav[i]&ac)==ac)
    System.out.printf("액션 ");
    if((fav[i]&sf)==sf)
    System.out.printf("SF ");
    if((fav[i]&ani)==ani)
    System.out.printf("애니메이션 ");
    if((fav[i]&dc)==dc)
    System.out.printf("다큐멘터리 ");
    if((fav[i]&ho)==ho)
    System.out.printf("공포 ");

    System.out.println("\b의 장르를 좋아합니다.");
}
    System.out.println("한비는 f(x)를 좋아합니다.");
  }


}
