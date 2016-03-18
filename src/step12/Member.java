/*
 회원 데이터를 다룰 사용자 정의 데이터 타입 선언하라!
 회원번호, 이름, 아이디, 암호, 전화, 이메일
*/
package step12;

public class Members {
  private int no;
  static int count;
  private String name;
  private String id;
  private String pw;
  private String phoneNb;
  private String email;
  {
    no = ++count
  }

  public Members() {}

  public Members(String id, String pw, String email) {
    this.id = id;
    this.pw = pw;
    this.email = email;
  }

  public Members(String name, String id, String pw, String phoneNb, String email) {

    setName(name);
    setId(id);
    setPw(pw);
    setPhoneNb(phoneNb);
    setEmail(email);

  }

  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getPw() {
    return pw;
  }
  public void setPw(String pw) {
    this.pw = pw;
  }

  public String getPhoneNb() {
    return phoneNb;
  }
  public void setPhoneNb(String phoneNb) {
    this.phoneNb = phoneNb;
  }

  public String getEmail() {
    return phoneNb;
  }
  public void setEmail(String email) {
    this.email = email;
  }




}
