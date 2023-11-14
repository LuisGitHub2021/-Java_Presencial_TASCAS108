package n1Exercici3;

import java.util.Arrays;
import java.util.List;


public class App {

	public static void main(String[] args) {
	
        List <String> listaMeses = Arrays.asList ("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
        		"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");

      
       listaMeses.forEach(s-> System.out.println( s ));
        
	}
	

}
