//sample input=163...... sample outout=9
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            if(r%3==0)
            {
              sum=sum+r;  
            }
            n=n/10;
        }
        System.out.println(sum);
    }
}
