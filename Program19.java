

class Program19
{
	public static void main(String[] args) {
		
		int iCnt=1;

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
	}
}