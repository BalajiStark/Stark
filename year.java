import java.util.*;
public class JavaApplication13 {

    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int a;
     a=in.nextInt();
     if(a%4==0)
            System.out.println("Leap year");
     else if(a%400==0)
            System.out.println("Leap year");
     else 
            System.out.println("Not Leap year");
    }
    
}
