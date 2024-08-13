//pgm to reverse a string
//Fathima P Ajvad
//Roll no:27
import java.util.*;
class reverse
{
   public static void main(String args[])
   {
      String str,rev=" ";
      Scanner s1=new Scanner(System.in);
      System.out.println("enter the string");
      str=s1.nextLine();
      str=str.toLowerCase();
      int length=str.length();
      for(int i=length-1;i>=0;i--)
      {  
          rev=rev+str.charAt(i);
      }
      System.out.println("the reversed string is"+rev);
      s1.close();
   }
}
