
class Program24
{
	public static void main(String[] args) {
		

		int iCnt=2;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{

				if(j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(iCnt++);
				}
			}	

			System.out.println();
		}

		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=1;j--)
			{
				if(j<i)
				{
					System.out.print(" ");
				}
				else{
					System.out.print(--iCnt);
				}
			}
			System.out.println();
		}

	}
}