// This is the definition a library author will usually expose separately in
// a header file

typedef struct Hello {
  int field1;
  float field2;
} Hello;

unsigned resolve(Hello h, int i);

#define MY_CONST_1 1
#define MY_CONST_2 0xdeadbeef
#define MY_CONST_3 0.025f
