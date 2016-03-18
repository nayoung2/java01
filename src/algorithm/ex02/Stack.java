package algorithm.ex02;

public class Stack {
  Bucket top;
  int count = 0;

  public Stack() {
    top = new Bucket();
  }

  public Stack(Bucket top) {
    top = new Bucket();  
    this.top = top;
  }

  public int size() {
    return count;
  }

  public void push(Object value) {
    Bucket newBucket = new Bucket(value, top);
    top = newBucket;
    count++;
  }

  public Object pop() {
    if(count == 0) {
      return null;
    }
    Object ob = top.value;
    top = top.previous;
    count--;
    return ob;
  }
}
