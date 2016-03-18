//notebook
package algorithm.ex04;

public class LinkedList<T> {
  Bucket<T> start;
  Bucket<T> end;
  int count = 0;

  public LinkedList() {
    start = new Bucket();
    end = start;

  }

  public LinkedList(Bucket<T> start, Bucket<T> end) {
    start = new Bucket();
    end = start;
    this.start = start;
    this.end = end;
  }

  public int size() {
    return count;
  }

  public void add(T value) {
    end.value = value;
    Bucket<T> newBucket = new Bucket();
    end.next = newBucket;
    end = newBucket;
    count++;

  }

  public void add(int index, T value) {
    if(index == count) {
      add(value);
    }
    if(index < 0 || index > count) {
      return;
    }
    if(index == 0) {
      Bucket<T> newBucket = new Bucket(value, start);
      start = newBucket;
      count++;
    }
    Bucket<T> cursor = start;
    for (int i = 1; i < index; i++) {
      cursor = cursor.next;
    }
    Bucket<T> newBucket = new Bucket(value, cursor.next);
    cursor.next = newBucket;
    count++;
  }

  public T get(int index) {
    if(index < 0 || index >= count) {
      return null;
    }
    Bucket<T> cursor = start;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }



 public T remove(int index) {
   if(index < 0 || index >= count) {
     return null;
   }
   if(index == 0) {
     T oldValue = start.value;
     start = start.next;
     count--;
     return oldValue;
   }
   Bucket<T> cursor = start;
   for (int i = 1; i < index; i++) {
     cursor = cursor.next;
   }
   T oldValue = cursor.next.value;
   cursor.next = cursor.next.next;
   count--;
   return oldValue;
 }


 public T set (int index, T value) {
   if(index < 0 || index >= count) {
     return null;
   }
   Bucket<T> cursor = start;
   for (int i = 0; i < index; i++) {
     cursor = cursor.next;
   }
   T deledvalue = cursor.value;
   cursor.value = value;

   return deledvalue;
 }


}
