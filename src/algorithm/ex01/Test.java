package algorithm.ex01;

public class Test {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("홍길동"); //index = 0
    list.add("임꺽정"); //index = 1
    list.add("유관순"); //index = 2
    list.add("안창호"); //index = 3
    list.add("김원봉"); //index = 4
    list.add("김구"); //index = 5

    System.out.println(list.get(3)); // 안창호
    System.out.println(list.size()); // 6개를 가진다 => 6
    System.out.println(list.set(4,"두부"));
    list.add(4,"포미");
    System.out.println("------------------");
    System.out.println(list.remove(0));
    System.out.println(list.remove(0));
    System.out.println("------------------");
    for(int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

  }
}
