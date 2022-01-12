// This is the actual implementation of library code, usually you don't see this
// and instead link against it

#include "header.h"
#include "stdio.h"

unsigned resolve(Hello h, int i) {
  printf("Hello{%d,%f}", h.field1, h.field2);
  return i * i;
}
