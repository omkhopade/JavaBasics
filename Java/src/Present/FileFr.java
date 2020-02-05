package Present;
import java.io.*;


public final class FileFr {

	public static void main(String[] args) {

		String line;
		
		File f=new File("Test1.txt");
		
		try {
			FileReader fr=new FileReader(f);
			
			BufferedReader br=new BufferedReader(fr);
			
			
				while( (line=br.readLine())!=null)
				{

					System.out.println(line);
				}
		}
		
		 
			
		catch (FileNotFoundException e) {


			System.out.println("File not found exception");
		}
		
		catch (IOException e) {

			 System.out.println("IO Exception");
		}
		
			
		
			
		
		}
		

	}


