import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter your height: ");
    
    float height = reader.nextFloat();
    
    System.out.println("Enter your weight: ");
    float weight = reader.nextFloat();

    float bmi = weight / (height*height);
    
    System.out.println("Your height is "+ height + "m, weight is "+weight + "kg, and BMI calculated is "+ bmi +".");

  }
}
