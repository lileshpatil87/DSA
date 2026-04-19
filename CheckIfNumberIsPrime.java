class CheckIfNumberIsPrime{
	public static void main(String args[])
	{
		int n=18;
		if(n==2) 
		{
			System.out.println(n+" is Prime");
			return;
		}		
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is not Prime");
				return;
			}
		}
		System.out.println(n+" is Prime");
		return;
	}
}