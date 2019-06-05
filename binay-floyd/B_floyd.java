class B_floyd
{
public static void main(String args[])
 {   
     for(int i=1;i<=5;i++)
       {
         for(int j=0;j<i;j++)
           {
             if(i%2==0)
              {
               if(j%2==0)
                {
                 System.out.print(0 +"\t");  
                }
               else if(j%2!=0)
                {
                 System.out.print(1 +"\t");  
                }
              }
             else if(i%2!=0)
              {
               if(j%2==0)
                {
                 System.out.print(1 +"\t");  
                }
               else if(j%2!=0)
                {
                 System.out.print(0 +"\t");  
                }
              }  
           }
              System.out.print("\n");
       }
  }
}
         