package Practice_programs;

import java.util.ArrayList;

public class AL1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("shashi");
		a.add("kumar");
		a.add("Yadav");
		a.add("thumula");
		a.remove(1);
		System.out.println(a.contains("shashi"));
	}

}
