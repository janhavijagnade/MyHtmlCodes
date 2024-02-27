import java.util.*;
public class MaxFind{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter Array Element:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Display Array:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Max Element is:"+max);
    }
}