package algorithm.ex03;

public class Queue2 {
  Bucket front;
  Bucket rear;
  int count = 0;

  public Queue2() {
    front = new Bucket();
    rear = front;
  }
  public Queue2(Bucket front, Bucket rear) {
    front = new Bucket();
    rear = front;
    this.front = front;
    this.rear = rear;
  }

  public int size() {
    return count;
  }

  public void put(Object value) {
    rear.value = value;
    Bucket newBucket = new Bucket();
    rear.next = newBucket;
    rear = newBucket;
    count++;
  }

  public Object poll() {
    if(count == 0) {
      return null;
    }
    Object output = front.value;
    front = front.next;
    count--;
    return output;

  }






}
