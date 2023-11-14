package n1Exercici6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class App{

	public static void main(String[] args) {
		
		List<Object> listaNumStr = new ArrayList<Object>();
		
		listaNumStr.add("Amadeo");
		listaNumStr.add("Luis");
		listaNumStr.add("Ana");
		listaNumStr.add(9895);
		listaNumStr.add("Joaquin");
		listaNumStr.add(128751);
		
		List<String> listaAllStrings = new ArrayList<>();
		
		for (Object object : listaNumStr) {
			listaAllStrings.add(object.toString());
					
		}
					
		Collections.sort(listaAllStrings, new Comparator<String>(){

			public int compare(String o1, String o2) {
				
				return (o1).length()-(o2).length();
			}
			
		});
		
		listaAllStrings.forEach(o-> System.out.println( o ));
	
	}
	
}