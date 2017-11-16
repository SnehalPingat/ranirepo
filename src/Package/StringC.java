package Package;

public class StringC
{
	public static void main(String[] args) 
	{
		
		String result="";
		System.out.println();
		String s1="test solutions test software";
		String[] s2= s1.split(" ");
		for(int i =0; i<s2.length; i++)
		{
			if(s2[i].startsWith("t"))
			{
				result=result+s2[i]+" ";
			}
		}
		System.out.println(result);
		
	}

}
