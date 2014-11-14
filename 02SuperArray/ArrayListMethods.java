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
	ArrayList<Integer> H = new ArrayList<Integer>(L.size());
	for (int i = 0; i < L.size(); i++){
	    index = rand.nextInt(L.size() - i + 1);
	    if (index != i){
		H.add(index, L.get(i));
	    }
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
	collapseDuplicates yo = new collapseDuplicates(H);
	System.out.println(H);
	*/
	
    }
}
