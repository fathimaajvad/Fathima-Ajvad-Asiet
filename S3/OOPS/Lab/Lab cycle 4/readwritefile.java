//java pgm to read from a file and write to file by handling file exceptions
//Fathima P Ajvad
//Roll no:27
import java.io.*;
class readwritefile
{
   public static void main(String args[])
   {
     String inputFilePath="input.txt";
     String outputFilePath="output.txt";
     try{
          File inputFile=new File(inputFilePath);
          if(!inputFile.exists())
          {
            FileWriter writer=new FileWriter(inputFile);
            writer.write("Hello,this is a sample text for file handling!");
            writer.close();
          }
          
          FileReader reader=new FileReader(inputFile);
          StringBuilder content=new StringBuilder();
          int character;
          
          while((character=reader.read())!=-1)
          {
            content.append((char)character);
          }
          reader.close();
           
          FileWriter writer=new FileWriter(outputFilePath);
          writer.write(content.toString());
          writer.close();
          
          System.out.println("File has been read and written successfully");
        }catch(IOException e)
        {
          System.out.println("An error occured:"+e.getMessage());
        }catch(Exception e)
        {
          System.out.println("An unexpected error occured:"+e.getMessage());
        }
     }
}

OUTPUT
student@ml-27:~/27_fathima$ javac readwritefile.java
student@ml-27:~/27_fathima$ java readwritefile
File has been read and written successfully
