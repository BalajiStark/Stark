import java.util.*;
public class sum {

    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int[] a=new int[args.length];
     int n=args.length,sum=0;
     for(int i=0;i<n;i++)
     {
         a[i]=Integer.parseInt(args[i]);
         sum=sum+a[i];
     }
        System.out.println(sum);
     
    }
    
}
