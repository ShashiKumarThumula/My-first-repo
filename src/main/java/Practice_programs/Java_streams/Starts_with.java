package Practice_programs.Java_streams;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Starts_with {
	@Test
	public void regular() {

		ArrayList<String> names = new ArrayList<String>(); //storing names into arraylist
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");

		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i); 		//storing the index number into names
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);	
	}
	@Test
	public void StreamFilter() {
		ArrayList<String> names = new ArrayList<String>(); //storing names into arraylist
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		Long c=names.stream().filter(s->s.startsWith("D")).count();
		
		System.out.println(c);
		
	}

}
