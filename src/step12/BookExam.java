package step12;

public class BookExam {
  public static void main(String[] args) {
    Book b1 = new Book("자바애플릿모음","978-89-315-4507-X ", {"함삐","두부","포미"});
    Book b2 = new Book("강아지와 말하기","234-22-572-AS1",
                      {"함삐","포미","두부","케미"}, "(주)개와고양이", 360, 53000,
                      "강아지와 대화하고 싶으신가요? 이 책을 읽어보세요!");
    System.out.printf("%s, %s, %s \n", b1.getTitle(), b1.getIsbn(), b1.getAuthors());
    System.out.printf("%s, %s, %s, %s, %d, %d, %s\n", b2.getTitle(), b2.getIsbn(), b2.getAuthors(), b2.getCompa(), b2.getPage(), b2.getPrice(), b2.getIntro());
  }

}
