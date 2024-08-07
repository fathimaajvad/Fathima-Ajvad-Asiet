import java.util.*;
import java.lang.*;
class palindrome
{
   public static void main(String args[])
   {
       String str,rev="";
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the string");
       str=sc.nextLine();
       int len=str.length();
       for(int i=len-1;i>=0;i--)
       {
          rev=rev+str.charAt(i);
       }
       if(str.equals(rev))
       {
       System.out.println(str+"is palindrome");
       }
       else
       {
       System.out.println(str+"is not palindrome");
       }
    sc.close();
    }
}
