package inputoupt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterProblem {

	public static void main(String[] args) {
		
		int i=0;
		// TODO Auto-generated method stub
   try {
	   
	   FileWriter fw=new FileWriter("D:\\\\demo.txt");
	   fw.write("Hello everyone!!! What's uopp??");
	   fw.close();
	   
	FileReader fr=new FileReader("D:\\demo.txt");
	
while((i=fr.read())!=-1)
{
	System.out.println((char)i);
}
fr.close();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
	}

}
