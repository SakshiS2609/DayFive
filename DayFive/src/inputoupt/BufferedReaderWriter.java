package inputoupt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	   
	   FileWriter fw=new FileWriter("D:\\\\demo1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
	   bw.write("Java is amazing!!");
/*	FileReader fr=new FileReader("D:\\\\demo1.txt");
	BufferedReader br=new BufferedReader(fr);
	System.out.println(br.readLine());  */
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
   
	}

}
