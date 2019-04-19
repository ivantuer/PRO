#include "typedef.h"

void changeMinMax(int **array)
{
	int tempMax = 0;
	int tempMin = array[0][n - 1];
	int imax = 0;
	int jmax = 0;
	int imin = 0;
	int jmin = 0;
	int j = 0;
	for (int i = 0; i < m; i++)
	{
		if (tempMax <= array[i][n - 1 - j])
		{
			tempMax = array[i][n - 1 - j];
			imax = i;
			jmax = n - 1 - j;
		}
		if (tempMin >= array[i][n - 1 - j])
		{
			tempMin = array[i][n - 1 - j];
			imin = i;
			jmin = n - 1 - j;
		}
		j++;
	}
	tempMax = array[imin][jmin];
	array[imin][jmin] = array[imax][jmax];
	array[imax][jmax] = tempMax;
}
