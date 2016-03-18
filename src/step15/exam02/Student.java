package step15.exam02;

public class Student extends Member {
  boolean isWorking;

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.printf("재직여부: %s\n", (isWorking)?"예":"아니오"); // 조건연산자. () 안의 내용이 참이면 예를, 거짓이면 아니오를 출력
  }
}
