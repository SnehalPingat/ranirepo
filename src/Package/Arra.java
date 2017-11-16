package Package;

public class Arra 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,6,9,11};
		
			for(int i=0; i<arr.length-1; i++)
			{
				int diff=arr[i+1]-arr[i];
				if(diff!=1)
				{
					for(int k=1;k<diff;k++)
					{
						System.out.println(arr[i]+k);
					}
				}
				
			}
		
	}

}
