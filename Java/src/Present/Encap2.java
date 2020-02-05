package Present;

public class Encap2 {

	
	private int fact=1;
	
	public int fact(int i)
	{
		if(i==1)
		{
			return 1;
			
		}
		else 
		{
			return i*fact(i-1);
		}
	}
	
	public static void main(String[] args) {

	
		Encap2 e=new Encap2();
		 
	int x=e.fact(5);
		
		System.out.println("factorial of give no is : "+ x);

	}

}
