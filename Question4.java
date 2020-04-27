import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter the base of triangle: ");
    int base = reader.nextInt();
    int line = base;
    String star = "*";
    for(int i = base; i>0;i--){
      for (int j = line; j>0;j--){
        System.out.print(star);
      }
      line--;
      System.out.println();

    }

    
  }
}
