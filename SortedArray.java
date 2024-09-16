//program to print the elemnets in ascending order
import java.util.*;
public class SortedArray{
    public static void main (String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<a.length;i++)
    {
        a[i]=sc.nextInt();
    }
   
    
    int temp=a[0];
    for(int i=0;i<a.length;i++)
    {
        for(int j=i+1;j<a.length;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    for(int i=0;i<a.length;i++)
    System.out.print(a[i]+" ");
    
    }
}
