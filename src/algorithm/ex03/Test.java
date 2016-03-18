package algorithm.ex03;

public class Test {
  public static void main(String[] args) {
    Queue2 queue = new Queue2();
    queue.put("홍길동"); //index = 0
    queue.put("임꺽정"); //index = 1
    queue.put("유관순"); //index = 2
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println("---------------------");
    queue.put("안창호"); //index = 3
    queue.put("김원봉"); //index = 4
    queue.put("김구"); //index = 5

    Object value = null;
    while ((value = queue.poll()) != null ) {
      System.out.println(value);
    }
  }
}
