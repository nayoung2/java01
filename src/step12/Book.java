/*
  책 데이터를 다룰 사용자 정의 데이터 타입을 선언하라!
  책번호, ISBN, 제목, 저자들, 출판사, 총 페이지수, 가격, 소개

*/

package step12;

public class Book {
  private int no;
  private String title;
  private String isbn;
  private String[] authors;
  private String compa;
  private int page;
  private int price;
  private String intro;

  Book() {}

  Book(String title, String isbn, String[] authors) {
    this.title = title;
    this.isbn = isbn;
    this.authors = authors;
    }

  Book(String title, String isbn, String[] authors, String compa, int page, int price, String intro) {
    this.title = title;
    this.isbn = isbn;
    this.authors = authors;
    this.compa = compa;
    this.page = page;
    this.price = price;
    this.intro = intro;
  }

  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }

  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  public String getIsbn() {
    return isbn;
  }
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String[] getAuthors() {
    return authors;
  }
  public void setAuthors(String[] authors) {
    this.authors = authors;
  }

  public String getCompa() {
    return compa;
  }
  public void setCompa(String compa) {
    this.compa = compa;
  }

  public int getPage() {
    return page;
  }
  public void setPage(int page) {
    this.page = page;
  }

  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }

  public String getIntro() {
    return intro;
  }
  public void setIntro(String intro) {
    this.intro = intro;
  }


}
