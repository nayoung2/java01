package step14.exam05;

public abstract class Car {
  String model;
  String maker;
  int cc;
  int capacity;

  public void printInfo() { // 인스턴스 메소드 => 인스턴스가 있어야 사용 가능. but Car는 인스턴스를 만들 수 없음 . 상속해줄 목적으로 만든 메소드....
    System.out.printf("모델: %s\n", model); // 로컬 변수와 헷갈릴 일이 없다면 this 생략 가능
    System.out.printf("제조사: %s\n", maker); // 로컬 변수와 헷갈릴 일이 없다면 this 생략 가능
    System.out.printf("cc: %s\n", cc); // 로컬 변수와 헷갈릴 일이 없다면 this 생략 가능
    System.out.printf("최대수용인원: %s\n", capacity); // 로컬 변수와 헷갈릴 일이 없다면 this 생략 가능

  }
}
