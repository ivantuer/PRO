package Inp;

import static java.lang.Math.random;
import java.util.Scanner;

public class Input {
  public static void RandomArr(int array[][], int m, int n) {
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        array[i][j] = (int) ((random() * 1000) % 50);
      }
    }
  }

  public static void SortedArr(int array[][], int m, int n) {
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        array[i][j] = 10 * i + j;
      }
    }
  }

  public static void UsersArr(int array[][], int m, int n) {
    System.out.println("Enter " + m * n + " elements in array\n");
    Scanner scan = new Scanner(System.in);
    int temp;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        String nextIntString = scan.nextLine();
        boolean numeric = true;
        try {
          Integer num = Integer.parseInt(nextIntString);
        } catch (NumberFormatException e) {
          numeric = false;
        }
        if (numeric) {
          temp = Integer.parseInt(nextIntString);
          array[i][j] = temp;
        } else {
          System.out.println("You entered wrong number\n");
          if (j != 0) {
            j--;
          } else if (i != 0 && j == 0)
            i--;
          j = n - 2;
        }
      }
    }
    scan.close();
  }
}
