/* Score5의 접근 레벨을 public으로 공개한다.*/
package step10;

 public class Score6 {

    private String name;
    private int kor;
    private int eng;
    private int math;
    private int sum;
    private float aver;


    public Score6(String name, int kor, int eng, int math) {
      this.name = name;
      this.setKor(kor);
      this.setEng(eng);
      this.setMath(math);
    }


    private void summary() {  // 국, 영, 수 합계를 계산하는 연산자
      this.sum = this.kor + this.eng + this. math;
      this.average(); //sumary가 호출되면 평균도 자동으로 구하도록.
    }
    private void average() {
      this.aver = this.sum / 3f;
    }

    public String getName() {
      return this.name;
    }

    public void setName(String name) {  // 값을 저장하는것. return값 필요하지X, void
      this.name = name;
    }

    public int getKor() {
      return this.kor;
    }

    public void setKor(int kor) {
      if (kor >= 0 && kor <= 100) { // 유효값 여부를 검사할 수 있다.
        this.kor = kor;
        this.summary();
      }
    }

    public int getEng() {
      return this.eng;
    }

    public void setEng(int eng) {
      this.eng = eng;
      if (eng >= 0 && eng <= 100) {
        this.eng = eng;
        this.summary();
      }
    }

    public int getMath() {
      return this.math;
    }

    public void setMath(int math) {
      this.math = math;
      if (math >= 0 && math <= 100) {
        this.math = math;
        this.summary();
      }
    }

    public int getSummary() {
      return this.sum;        //sum 이나 aver는 임의로 값을 바꾸거나 하면 안되기 때문에 셋터를 만들어주지 않는당
    }


    public float getAverage() {
      return this.aver;
    }

  }
