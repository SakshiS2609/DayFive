package inputoupt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//write a byte in a file
		String word="good morning";
		try {
			FileOutputStream fop=new FileOutputStream("D:\\demo.txt");
			fop.write(68);
			fop.write(65);
		
			byte bArr[]=word.getBytes();
			fop.write(bArr);
			fop.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		try {
			FileInputStream fip=new FileInputStream("D:\\demo.txt");
			
			
			/*  System.out.println(fip.read());
			int i=fip.read();
			System.out.println(i);
			System.out.println((char)i);  */
			
			int i=0;
			while((i=fip.read())!=-1)
			{
				System.out.println((char)i);
			}
			fip.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
