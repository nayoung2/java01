#include <stdio.h>
#include <stdlib.h>


int main() {
  int* p = (int*)malloc(sizeof(int) * 3); // C언어는 운영체제의 비트에 따라 int의 size 다르다.
  p[0] = 10;
  *(p + 1) = 20;
  p[2] = 30;
  p[3] = 40;

  printf("%d, %d, %d\n", p[0], p[1], *(p + 2));

  free(p);

  p[2] = 100; /* 해제된 메모리(무효한 메모리)의 주소를 가리키는 포인터 변수를
                  dangling pointer 라 부른다. */

  p = (int*)200; /* C는 주소를 임의적으로 조작할 수 있다.(=> Java는 불가능)*/
  p[0] = 100; /* 무효한 메모리를 접근하면 오류 발생! */

  return 0;
}

// ~/workspace/java01/src/step08 $ gcc Exam09.c
// ~/workspace/java01/src/step08 $ ./a.out
