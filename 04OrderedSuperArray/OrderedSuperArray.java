import java.util.Random;

public class OrderedSuperArray extends SuperArray{
    int elements;
    public static String[] superArray;

    public void sort(String[] array){
	int length = array.length;
	String[] temp = new String[length];
	for (int i = 0; i < length - 1; i ++){
	    if (array[i].compareTo(array[i+1]) > 0){
		String t;
		t = temp[i];
		for (int j = i; j < length - 1; j ++){
		    temp[i] = temp[i+1];
		}
	    }
	    
	}
    }
    
    public static void main (String[]args){
	OrderedSuperArray a = new OrderedSuperArray();
	String[] trial = {"b", "c", "a", "e"};
	super.toString(trial);
	a.sort(trial);
	//System.out.println(trial[2]);
	a.toString(trial);
    }
}
