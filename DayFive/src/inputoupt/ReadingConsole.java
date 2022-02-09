package inputoupt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingConsole {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		try
		{
			
			Double salary;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);

salary=Double.parseDouble(br.readLine(););
System.out.println("Enterv salary"+salary);

	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
