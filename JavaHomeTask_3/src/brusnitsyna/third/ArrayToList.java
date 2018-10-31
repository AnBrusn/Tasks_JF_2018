package brusnitsyna.third;

import java.util.ArrayList;

public class ArrayToList<T> {
	public ArrayList<T> makeList(T[] arr) {
		ArrayList<T> myList = new ArrayList<T>();
        for (T elem : arr){ 
            myList.add(elem); 
        }
        return myList;
	}
}
