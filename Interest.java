import java.util.*;
import java.lang.*;

public class Interest
{  
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a = 0;
        int b = 0;
        String k = s.nextLine();
        String q[] = k.split(" ");
        int i = Integer.parseInt(q[0]);
        int j = Integer.parseInt(q[1]);
        a = i;
        while(i>1){
        a= a + (i-((int)(i*j*0.01)));
        i = i - (int)(i*j*0.01);
        }
        System.out.println(a);
        
    }
 }
