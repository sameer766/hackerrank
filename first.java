import java.util.Scanner;

public class first{

  public static void main(String []args){
    System.out.println("Program to get output after multiple reversal of array");
    System.out.println("Please specify the size of array");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==0)
    {
      System.out.println("You can't do this try again");
      System.exit(0);
    }
    int a[]=new int[n];
    System.out.println("Now Enter the values");
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("Now specify how much time you want to rotate array");
    int p=sc.nextInt();
    int r[][]=new int[p][2];
    System.out.println("Please enter the indexes at which you want to rotate array");
    for(int i=0;i<p;i++)
    {
      for(int j=0;j<2;j++)
      {
        r[i][j]=sc.nextInt();
      }

    }
    if(a.length==1)
    {
      System.out.println(a[0]);
      System.exit(0);
    }
    int source=0;
    int dest=0;
    for(int i=0;i<r.length;i++)
    {
      source=r[i][0];
      try
      {
      dest=r[i][1];
      }catch (Exception e)
      {
        System.out.println("You are putting wrong indexes try again");
        System.exit(0);
      }

      int temp=a[dest];


      for(int j=dest;j>0;j--)
      {

        a[j]=a[j-1];
      }
      a[0]=temp;

    }
    System.out.println("Final Rotated Array:");
    for(int k:a)
      System.out.print(k+" ");

  }
}