public class insertion{

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

    public static void main(String[]args){
	int[] trial = new int[5];
	trial[0] = 1;
	trial[1] = 9;
	trial[2] = 7;
	trial[3] = 3;
	trial[4] = 5;
	insertion a = new insertion();
	a.insertion(trial);
    }
}
