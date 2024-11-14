


class Program15
{
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=1;j--)
			{
				if(j>i)
				{
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}

			for(int p=2;p<=4;p++)
			{
				if(p>i)
				{
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}

		for(int m=3;m>=1;m--)
		{
			for(int n=4;n>=1;n--)
			{
				if(n<=m)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}

			for(int q=1;q<=3;q++)
			{
				if(q>=m)
				{
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}