package basics;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String x="hyderabad";
		String y="";
		for(int i=x.length()-1;i>=0;i--)
		{
			char z=x.charAt(i);
			y=y+z;
		}
		System.out.println(y);

	}

}
