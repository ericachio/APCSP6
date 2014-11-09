public class SuperArray{
    int elements;
    public static Object[] superArray;
    
    public SuperArray(){
	superArray = new Object[10];
    }
    public SuperArray(int size){
	superArray = new Object[size];
	//for (int i = 0; i < size; i++){
	//    superArray[i] = i;
	//}
    }
    public static String toString(Object[] array){
	String ans = "[ ";
	int length = array.length;
	for (int i = 0; i < length; i++){
	    ans = ans + array[i] + " ";
	}
	ans = ans + "]";
	return ans;
    }
    public static void add(Object e){
	int length = superArray.length;
	Object[] temp = new Object[length];
	for (int i = 0; i < length; i ++){
	    temp[i] = superArray[i];
	}
	superArray = new Object[length + 1];
	for (int j = 0; j < length; j ++){
	    superArray[j] = temp[j];
	}
	superArray[length] = e;
	
    }
    public static int size(Object[] array){
	int length = array.length;
	int size = 0;
	for (int i = 0; i < length; i ++){
	    if (!(array[i] == null)){
		size ++;
	    }
	}
	return size;
    }
    public static void resize(int newCapacity){
	int length = superArray.length;
	Object[] temp = new Object[length];
	for (int i = 0; i < length; i ++){
	    temp[i] = superArray[i];
	}
	superArray = new Object[newCapacity];
	for (int j = 0; j < length; j ++){
	    superArray[j] = temp[j];
	}
    }
    public static Object get(int index){
	int length = superArray.length;
	if (index < length && index > 0){
	    return superArray[index];
	}else{
	    return null;
	}
    }
    public static void add(int index, Object o){
	int length = superArray.length;
	Object[] temp = new Object[length];
	if (index < length && index > 0){
	    for (int i = 0; i < length; i ++){
		temp[i] = superArray[i];
	    }
	    superArray = new Object[length + 1];
	    for (int j = 0; j < index; j ++){
		superArray[j] = temp[j];
	    }
	    superArray[index] = o;
	    for (int k = index + 1; k < length + 1; k ++){
		superArray[k] = temp[k-1];
	    }
	}else{
	    System.out.println("ERROR");
	}
    }
    public static Object set(int index, Object o){
	Object ans = superArray[index];
	superArray[index] = o;
	return ans;
    }
    public static Object remove(int index){
	int length = superArray.length;
	Object[] temp;
	if (index < length || index > 0){
	    temp = new Object[length-1];
	    if (index == 0){
		for (int i = 0; i < length - 1; i ++){
		    temp[i] = superArray[i+1];		    
		}
		superArray = new Object[length - 1];
		for (int j = 0; j < length - 1;j ++){
		    superArray[j] = temp[j];		    
		}
	    }else if(index == length - 1){
		for (int i = 0; i < length - 1; i ++){
		    temp[i] = superArray[i];		    
		}
		superArray = new Object[length - 1];
		for (int j = 0; j < length - 1;j ++){
		    superArray[j] = temp[j];		    
		}
	    }else{
		superArray[index] = null;
	    }
	}else{
	    System.out.println("ERROR");
	    return null;
	}
	return superArray;
    }
    public static void main (String[]args){
	SuperArray a = new SuperArray(5);
	System.out.println(toString(a.superArray));
	add(5);
	System.out.println(toString(a.superArray));
	resize(10);
	System.out.println(toString(a.superArray));
	System.out.println(get(3));
	add(3, 4);
	System.out.println(set(3, 10));
	System.out.println(toString(a.superArray));
	System.out.println();
	SuperArray b = new SuperArray();
	System.out.println(size(b.superArray));
	remove(0);
	System.out.println(toString(b.superArray));
    }
    
}                                 
