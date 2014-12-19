public class sorts{

    public static void bubble(int[] c){
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
	    }
	}
    }

    public static void insertion(int[] c){
	for(int i = 1; i < c.length; i++){
	    int num = c[i];
	    int l;
	    for(l = i - 1; (l >=0) && (c[l] > num);l--){
		c[l+1] = c[l];
	    }
	    c[l+1] = num;
	}
    }

    public static void selection(int[] c){
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

    public static String name(){
	return("Chio, Erica");
    }
    public static int period(){
	return(6);
    }
}
