import java.util.ArrayList;

public class ArrayListMethods{
    
    public static void collapseDuplicates(ArrayList<Integer> L){
	for (int i = 1; i < L.size() - 1; i++){
	    if (L.get(i) == L.get(i+1)){
		L.remove(i+1);
		collapseDuplicates trial = new collapseDuplicates(L);
	    }
	}
    }
    
    public static void randomize(ArrayList<Integer> L){

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
