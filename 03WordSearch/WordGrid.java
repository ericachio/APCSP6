import java.util.Random;
public class WordGrid{
    private char[][]data;

    public WordGrid(int rows, int cols){
	data = new char[rows][cols];
	for (int i = 0; i < data.length; i ++){
	    for (int l = 0; l < data[i].length; l ++){
		data[i][l] = randomChar();
	    }
	}
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
    //public boolean addWordHorizontal(String word, int row, int col){
    //}
    
    public static void main (String[]args){
	WordGrid a = new WordGrid(4,5);
	System.out.println(a.toString()); 
	System.out.println(a.randomChar()); 
	System.out.println(a.randomChar()); 
    }
}
