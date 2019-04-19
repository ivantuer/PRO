import Out.Output;
import Inp.Input;
import Prog.Program;
import java.util.Scanner;

public class Lab2 {
  public static void main(String[] args) {
    final int n = 5;
    final int m = 5;
    int array[][] = new int[m][n];
    int temp;

    System.out.printf("1. Random Array\n2. Sorted Array\n3. Users Array\nChoose a mode: ");
    Scanner scan = new Scanner(System.in);

    while (true) {
      String nextIntString = scan.nextLine();
      boolean numeric = true;
      try {
        Integer num = Integer.parseInt(nextIntString);
      } catch (NumberFormatException e) {
        numeric = false;
      }
      if (numeric) {
        temp = Integer.parseInt(nextIntString);
      } else {
        temp = 5;
      }
      switch (temp) {
      case 1:
        System.out.println("Test: random array");
        Input.RandomArr(array, m, n);
        Output.OutputArray(array, m, n);
        Program.ChangeMinMax(array, m, n);
        Output.OutputArray(array, m, n);
        System.out.printf("1. Random Array\n2. Sorted Array\n3. Users Array\nChoose a mode: ");
        break;
      case 2:
        System.out.println("Test: sorted array");
        Input.SortedArr(array, m, n);
        Output.OutputArray(array, m, n);
        Program.ChangeMinMax(array, m, n);
        Output.OutputArray(array, m, n);
        System.out.printf("1. Random Array\n2. Sorted Array\n3. Users Array\nChoose a mode: ");
        break;
      case 3:
        System.out.println("Test: users array");
        Input.UsersArr(array, m, n);
        Output.OutputArray(array, m, n);
        Program.ChangeMinMax(array, m, n);
        Output.OutputArray(array, m, n);
        System.out.printf("1. Random Array\n2. Sorted Array\n3. Users Array\nChoose a mode: ");
        break;
      case 0:
        return;
      default:
        System.out.printf("Input correct number! \n1. Random Array\n2. Sorted Array\n3. Users Array\nChoose a mode: ");
        break;
      }
    }
  }
}