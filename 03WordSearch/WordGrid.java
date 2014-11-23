import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
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
	char[][] temp = data;
	int possrow = temp.length - row;
	int posscol = temp[row].length - col;
	boolean woo = false;
	if (way == "Horizontal"){
	    if (posscol >= word.length()){
		int l = 0;
		for (int i = col; i < word.length() + col; i++){
		    if (data[row][i] == word.charAt(l)){
			l ++;
			woo = true;
		    }else if (data[row][i] == ' '){
			l ++;
			woo = true;
		    }else{
			woo = false;
			l ++;
			i = word.length() + col;
		    }
		}
	    }
	}else if (way == "Vertical"){
	    if (possrow >= word.length()){
		int l = 0;
		for (int i = row; i < word.length() + row; i++){
		    if (data[i][col] == word.charAt(l)){
			l ++;
			woo = true;
		    }else if (data[i][col] == ' '){
			l ++;
			woo = true;
		    }else{
			l ++;
			woo = false;
			i = word.length() + row;
		    }	
		}
	    }
	}else if (way == "Diagonal"){
	    if (possrow >= word.length() && posscol >= word.length()){
		int l = 0;
		int r = row;
		for (int i = col; i < word.length() + col; i++){
		    if (data[r][i] == word.charAt(l)){
			l ++;
			r ++;
			woo = true;
		    }else if (data[r][i] == ' '){
			l ++;
			r ++;
			woo = true;
		    }else{
			l ++;
			r ++;
			woo = false;
			i = word.length() + col;
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
		data[row][i] = word.charAt(l);
		l ++;
		waa = true;
	    }	
	}else if (checkSpace(word, row, col, "Horizontal") == false){
	    waa = false;
	}
	return waa;
    }
    
    public boolean addWordVertical(String word, int row, int col){
	boolean waa = false;
	if (checkSpace(word, row, col, "Vertical") == true){
	    int l = 0;
	    for (int i = row; i < word.length() + row ; i++){
		data[i][col] = word.charAt(l);
		l ++;
		waa = true;		
	    }
	}else if (checkSpace(word, row, col, "Vertical") == false){
	    waa = false;
	}
	return waa;
    }
    
    public boolean addWordDiagonal(String word, int row, int col){
	boolean waa = false;
	if (checkSpace(word, row, col, "Diagonal") == true){
	    int l = 0;
	    int r = row;
	    for (int i = col; i < word.length() + col; i++){
		data[r][i] = word.charAt(l);
		l ++;
		r ++;
		waa = true;
	    }	
	}else if (checkSpace(word, row, col, "Diagonal") == false) {
	    waa = false;
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
    public void getWord(int rows, int cols)throws FileNotFoundException{
	String ans = "";
	File file = new File("words.txt");
	Scanner scan = new Scanner(file);
	int lineNumber = 1;
	while (scan.hasNextLine()){
	    String line = scan.nextLine();
	    boolean waa = false;
	    int trial = 0;
	    if (waa == false || trial < 5){
		trial ++;
		Random rand = new Random();
		int seed = 123456789;
		int side = rand.nextInt(4) + 1;
		int r = rand.nextInt(rows);
		int c = rand.nextInt(cols);
		if (side == 1){
		    addWordHorizontal(line, r, c);
		    waa = true;
		}
		else if (side == 2){
		    addWordVertical(line, r, c);
		    waa = true;
		}else if (side == 3){
		    addWordDiagonal(line, r, c);
		    waa = true;	
		}	       
	    }
	    lineNumber ++;
	}
    }
    
    public static void main (String[]args)throws FileNotFoundException{
	WordGrid a = new WordGrid(50,50);
	//System.out.println(a.toString());
	//a.clear();
	//System.out.println(a.addWordHorizontal("happy",5,3));
	//System.out.println(a.addWordVertical("car",1,3));
	//System.out.println(a.addWordDiagonal("love",0,4));
	//a.addRand();
        a.getWord(50,50);
	System.out.println(a.toString());
	
    }
}
