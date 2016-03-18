
package step10;

// 패키지 직속 클래스는 static을 붙이지 않는다.
 class Score2 {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int sum;
    private float aver;

    Score2(String name, int kor, int eng, int math) { //생성자는 클래스 이름과 같아야 한다.
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
    // 겟터 연산자(겟터 메서드) --> 값을 꺼내주는 연산자
    String getName() {
      return this.name;
    }
    int getKor() {
      return this.kor;
    }
    int getEng() {
      return this.eng;
    }
    int getMath() {
      return this.math;
    }
    int getSummary() {
      return this.sum;
    }
    float getAverage() {
      return this.aver;
    }

  }
