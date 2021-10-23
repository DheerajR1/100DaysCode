import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class Day1 {

	static int recurseSquare(int n)
    {
        int count = n;
        for (int i = 1; i <= n; i++)
        {
            int sqr = i * i;
            if (sqr > n)
                break;
            else {
            	System.out.println(sqr);System.out.println("res:"+n);
            	count = Math.min(count, 1 + recurseSquare(n - sqr));
            	System.out.println("count:"+n);
            }
        }
        return count;
    }
	
	public static void recurseVal(int n) {
		int sum = 0;
        int count = 0;
        for(int i = n; i>0;i--) {
        	if(sum < n && (i*i) <= n) {
        		count++;
        		sum +=i*i;
        		if(sum+((i-1)*(i-1))<=n)
        			recurseVal(i);
        		System.out.println(i);
        	}
        }
        System.out.println(sum);
        System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string, number of occurence of string char
        int n= 12;
        System.out.println(recurseSquare(n));    
	}

}
