import java.util.*;
public class charac {

    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     String s=in.nextLine();
     char c=s.charAt(0);
     int x=(int)c;
   if((x>=65 && x<=90)||(x>=97 && x<=122))
        System.out.println("Alphabet");
   else
            System.out.println("Not-Alphabet");
     
    }
    
}
