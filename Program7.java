
/*

	* * * * * *
	  * * * * * *
	    * * * * * *
	      * * * * * *
	        * * * * * *
	          * * * * * *
*/

class Program7
{
	public static void main(String[] args) {
		

		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{

				if(i>j)
				{
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}

			for(int m=1;m<=6;m++)
			{
				if(i>m)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}