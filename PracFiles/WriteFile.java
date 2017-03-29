import java.io.*;

//copies characters from keyboard input into file

public class WriteFile {
    public static void main(String[] args) throws IOException {

        Reader inputStream = null;
        FileWriter outputStream = null;
		
		try{
			inputStream = new InputStreamReader(System.in);
		
			outputStream = new FileWriter("characteroutput.txt");

			int c;
			while ((c = inputStream.read()) != -1) 
               outputStream.write(c);
			}
		finally {
            if (inputStream != null) 
                inputStream.close();
            if (outputStream != null) 
                outputStream.close();
            }
    }
}
