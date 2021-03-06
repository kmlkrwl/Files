import java.io.*;
//program to read data from either the keyboard or from a file and find out the length of data read in bytes
//to read from the keyboard, run it with java FileLength
//to read from a file run it with java FileLength nameOfFile

public class FileLength {
    public static void main(String[] args) throws IOException {

        int count = 0;
		InputStream inStream = null; 
		String infoText = "This program reads data from either a file or \n" +
		"from the keyboard" + " and it displays the number of characters read";
		System.out.println(infoText);
		infoText = "To read from the keyboard type at command prompt: java FileLength\n" +
		"To read from a file 'nameOfFile' type at command prompt: java FileLength nameOfFile\n";
		System.out.println(infoText);
        try {
			if(args.length == 0)
				{
				System.out.print("Enter your text and when you finished press CTRL Z Enter twice: ");
				inStream = System.in;
				}
			else
				inStream = new FileInputStream(args[0]);
			
			while(inStream.read() != -1) {
				count++;
				if(count == 5) {
					System.out.println((char) inStream.read());
				}
				
			}
			
			System.out.print("File length: " + count + "bytes");
			}
		catch (IOException ex) { 
			System.out.print("File length error");
			}
		finally{
					inStream.close();
				}
		}
    }
