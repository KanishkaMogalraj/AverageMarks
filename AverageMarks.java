import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String name=sc.next();
        char c=name.charAt(0);
        int m1,m2,m3;
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        if((m1>=0) && (m1<=100) && (m2>=0) && (m2<=100)&&  (m3>=0) && (m3<=100))
        {
        int average=(m1+m2+m3)/3;
        System.out.println(c);
        System.out.print(average);
        }
        

		
	}

}
