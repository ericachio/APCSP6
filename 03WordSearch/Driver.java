import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Driver{
    public static void main (String[] args){
	if (args.length > 0){
	    int rows = Integer.parseInt(args[0]);
	    int cols = Integer.parseInt(args[1]);
	    if (rows > 80 || cols > 80){
		System.out.println("Sorry, too big!");
	    }else{
		WordGrid a = new WordGrid(rows, cols);
	    if (args.length >= 3){
		int seed = Integer.parseInt(args[2]);
		a.setSeed(seed);
	    }
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
	    System.out.println("Find these words: \n" + a.wordsInPuzzle());
	    System.out.println();
	    System.out.println(a);
	    }
	}else{
	    WordGrid a = new WordGrid();
	    try{	
		a.loadWordsFromFile("words.txt", true);    
	    }catch(FileNotFoundException e){
		System.out.println("File Not Found");
	    }
	    System.out.println("Find these words: \n" + a.wordsInPuzzle());
	    System.out.println();
	    System.out.println(a);	    
	}
    }
}
