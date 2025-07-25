#include <stdio.h>

int main() {
  printf("  F |      C\n");
  printf("--------------\n");
  for (int f = 0; f <= 300; f += 10) {
    printf("%3d | %6.1f\n", f, (5.0 / 9.0) * (f - 32));
  }
}
