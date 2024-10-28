//program to show the usage of try,catch and finally
//Fathima P Ajvad
//Roll no:27
import java.util.*;
class Exceptionhandlingexample
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    int numerator,denominator;
    
    try{
    System.out.println("Enter the numerator:");
    numerator=scanner.nextInt();
    System.out.println("Enter the denominator:");
    denominator=scanner.nextInt();
    
    int result=divide(numerator,denominator);
    System.out.println("Result:"+result);
    }
    catch(ArithmeticException e)
    {
      System.out.println("Caught an exception:"+e.getMessage());
    }
    catch(Exception e)
    {
      System.out.println("An unexpected error occurred:"+e.getMessage());
    }
    finally{
      System.out.println("This block is always executed.");
      scanner.close();
    }
   }
   
   static int divide(int a,int b)throws ArithmeticException
   {
      return a/b;
   }
}

