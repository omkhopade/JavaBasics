package Present;



class A
{
	
	int a,b;
	A(int i, int j)
	{
		a=i;
		b=j;
		
	} 
	
	public void show() {
		System.out.println("value of i is : "+a +"and " +"value of j is : "+b );
	}
	
	
}



class Child extends A
{
	int k;
	
	Child (int a,int b,int r)
	{
		super(a,b);
		k=r;
		
	}
	public void show (String msg)
	{
		System.out.println(msg+k);
	}
	
	
	
}
public class Inherit {

	public static void main(String[] args) {
			
		Child c=new Child (5,6,7);
		
		c.show();
		c.show("value of k: ");
	
	
	}

}
