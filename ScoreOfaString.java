import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       // System.out.println("Try programiz.pro");
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();//Accepts a string from user
       int res=0;
       for(int i=0;i<s.length()-1;i++)
       {
           int a=i;
           int b=i+1;
           char ch=s.charAt(a);//says the character at index i
           char bh=s.charAt(b);//says the character at index i+1
          int aa=s.charAt(a);
          int bb=s.charAt(b);
//here math.abs will convert the negativ values to positive value   i.e(2-3=-1 but math.abs will give the o/p as 1
          int ress=Math.abs(bb-aa);
         // System.out.println(ress); to know the difference of eachtime we use this print function....
          res=res+ress;
       }
       System.out.println(res);
    }
}
