package Package;

public class PatternProg
{
	public static void main(String[] args)
	{
		int spaces = 0;
		int stars = 7;
		int spa = 2;
		int sta = 3;
		for(int i=0; i<=3; i++)
		{
			
			for(int n =0; n<spaces; n++)
			{
				System.out.print("  ");
			}
			for(int k=0; k<stars; k++)
			{
				System.out.print("* ");
			}
			spaces++;
			stars=stars-2;
			System.out.println();
			
		}
		for(int i=4; i<=6; i++){
		
		
				for(int n =0; n<spa; n++)
				{
					System.out.print("  ");
				}
				for(int k=0; k<sta; k++)
				{
					System.out.print("* ");
				}
				spa--;
				sta=sta+2;
				System.out.println();
		}
		
	}
}
