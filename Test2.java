
class Test
{
	public static void main(String args[])
	{
		Integer i=new Integer(7);
		System.out.println(""+i);
		
		Integer j=new Integer("27");
		if(i>j)
		{
			System.out.println("Greater i"+i);
			
		}
		else
		{
			System.out.println("Greater j"+j);
		}
		
	}
}