import java.util.Scanner;
public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int a=0;
		int count=0;
        System.out.println("enter size");
		a=obj.nextInt();
		int m=2*a+1;
		int n=2*a+2;
		int mid=(m+1)/2;
		for(int i=1;i<=m;i++)
		{
			count=0;
			for(int j=1;j<=n;j++)
			{
				count++;
				if((i==1)||(i==m)||(j==1)||(j==n))//frame begin
				{
					if((i==1)||(i==m))
					{
						if((j==1)||(j==n))
						{
							System.out.print("+");
						}
						else
						{
							System.out.print("-");
						}
					}
					else
					{
						if((j==1)||(j==n))
	                      {
							System.out.print("|");//frame left and right
	                      }
					}
				}//frame end
				else if (i<mid)//upper-half
				{
					if(count<=2)
					{
				 for(int k=mid;k>i;k--)
				 {
					System.out.print(" ");
				 }
				   System.out.print("/");
				   for(int l=1;l<=2*i-4;l++)
				   {
					   if(i%2==0)
					   {
						   System.out.print("=");
					   }
					   else
					   {
						   System.out.print("-");
					   }
				   }
				System.out.print("\\");
				   for(int k=mid;k>i;k--)
				   {
					   System.out.print(" ");
				   }
					}
				}//end of upper half
				else if(i>mid)//lower half
				{
					if(count<=2)
					{
					for(int k=mid;k<i;k++)
					{
						System.out.print(" ");
					}
					 System.out.print("\\");
					 for(int l=2*m-6;l>2*i-4;l--)
					 {
						 if(i%2==0)
						   {
							   System.out.print("=");
						   }
						   else
						   {
							   System.out.print("-");
						   } 
					 }
					 System.out.print("/");
					 for(int k=mid;k<i;k++)
						{
							System.out.print(" ");
						}
			        }
					}//end of lower half
				else if(i==mid)//middle part
				{
					if(j==2)
					{
						System.out.print("<");
					}
					else if(j==n-1)
					{
						System.out.print(">");
					}
					else
					{
						if(i%2==0)
						{
							System.out.print("=");
						}
						else
						{
							System.out.print("-");
						}
					}
				}//end
			}//end-of-j
			System.out.println();
		}//end

	}

}
