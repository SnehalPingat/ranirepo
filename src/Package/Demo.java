package Package;

public class Demo
{
	static int x =0;
	static int y=0;
	
	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
			if((++x>2)&&(++y>2))
			{
				
				x++;
				System.out.println(x + ","+ y);
			}
		}
		System.out.println("Final x="+ x+","+ "y="+ y);
		
	}
}
