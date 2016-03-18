
package step10;

// 패키지 직속 클래스는 static을 붙이지 않는다.
 class Score {
   // 점수를 저장할 변수에 접근 레벨을 조정한다.
   // 외부 접근에 대해 격리 레벨을 높힌다.
   // name은 직접 접근해도 실행에 문제가 없지만,
   // 일관성있는 접근 레벨 제어를 위해 다른 변수와 접근 레벨을 맞춘다.
   // => name을 private으로 만들면 name또한 getter를 만들어야 한다.
    private String name;
    private int kor = 50;
    private int eng = 50;
    private int math = 50;
    private int sum = 0;
    private float aver = 50f;

    Score(String name, int kor, int eng, int math) { //this 변수가 숨어있다. , default
      this.name = name; // Heap에있는 (this 주소값의) 인스턴스 변수로 찾아가서 파라미터로 받은 name값을 저장하라.
      this.kor = kor;
      this.eng = eng;
      this.math = math;
    }

    // 사용자 정의 연산자 추가하기
    void summary() {  // 국, 영, 수 합계를 계산하는 연산자
      this.sum = this.kor + this.eng + this. math;
    }
    void average() {
      this.aver = this.sum / 3f;
    }
  }
