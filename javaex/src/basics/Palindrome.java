package basics;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		int x=5647;
		int y=0;
		while(x>0)
		{
		int	d=x%10;
			y=y*10+d;
			x=x/10;
			
		}
		System.out.print(y);

	}

	

}
