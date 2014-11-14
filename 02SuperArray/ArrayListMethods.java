import java.util.ArrayList;
import java.util.Random;

public class ArrayListMethods{
    
    public static void collapseDuplicates(ArrayList<Integer> L){
	for (int i = 1; i < L.size() - 1; i++){
	    if (L.get(i) == L.get(i+1)){
		L.remove(i+1);
		collapseDuplicates(L);
	    }
	}
    }
    
    public static void randomize(ArrayList<Integer> L){
	int index;
	Random rand = new Random();
	int seed = 123456789;
	int size = L.size();
	ArrayList<Integer> H = new ArrayList<Integer>(size);
	for (int i = 0; i < size; i ++){
	    index = rand.nextInt(L.size());
	    H.add(i, L.get(index));
	    L.remove(index);
	}
	for(int j = 0; j < size; j ++){
	    L.add(j, H.get(j));
	}
    }
    public static void main (String[]args){
	/*
	ArrayList<Integer> H = new ArrayList<Integer>();
	H.add(2);
	H.add(4);
	H.add(4);
	H.add(4);
	H.add(4);
	H.add(5);
	H.add(5);
	H.add(2);
	H.add(4);
	H.add(3);
	System.out.println(H);
	ArrayListMethods yo = new ArrayListMethods();
	yo.collapseDuplicates(H);
	System.out.println(H);
	*/
	
	/*
	ArrayList<Integer> H = new ArrayList<Integer>();
	H.add(1);
	H.add(2);
	H.add(3);
	H.add(4);
	H.add(5);
	H.add(6);
	H.add(7);
	H.add(8);
	H.add(9);
	System.out.println(H);
	ArrayListMethods ha = new ArrayListMethods();
	ha.randomize(H);
	System.out.println(H);
	*/
	
    }
}
