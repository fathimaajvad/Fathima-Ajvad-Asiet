//pgm that implements a multi-threaded program which has three threads
//Fathima P Ajvad
//Roll no:27
import java.util.*;
class Thread1 implements Runnable
{
   public void run()
   {
     int a=1;
     while(a==1)
     {
       int n=(int)(Math.random()*100);
       synchronized(System.out)
       {
         System.out.println("The generated number is"+n);
       }
       if(n%2==0)
       {
         Thread2 even=new Thread2(n);
         Thread evenThread=new Thread(even);
         evenThread.start();
       }
       else
       {
         Thread3 odd=new Thread3(n);
         Thread oddThread=new Thread(odd);
         oddThread.start();
       }
       try
       {
         Thread.sleep(1000);
       }
       catch(InterruptedException e)
       {
         synchronized(System.out)
         {
           System.out.println(e);
         }
       }
     
     }
   }
}
class Thread2 implements Runnable
{
   private int number;
   
   Thread2(int n)
   {
     number=n;
   }
   public void run()
   {
     synchronized(System.out)
     {
        System.out.println("The square of the number is"+(number*number));
     }
   }
}
class Thread3 implements Runnable
{
   private int number;
   
   Thread3(int n)
   {
     number=n;
   }
   public void run()
   {
     synchronized(System.out)
     {
       System.out.println("The cube of the number is"+(number*number*number));
     }
   }
}
class multithread
{
   public static void main(String args[])
   {
     Thread1 t=new Thread1();
     Thread thread=new Thread(t);
     thread.start();
   }
}

OUTPUT

student@ml-27:~/27_fathima$ javac multithread.java
student@ml-27:~/27_fathima$ java multithread
The generated number is42
The square of the number is1764
The generated number is70
The square of the number is4900
The generated number is26
The square of the number is676
The generated number is82
The square of the number is6724
The generated number is81
The cube of the number is531441
The generated number is0
The square of the number is0
The generated number is32
The square of the number is1024
The generated number is84
The square of the number is7056
The generated number is5
The cube of the number is125
The generated number is49
The cube of the number is117649
