package Out;

public class Output {
  public static void OutputArray(int array[][], int m, int n) {
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.format("%3d", array[i][j]);
      }
      System.out.println();
    }
    System.out.println();
  }
}