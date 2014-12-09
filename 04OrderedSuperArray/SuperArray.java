public class SuperArray{
    int elements;
    public static String[] superArray;
    
    public SuperArray(){
	superArray = new String[10];
    }
    public SuperArray(int size){
	superArray = new String[size];
	//for (int i = 0; i < size; i++){
	//    superArray[i] = i;
	//}
    }
    public String toString(String[] array){
	String ans = "[ ";
	int length = array.length;
	for (int i = 0; i < length; i++){
	    ans = ans + array[i] + " ";
	}
	ans = ans + "]";
	return ans;
    }
    public void add(String e){
	int length = superArray.length;
	String[] temp = new String[length];
	for (int i = 0; i < length; i ++){
	    temp[i] = superArray[i];
	}
	superArray = new String[length + length];
	for (int j = 0; j < length; j ++){
	    superArray[j] = temp[j];
	}
	superArray[length] = e;
	
    }
    public int size(String[] array){
	int length = array.length;
	int size = 0;
	for (int i = 0; i < length; i ++){
	    if (!(array[i] == null)){
		size ++;
	    }
	}
	return size;
    }
    public void resize(int newCapacity){
	int length = superArray.length;
	String[] temp = new String[length];
	for (int i = 0; i < length; i ++){
	    temp[i] = superArray[i];
	}
	superArray = new String[newCapacity];
	for (int j = 0; j < length; j ++){
	    superArray[j] = temp[j];
	}
    }
    public String get(int index){
	int length = superArray.length;
	if (index < length && index > 0){
	    return superArray[index];
	}else{
	    return null;
	}
    }
    public static void add(int index, String o){
	int length = superArray.length;
	String[] temp = new String[length];
	if (index < length && index > 0){
	    for (int i = 0; i < length; i ++){
		temp[i] = superArray[i];
	    }
	    superArray = new String[length + length];
	    for (int j = 0; j < index; j ++){
		superArray[j] = temp[j];
	    }
	    superArray[index] = o;
	    for (int k = index + 1; k < length + 1; k ++){
		superArray[k] = temp[k-1];
	    }
	}else{
	    throw new ArithmeticException();
	}
    }
    public static String set(int index, String o){
	String ans = superArray[index];
	superArray[index] = o;
	return ans;
    }
    public Object remove(int index){
	int length = superArray.length;
	String[] temp;
	int size = size(superArray);
	if (index < length || index > 0){
	    temp = new String[length-1];
	    for (int i = 0; i < length - 1; i ++){
		if (i == index){
		    temp[i] = null;
		}else{
		    temp[i] = superArray[i];
		}		    
	    }
	    superArray = new String[length - 1];
	    for (int j = 0; j < length - 1;j ++){
		superArray[j] = temp[j];		    
	    }
	}else{
	    System.out.println("ERROR");
	    return null;
	}
	return superArray;
    }
    public static void main (String[]args){
	try{
	    SuperArray a = new SuperArray(5);
	    System.out.println(a.toString(a.superArray));
	    a.add("5");
	    System.out.println(a.toString(a.superArray));
	    a.resize(10);
<<<<<<< HEAD
	    System.out.println(a.toString(a.superArray));
	    System.out.println(a.get(3));
	    a.add(3, "4");
	    System.out.println(a.set(3, "10"));
	    System.out.println(a.toString(a.superArray));
=======
	    System.out.println(toString(a.superArray));
	    System.out.println(get(3));
	    add(3, "4");
	    System.out.println(set(3, "10"));
	    System.out.println(toString(a.superArray));
>>>>>>> 238e1a1e04f1b3ded9b8fff62e4e8ec265b0c1e3
	    System.out.println();
	    SuperArray b = new SuperArray();
	    System.out.println(b.size(b.superArray));
	    b.remove(0);
	    System.out.println(b.toString(b.superArray));
	}catch(ArithmeticException e){
	    System.out.println("Oops, sorry!");
	}
    }
    
}                                 
