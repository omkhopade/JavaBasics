package Present;

public class Abst {
	
final int i=6;

final public void display(int j)
{
	System.out.println("value of io is : "+i);
	System.out.println(j);
	
}
public static void main(String[] args) {

	Abst a=new Abst();
	a.display(87);
}

}

class Demo extends Abst
{
	
	{
		
	}
}



