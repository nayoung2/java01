package step12;

public class Car { // 서로 다른 데이터 타입의 데이터들을 묶어 하나처럼 사용하는 방법. (배열은 같은 데이터타입들..)
  // 자동차 마다 개별 정보를 저장할 변수
  // => 1) 스태틱(new 없이 클래스가 로딩될 때 생성됨, 클래스가 생성될 때 클래스 당 하나의 값만 저장 가능. ex) 차의 모델명이 하나)
  // => 2) 인스턴스 (new라는 명령어를 통해 생성됨, 각자 다른 값을 저장)  2 가지 중 선택해서 사용.

  //static 사용 => 한 대의 자동차의 정보를 저장할 변수
  
  static String model;
  static String maker;
  static int cc;
  static int capacity;


}
