class Pattern_one
{
 public static void main(String args[])
  {
    int t=0;
    for(int i=1;i<=5;i++)
     {
        for(int k=t;k<5;k++)
          {
            System.out.print(" ");
          }
        for(int j=0;j<i;j++)
          {
            System.out.print(" "+i+" ");
          }
          t=t+1;
          System.out.println(" ");
     }
  }
}