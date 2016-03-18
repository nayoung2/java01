package step12;

public class Car5 {
  // 자동차 마다 개별 정보를 저장할 변수

  private String model;
  private String maker;
  private int cc;
  private int capacity;

  public Car5() {}

  public Car5(String model, String maker, int cc, int capacity) {
    /* 이런 경우 셋터가 아닌 처음부터 생성자를 통해 들어가는 값은 유효한 값인지 검사가 불가능
    this.model = model;
    this.maker = maker;
    this.cc = cc;
    this.capacity = capacity;
    */
    this.setModel(model);
    this.setMaker(maker);
    this.setCc(cc);
    this.setCapacity(capacity);
  }

  public String getModel() {
    return this.model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  public String getMaker() {
    return this.maker;
  }
  public void setMaker(String maker) {
    this.maker = maker;
  }

  public int getCc() {
    return this.cc;
  }
  public void setCc(int cc) {
    if (cc > 0 && cc <= 10000) {
      this.cc = cc;
    }
  }

  public int getCapacity() {
    return this.capacity;
  }
  public void setCapacity(int capacity) {
    if (capacity > 0 && capacity <= 100) {
      this.capacity = capacity;
    }
  }

}
