package Present;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadF {

	public static void main(String[] args) {
		

		
		File f=new File("C:\\Users\\UE\\Desktop\\eq1.txt");
		
		try {
			Scanner sc=new Scanner(f);
			
	
			
			while (sc.hasNextLine())
			{
				
				
				String line=sc.nextLine();
				System.out.println(line);
			}
			
		}
		
		catch (FileNotFoundException e) {
			System.out.println("File not found exeption");
		}
		
		catch (InputMismatchException e)
		{
			System.out.println("Input given in program is wrong please select text file ");
		}
	}

}
