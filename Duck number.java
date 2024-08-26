//sample input=1903........sample output=yes
//duck number=if a number consiste of zero in it then it is said to be a duck number

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int r, n, num;
       int flag=0;
        Scanner sc = new Scanner(System.in);
       // System.out.print("Enter number=");
        n = sc.nextInt();
       // num = n;
        while (n > 0)
        {
            r = n % 10;
            if(r==0)
            {
                flag=1;
            }
            n=n/ 10;
        }
        if(flag==1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}
