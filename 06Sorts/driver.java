import java.util.Random;
import java.util.Arrays;
public class driver{
    public static void main(String[]args){
	long start,end;
	Random R = new Random();
	int [] b = new int[10000];
	int [] i = new int[10000];
	int [] s = new int[10000];
	int [] c = new int[10000];
	int a;
	for (int x = 0; x < 10000; x++){
	   a = R.nextInt(2000000000);
	   b[x] = a;
	   i[x] = a;
	   s[x] = a;
	   c[x] = a;
	}
	
	start = System.currentTimeMillis();
	sorts.bubble(b);
	end = System.currentTimeMillis();
	//System.out.println("bubble");
	System.out.println(end-start);

	start = System.currentTimeMillis();
	sorts.insertion(i);
	end = System.currentTimeMillis();
	//System.out.println("insertion");
	System.out.println(end-start);
	
	start = System.currentTimeMillis();
	sorts.selection(s);
	end = System.currentTimeMillis();
	//System.out.println("selection");
	System.out.println(end-start);
	
	start = System.currentTimeMillis();
	Arrays.sort(c);
	end = System.currentTimeMillis();
	//System.out.println("double quicksort");
	System.out.println(end-start);
	


	
    }
}
