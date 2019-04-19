#include "typedef.h"

void output(int **array)
{
  for (int i = 0; i < m; i++)
  {
    for (int j = 0; j < n; j++)
    {
      printf("%3d", array[i][j]);
    }
    printf("\n");
  }
}