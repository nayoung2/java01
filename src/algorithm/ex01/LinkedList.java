//notebook
package algorithm.ex01;

public class LinkedList {
  Bucket start;
  Bucket end;
  int count = 0;

  public LinkedList() {
    start = new Bucket();
    end = start;

  }

  public LinkedList(Bucket start, Bucket end) {
    start = new Bucket();
    end = start;
    this.start = start;
    this.end = end;
  }

  public int size() {
    return count;
  }

  public void add(Object value) {
    end.value = value;
    Bucket newBucket = new Bucket();
    end.next = newBucket;
    end = newBucket;
    count++;

  }

  public void add(int index, Object value) {
    if(index == count) {
      add(value);
    }
    if(index < 0 || index > count) {
      return;
    }
    if(index == 0) {
      Bucket newBucket = new Bucket(value, start);
      start = newBucket;
      count++;
    }
    Bucket cursor = start;
    for (int i = 1; i < index; i++) {
      cursor = cursor.next;
    }
    Bucket newBucket = new Bucket(value, cursor.next);
    cursor.next = newBucket;
    count++;
  }

  public Object get(int index) {
    if(index < 0 || index >= count) {
      return null;
    }
    Bucket cursor = start;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }



 public Object remove(int index) {
   if(index < 0 || index >= count) {
     return null;
   }
   if(index == 0) {
     Object oldValue = start.value;
     start = start.next;
     count--;
     return oldValue;
   }
   Bucket cursor = start;
   for (int i = 1; i < index; i++) {
     cursor = cursor.next;
   }
   Object oldValue = cursor.next.value;
   cursor.next = cursor.next.next;
   count--;
   return oldValue;
 }


 public Object set (int index, Object value) {
   if(index < 0 || index >= count) {
     return null;
   }
   Bucket cursor = start;
   for (int i = 0; i < index; i++) {
     cursor = cursor.next;
   }
   Object deledvalue = cursor.value;
   cursor.value = value;

   return deledvalue;
 }


}
