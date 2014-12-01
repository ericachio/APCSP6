import java.util.Random;

public class OrderedSuperArray extends SuperArray{
    int elements;
    public static String[] superArray;

    public void sort(String[] array){
	int length = array.length;
	String temp = new String[length];
	for (int i = 0; i < length; i ++){
	    if (temp[i].comparesTo(temp[i+1] > 0)){
		String t;
		t = temp[i];
		for (j = i; j < length; j ++){
		    temp[i] = temp[i+1];
		}
	    }
	}
    }
}
