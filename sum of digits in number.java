//implement java programe to print sum of digits in a number
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,r;
        for(int i=0;i<=n;i++)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
