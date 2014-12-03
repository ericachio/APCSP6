import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Driver{
    public static void main (String[] args){
	if (args.length > 0){
	    int rows = Integer.parseInt(args[0]);
	    int cols = Integer.parseInt(args[1]);
	    WordGrid a = new WordGrid(rows, cols);
	    int seed = Integer.parseInt(args[2]);
	    a.setSeed(seed);
	    boolean ansKey = true;
	    if (args.length >= 4){
		if (args[3].equals("1")){
		    ansKey = true;
		}else if (args[3].equals("0")){
		    ansKey = false;
		}
	    }
	    try{	
		a.loadWordsFromFile("words.txt", ansKey);    
	    }catch(FileNotFoundException e){
		System.out.println("File Not Found");
	    }
	    System.out.println(a.wordsInPuzzle());
	    System.out.println();
	}
    }
}
