//pgm that read from a line of integers and then display each integer and sum of all integers
//Fathima P Ajvad
//Roll no:27
import java.io.*;
class SumOfIntegers
{
   public static void main(String args[])
   {
     BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
     String line;
     int sum=0;
     
   try{
     System.out.println("Enter a line of integers separated by spaces:");
     line=reader.readLine();
     String[]numbers=line.split(" ");
     
    for(String number: numbers){
       int num=Integer.parseInt(number);
       System.out.println(num);
       sum+=num;
      }
      System.out.println("Sum of all integers:"+sum);
     }
    catch(IOException e){
      System.out.println("An error occured while reading input:"+e.getMessage());
      }
    catch(NumberFormatException e){
      System.out.println("Invalid input.Please enter valid integers.");
      }
   }
}
       
      
