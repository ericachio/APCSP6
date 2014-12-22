import java.util.ArrayList;
public class radix{

    public static void radix(int[] c){
	int place = 1;
	ArrayList<Integer> bucket[] = new ArrayList[c.length];
	for (int j = 0; j < c.length; j ++){
	    bucket[j] = new ArrayList<>();
	}2
	for (int i = 0; i < c.length; i ++){
	    int num = c[i];
	    bucket[(num/place)%10].add(num);
	}
	place = place * 10;
	for (int l = 0; l < c.length; l ++){
	    System.out.println(bucket[l]);
	}
    }

    public static void main(String[]args){
	int[] trial = new int[5];
	trial[0] = 103;
	trial[0] = 92;
	trial[0] = 753;
	trial[0] = 32;
	trial[0] = 5;
	radix(trial);
    }
}
