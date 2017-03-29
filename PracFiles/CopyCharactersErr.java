import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;

public class CopyCharactersErr {
    public static void main(String[] args) throws IOException{

        FileReader inputStream = null;
        FileWriter outputStream = null;

       try{
            inputStream = new FileReader("xanadu.txt");
            outputStream = new FileWriter("characteroutput.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
		}//end of try
		catch(IOException ioex){
			System.out.println("IO error");
			}
		finally{
			inputStream.close();
			outputStream.close();
			}
	
	
        
    }
}
