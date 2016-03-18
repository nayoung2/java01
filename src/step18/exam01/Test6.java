package step18.exam01;
public class Test6 {
  public static void main(String[] args) {
    Bucket6<String> p = new Bucket6<>();
    Bucket6<Float> p2 = new Bucket6<>();
    Bucket6<Integer> p3 = new Bucket6<>();
    Bucket6<java.util.Date> p4 = new Bucket6<>();

    p.value = new String("okok");
    p3.value = new Integer(20);
    p2.value = new Float(3.14f);
    p4.value = new java.util.Date();

  }

}



/*
# 요구사항
- 이번 프로젝트는 Bucket에 Float 인스턴스만 저장하기로 했다.
- 물론, 개발자의 실수를 방지하도록 문법적으로 막아야 한다.
- 해결책?
  =>

- 질문:
  => 만약 나중에 내가 임의적으로 만든 클래스의 인스턴스를 저장하려 한다면,
    또 새로운 버킷을 생성해야 하나요?
  => 만약 생성해야 한다면 도대체 얼마나 많은 버킷을 만들어야 하나요?

  답변:
  => 예
  => 아주 많이!

  대안책 ?떄안챾?
  => 한 개의 클래스로 다양한 타입에 대응할 수 있는 문법이 필요!
  => "gENERIC"  뜽짱!!!!!!!!!!!

- 설명
  => 소프트웨어의 규모는 점점 커지고 있다.
  => 뗴딴위의 싸람뜰이 한계 깥은 쏘쓰를 편찌ㅃ하는 꼉우까 많따.
  => 문뻐ㅃ을 쪠떄로 싸용하는 찌 깜씨하끼까 쩜쩜 떠 힘뜰어 찐따.
  => 까능한 꺠빨짜의 씰쑤를 최떄한 맊을 쑤 잇는 문뻐ㅃ이 필요하따.



*/
