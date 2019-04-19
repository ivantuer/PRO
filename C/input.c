#include "typedef.h"

void randomArray(int **array)
{
  for (int i = 0; i < m; i++)
  {
    for (int j = 0; j < n; j++)
    {
      array[i][j] = rand() % 50;
    }
  }
}

void sortedArray(int **array)
{
  for (int i = 0; i < m; i++)
  {
    for (int j = 0; j < n; j++)
    {
      array[i][j] = i * 10 + j;
    }
  }
}

void usersArray(int **array)
{
  printf("Enter %d", m * n);
  printf(" elements in array\n");
  for (int i = 0; i < m; i++)
  {
    for (int j = 0; j < n; j++)
    {
      scanf("%d", &(array[i][j]));
    }
  }
}