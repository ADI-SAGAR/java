/*Implement a program to calculate the free number of cups
the user gets for a specified number
of cups bought by the user. In this particular case, 
the user gets 1 cup free for every 6 cups bought. 
(Example: If the user buys 12 cups, he gets 2 cups 
free as per the Buy 6 Get 1 Free offer, and hence the output will be 12+2 = 14 cups).
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int cups=s.nextInt();
        if(cups>=1)
        {
            if(cups%6==0)
            {
                cups=cups+1;
                System.out.println(cups);
            }
        }

    }
}
