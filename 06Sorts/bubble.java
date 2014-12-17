public class bubble{

    public bubble(int[] c){
	boolean swap = true;
	while(swap){
	    swap = false;  
	    for (int i = 0; i < c.length - 1; i++){
		if (c[i] > c[i+1]){
		    int temp = c[i];
		    c[i] = c[i+1];
		    c[i+1] = temp;
		swap = true; 
		}
		System.out.println(c[i]);
	    }
	}
    }
    //public static void bubble(int[] c);
    //public static void insertion(int[] c);
    //public static void selection(int[] c); 

    public static void main(String[]args){
	int[] trial = new int[5];
	trial[0] = 1;
	trial[1] = 9;
	trial[2] = 7;
	trial[3] = 3;
	trial[4] = 5;
	bubble a = new bubble(trial);
    }
}
