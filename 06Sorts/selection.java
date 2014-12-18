public class selection{

    public selection(int[] c){
	for (int i = 0; i < c.length - 1; i++){
	    int lowest = i;
	    for (int j = i + 1; j < c.length; j++){
		if (c[j] < c[lowest]){
		    lowest = j;
		}
	    }
	    if (lowest != i){
		int temp = c[i];
		c[i] = c[lowest];
		c[lowest] = temp;
	    }
	}
    }
    public static void main(String[]args){
	int[] trial = new int[5];
	trial[0] = 1;
	trial[1] = 9;
	trial[2] = 7;
	trial[3] = 3;
	trial[4] = 5;
	selection a = new selection(trial);
    }
}
