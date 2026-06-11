class Day1 
{
 public static void main(String args[]) 
  { 
   Scanner sc=new Scanner(System.in);
   int Q = sc.nextInt();
   int arr[][] =new int[Q][3];
   for(int i=0;i<Q;i++)
   {
     for(int j=0;j<3;j++)
      {
       arr [i][j]=sc.nextInt();
       System.out.print(" ");
      }
     System.out.println();
   }
     //for(int i=0;i<=10;i++){System.out.println(N+" *  "+ i+" = "+(N*i));}
   
   for(int i=0;i<Q;i++)
    {
      for(int j=0;j<arr[i][2];i++)
       {
         System.out.print(arr[i][0]+((math.pow(arr[i][1],j)).b));
         System.out.print(" ");
       } 
      System.out.println();
    }
  }
}
