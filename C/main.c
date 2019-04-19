#include "typedef.h"

int main()
{
  array = (int **)malloc(sizeof(int *) * m);
  for (int i = 0; i < m; i++)
  {
    array[i] = (int *)malloc(sizeof(int) * n);
  }

  int temp;
  while (1)
  {
    printf("1. Random Array\n2. Sorted Array\n3. Introduced Array\n0. Exit\nChoose a mode: ");
    scanf("%d", &temp);
    switch (temp)
    {
    case 1:
      printf("Test: random array\n");
      randomArray(array);
      output(array);

      changeMinMax(array);
      output(array);
      break;
    case 2:
      printf("Test: sorted array\n");
      sortedArray(array);
      output(array);
      changeMinMax(array);
      output(array);
      break;
    case 3:
      printf("Test: introduced array\n");
      usersArray(array);
      output(array);
      changeMinMax(array);
      output(array);
      break;
    case 0:
      return 0;
    default:
      printf("Input correct number\n");
    }
  }
}