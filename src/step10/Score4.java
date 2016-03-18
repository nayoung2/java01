/* Score2 클래스에 setter를 추가한다*/
package step10;

 class Score4 {

    private String name;
    private int kor;
    private int eng;
    private int math;
    private int sum;
    private float aver;

    Score4(String name, int kor, int eng, int math) { //this 변수가 숨어있다.
      this.name = name; // Heap에있는 (this 주소값의) 인스턴스 변수로 찾아가서 파라미터로 받은 name값을 저장하라.
      this.setKor(kor);
      this.setEng(eng);
      this.setMath(math);
    }

    // 사용자 정의 연산자 추가하기
    void summary() {  // 국, 영, 수 합계를 계산하는 연산자
      this.sum = this.kor + this.eng + this. math;
      this.average(); //sumary가 호출되면 평균도 자동으로 구하도록.
    }
    void average() {
      this.aver = this.sum / 3f;
    }
    // 겟터 연산자(겟터 메서드) --> 값을 꺼내주는 연산자
    // 셋터 연산자도 추가한다. --> 값을 저장할 때 사용하는 연산자
    String getName() {
      return this.name;
    }

    void setName(String name) {  // 값을 저장하는것. return값 필요하지X, void
      this.name = name;
    }

    int getKor() {
      return this.kor;
    }

    void setKor(int kor) {
      if (kor >= 0 && kor <= 100) { // 유효값 여부를 검사할 수 있다.
        this.kor = kor;
        this.summary();
      }
    }

    int getEng() {
      return this.eng;
    }

    void setEng(int eng) {
      this.eng = eng;
      if (eng >= 0 && eng <= 100) {
        this.eng = eng;
        this.summary();
      }
    }

    int getMath() {
      return this.math;
    }

    void setMath(int math) {
      this.math = math;
      if (math >= 0 && math <= 100) {
        this.math = math;
        this.summary();
      }
    }

    int getSummary() {
      return this.sum;        //sum 이나 aver는 임의로 값을 바꾸거나 하면 안되기 때문에 셋터를 만들어주지 않는당
    }


    float getAverage() {
      return this.aver;
    }

  }
