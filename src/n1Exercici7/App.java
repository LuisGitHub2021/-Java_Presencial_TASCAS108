package n1Exercici7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class App{

	public static void main(String[] args) {
		
		
		List<Object> listaNumStr = new ArrayList<Object>();
		
		
		listaNumStr.add("Amadeo");
		listaNumStr.add("Luis");
		listaNumStr.add("Ana");
		listaNumStr.add(9895);
		listaNumStr.add("Joaquin");
		listaNumStr.add(128751);
		
		List<String> listaAllStrings = new ArrayList<>(listaNumStr.size());
		
		for (Object object : listaNumStr) {
			listaAllStrings.add(Objects.toString(object, null));
		}
		
			
		Collections.sort(listaAllStrings, new Comparator<String>(){

			public int compare(String o1, String o2) {
				
				return (o2).length()-(o1).length();
			}
			
		});
		
		listaAllStrings.forEach(o-> System.out.println( o ));
	
	
	}
	
}