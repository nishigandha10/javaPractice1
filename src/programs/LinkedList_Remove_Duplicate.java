package programs;

import java.util.LinkedList;

public class LinkedList_Remove_Duplicate {

	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("aa");
		ls.add("bb");
		ls.add("cc");
		ls.add("aa");
		//ls.add("9");
		System.out.println("List is : " + ls);
		System.out.println("Size of list is :" +ls.size());

		LinkedList<String> duplicateNumberList = new LinkedList<String>();
		for (int i = 0; i < ls.size(); i++) {
			for (int j = i + 1; j < ls.size(); j++) {
				if (ls.get(i) == ls.get(j)) {
					duplicateNumberList.add(ls.get(i));
				}
			}
  }

		ls.removeAll(duplicateNumberList);
		System.out.print("Unique string value List " + ls);

	}
	}
