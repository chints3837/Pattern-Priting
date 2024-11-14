/*
	3 3 3
	3 1 3
	3 2 3
	3 3 3
*/

class Program18
{
	public static void main(String[] args) {
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=2;j++)
			{
				if(i==0)
				{
					System.out.print("3");
				}
				else if(i==j)
				{
					System.out.print(i);
				}
				else{
					System.out.print("3");
				}
			}
			System.out.println();
		}
	}
}