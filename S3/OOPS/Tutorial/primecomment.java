//program to find prime numbers numbers
//Fathima P Ajvad
//Roll no:27
class primecomment
{
	public static void main(String args[])
	{   int num,count=0;
		 num=Integer.parseInt(args[0]);
		for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
		   {   
			    if(i%j==0)
                {
                    count++;
                }
           }
                    if(count==2)
                    {
                        System.out.println("the prime numbers upto input is"+i);
                    
                    }
                    count=0;
                
		
		  
		
		
		
}
}
}
