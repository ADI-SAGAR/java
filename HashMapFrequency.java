//This program says about the frequency count of elements in the array given
import java.util.*;
public class Main {
    public static void main(String[] args) {
       HashMap<Integer,Integer> hm=new HashMap<>();//creating hashmap(syntax)
       int []arr={2,3,4,1,2,3,4,5};//array declaration
for(int i=0;i<arr.length;i++)
{
    int n=arr[i];
    if(hm.containsKey(n))
    {
        int prev=hm.get(n);    //if the value is repeated again the comes to this if block and increments the value by 1
        hm.put(n,prev+1);

    }
    else
        hm.put(n,1);  //it assignes the value if the value is for the first time
}
for (int i: hm.keySet())
{
    System.out.println(i+"-"+hm.get(i));//key and its value is returned
}


         }
}
