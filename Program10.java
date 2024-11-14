


class Program10
{
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=1;j--)
			{
				if(i==4 || i==j)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}

			for(int m=2;m<=4;m++)
			{
				if(i==m || i==4)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}