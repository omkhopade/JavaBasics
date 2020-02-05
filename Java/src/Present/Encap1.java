package Present;

public class Encap1 {

	private int x; // Private member of class
	
	
	private void dispaly()  // Private method of class
	
	{
		System.out.println("value of x is :"+x);
	}
	public static void main(String[] args) {
		
		Encap1 e=new Encap1();
		
		
		e.x=68;
		
		e.dispaly();
	}
}
