/* 게시물 데이터를 다룰 사용자 정의 데이터 타입을 선언하라!
  게시물 번호, 제목, 내용, 작성자, 조회수, 작성일(long)
*/
package step12;

public class Board {
  private static int count;
  private int no;
  private String title;
  private String contents;
  private String writer;
  private int views;
  private long createDate;

  {
    no = ++Board.count;
  }

  public Board() {}
  public Board(String title, String contents, String writer, int views) {
    setTitle(title);
    setContents(contents);
    setWriter(writer);
    setViews(views);
    this.createDate = System.currentTimeMillis();
    // System.currentTimeMillis()
    // => 1970년 1월 1일 0시 0분 0초부터 지금까지 흐른 시간을
    //    밀리초로 환산하여 리턴한다.
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

  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public int getViews() {
    return views;
  }

  public void setViews(int views) {
    this.views = views;
  }

  public long getCreateDate() {
    return createDate;
  }

  public void setCreateDate(long createDate) {
    this.createDate = createDate;
    // System.currentTimeMillis()
    // =>1970년 1월 1일 0시 0분 0초부터 지금까지 흐른 시간을
    // 밀리초로 환산하여 리턴한다.

  }

}
