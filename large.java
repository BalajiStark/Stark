import java.util.*;
public class large {

    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int a,b,c;
     a=in.nextInt();
     b=in.nextInt();
     c=in.nextInt();
     if(a>b)
     {
         if(a>c)
         {
             System.out.println("A is bigger");
         }
         else
         {
             System.out.println("B is bigger");
         }
     }else
         if(b>c)
        System.out.println("B is bigger");
     else
            System.out.println("C is bigger");
     
    }
    
}
