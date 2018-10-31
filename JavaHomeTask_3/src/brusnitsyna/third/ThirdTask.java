package brusnitsyna.third;

import java.util.ArrayList;

public class ThirdTask {
	
	public static void main(String [] args) {
		
		Integer[] myIntArray = { 9, 8, 0, 1, 7, 6, 2, 3 };
		ArrayToList<Integer> tmp = new ArrayToList<Integer>();
		ArrayList<Integer> myIntList = tmp.makeList(myIntArray);
		for (int i = 0; i < myIntList.size(); i++) {
			System.out.println(myIntList.get(i));
		}
		
		String[] myStrArray = {"popsicle", "biscuit", "chocolate"};
		ArrayToList<String> tmp2 = new ArrayToList<String>();
		ArrayList<String> myStrList = tmp2.makeList(myStrArray);
		for (int i = 0; i < myStrList.size(); i++) {
			System.out.println(myStrList.get(i));
		}
	}
}
