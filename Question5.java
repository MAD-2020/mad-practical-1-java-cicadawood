import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter the length of integer set that you are going to enter: ");
    int lengthOfArray = reader.nextInt();
  
    int[]intSet = new int[lengthOfArray];

    int modeValue = 0; int maxCount = 0;

    for(int i = 0; i<lengthOfArray; i++){
      System.out.print("Enter the integer: ");
      int integer = reader.nextInt();
      intSet[i]=integer;
    }

    for(int i = 0; i<lengthOfArray;i++){
      int count = 0;
      for (int j = 0; j<lengthOfArray;j++){
        if (intSet[j] == intSet[i]){
          count++;
        }
      }
      if(count>maxCount){
        maxCount = count;
        modeValue = intSet[i];
      }
    }
    
    System.out.print("The mode is "+modeValue); 

    
  }
}
