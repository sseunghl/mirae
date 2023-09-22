package mirae.com;

public class a_13_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =10;
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=row;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 * for(int i=0;i<row;i++) { for(int j=0;j<i;j++) { System.out.print(" *"); }
		 * System.out.println(); }
		 */

		for(int i=0; i<row;i++) {
			for(int j=2*(row-1);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=0; i<row; i++) {
			for(int j=row-1;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int first=2;first<10;first++) {
			for(int second =2;second<=9;second++) {
				System.out.printf("%2d*%d=%2d", second,first,first*second);
			}
			System.out.println();
		}
		
		int first=2;
		while(first <=9)
		{
			int second=1;
			while(second<=9)
			{
				System.out.printf("%2d*%d=%2d", second,first,first*second);
				second++;
			}
			first++;
			System.out.println();
		}
	}

}
