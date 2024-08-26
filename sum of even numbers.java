//Implement a program to calculate sum of even digits present in the given number. If number is less than 0, print "Invalid".
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int Number=s.nextInt();
        int  sum=0;
        while(Number>0)
        {
            
            
            int r=Number%10;
            if(r==0 ||r==2 ||r==4 ||r==6 || r==8 )
            {
           sum=sum+r;}
           Number=Number/10;
            }
        
              System.out.print(sum);
        }
      
    }
