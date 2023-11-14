package n1Exercici1;

import java.util.Arrays;
import java.util.List;


public class App {

	public static void main(String[] args) {
		
        List <String> listaMeses = Arrays.asList ("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
        		"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");

        listaMeses.replaceAll(s->s.toUpperCase());
        listaMeses.forEach(s->{
        	if (s.contains("O")) {
        		System.out.print("\t" +s);
        	}
        });
        

	}
}
