// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int n = 0;
    char symbol;
    System.out.println("Podaj n");

    n = myObj.nextInt();

    System.out.println("Podaj symbol");

    symbol = myObj.next().charAt(0);

    for (int i = 0; i < n; i++) {
      if (i == 0) {
        for (int j = 0; j < n; j++) {
          System.out.print(symbol);
        }
        System.out.println();
        continue;
      }
      if (i == n - 1) {
        for (int j = 0; j < n; j++) {
          System.out.print(symbol);
        }
        System.out.println();
        continue;
      }
      System.out.print(symbol);
      for (int j = 0; j < n - 2; j++) {
        System.out.print(" ");
      }
      System.out.println(symbol);
    }

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}