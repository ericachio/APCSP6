import java.util.Random;
public class WordGrid{
    private char[][]data;

    public WordGrid(int rows, int cols){
	data = new char[rows][cols];
	for (int i = 0; i < data.length; i ++){
	    for (int l = 0; l < data[i].length; l ++){
		data[i][l] = ' ';
	    }
	}
	/*
	  for (int i = 0; i < data.length; i ++){
	    for (int l = 0; l < data[i].length; l ++){
		data[i][l] = randomChar();
	    }
	}
	*/
    }
    public char randomChar(){
	Random rand = new Random();
	int seed = 123456789;
	char[] ch = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	int index = rand.nextInt(26);
	return ch[index];
    }
    private void clear(){
	char[][] temp = data;
	for (int i = 0; i < temp.length; i ++){
	    for (int l = 0; l < temp[i].length; l ++){
		data[i][l] = ' ';
	    }
	}
    }
    public String toString(){ 
	String ans = "";
	char[][] temp = data;
	for (int i = 0; i < temp.length; i ++){
	    for (int l = 0; l < temp[i].length; l ++){
		ans += data[i][l] + " ";
	    }
	    ans += "\n";
	}
	return ans;
    }

    public boolean checkSpace(String word, int row, int col, String way){
	int length = word.length();
	char[][] temp = data;
	int possrow = temp.length - row;
	int posscol = temp[row].length - col;
	boolean woo = false;
	if (way == "Horizontal"){
	    if (posscol >= length){
		int l = 0;
		for (int i = col; i < length + col; i++){
		    if (data[row][i] == word.charAt(l) ||  data[row][i] == ' '){
			l ++;
			woo = true;
		    }else{
			woo = false;
		    }	
		}
	    }
	}else if (way == "Vertical"){
	    if (possrow >= length){
		int l = 0;
		for (int i = row; i < length + row; i++){
		    if (data[i][col] == word.charAt(l) ||  data[i][col] == ' '){
			l ++;
			woo = true;
		    }else{
			woo = false;
		    }		
		}
	    }
	}else if (way == "Diagonal"){
	    if (possrow >= length && posscol >= length){
		int l = 0;
		int r = row;
		for (int i = col; i < length; i++){
		    if (data[r][i] == word.charAt(l) ||  data[r][i] == ' '){
			l ++;
			r ++;
		    woo = true;
		    }else{
			woo = false;
		    }	
		}
	    }
	}
	return woo;
    }
    public boolean addWordHorizontal(String word, int row, int col){
	boolean waa = false;
	if (checkSpace(word, row, col, "Horizontal") == true){
	    int l = 0;
	    for (int i = col; i < word.length() + col; i++){
		if (data[row][i] == word.charAt(l) ||  data[row][i] == ' '){
		    data[row][i] = word.charAt(l);
		    l ++;
		    waa = true;
		}	
	    }
	}else{
	    System.out.println("Error...");
	}
	return waa;
    }
    
    public boolean addWordVertical(String word, int row, int col){
	boolean waa = false;
	if (checkSpace(word, row, col, "Vertical") == true){
	    int l = 0;
	    for (int i = row; i < word.length() + row; i++){
		if (data[i][col] == word.charAt(l) ||  data[i][col] == ' '){
		    data[i][col] = word.charAt(l);
		    l ++;
		    waa = true;
		}		
	    }
	}else{
	    System.out.println("Doesn't Fit");
	}
	return waa;
    }
    
    public boolean addWordDiagonal(String word, int row, int col){
	boolean waa = false;
	if (checkSpace(word, row, col, "Diagonal") == true){
	    int l = 0;
	    int r = row;
	    for (int i = col; i < word.length(); i++){
		if (data[r][i] == word.charAt(l) ||  data[r][i] == ' '){
		    data[r][i] = word.charAt(l);
		    l ++;
		    r ++;
		    waa = true;
		}	
	    }
	}else{
	    System.out.println("Doesn't Fit");
	}
	return waa;
    }
    
    public void addRand(){
	char[][] temp = data;
	for (int i = 0; i < temp.length; i ++){
	    for (int l = 0; l < temp[i].length; l ++){
		if (data[i][l] == ' '){
		    data[i][l] = randomChar();
		}
	    }
	}
    }
    
    public static void main (String[]args){
	WordGrid a = new WordGrid(10,10);
	System.out.println(a.toString());
	//a.clear();
	System.out.println(a.addWordHorizontal("happy",5,3));
	System.out.println(a.addWordVertical("car",1,3));
	System.out.println(a.addWordDiagonal("love",0,0));
	//a.addRand();
	System.out.println(a.toString());

    }
}
