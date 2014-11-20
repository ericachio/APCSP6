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
    public boolean addWordHorizontal(String word, int row, int col){
	int length = word.length();
	char[][] temp = data;
	int posscol = temp[row].length - col;
	boolean woo = false;
	if (posscol >= length){
	    int l = 0;
	    for (int i = col; i < length + col; i++){
		if (data[row][i] == word.charAt(l) ||  data[row][i] == ' '){
		    data[row][i] = word.charAt(l);
		    l ++;
		    woo = true;
		}	
	    }
	}
	return woo;
    }
    
    public boolean addWordVertical(String word, int row, int col){
	int length = word.length();
	char[][] temp = data;
	int possrow = temp.length - row;
	boolean woo = false;
	if (possrow >= length){
	    int l = 0;
	    for (int i = row; i < length + row; i++){
		if (data[i][col] == word.charAt(l) ||  data[i][col] == ' '){
		    data[i][col] = word.charAt(l);
		    l ++;
		    woo = true;
		}	
	    }
	}
	return woo;
    }
    
    
    
    public static void main (String[]args){
	WordGrid a = new WordGrid(10,10);
	System.out.println(a.toString());
	//a.clear();
	a.addWordHorizontal("happy",5,3);
	a.addWordVertical("car",1,3);
	System.out.println(a.toString());

    }
}
