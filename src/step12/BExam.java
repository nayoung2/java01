package step12;

public class BExam {
  public static void main(String[] args) {
    Board m1 = new Board("처음뵙겠습니다","안녕하세요 처음뵙겠습니다. 잘부탁드려요", "함삐", 2);
    Board m2 = new Board("오랜만이에요","안녕하세요 저 왔어요. 오랜만이에요", "함삐", 6);

    System.out.printf("%s, %s, %s, %d, %d\n", m1.getTitle(), m1.getContents(), m1.getWriter(), m1.getViews(), m1.getCreateDate());
    System.out.printf("%s, %s, %s, %d, %d\n", m2.getTitle(), m2.getContents(), m2.getWriter(), m2.getViews(), m2.getCreateDate());
  }


}
