package n1Exercici4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class App {

	public static void main(String[] args) {
		
	
        List <String> listaMeses = Arrays.asList ("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
        		"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");

        //dos tipos de metodos reference
        listaMeses.forEach(System.out::println);  
        gestionaConsumer(App::imprimirList, listaMeses);
         
	}
	
	public static void gestionaConsumer(Consumer<List<String>> expresion, List<String> listameses) {
        expresion.accept(listameses);
    }
	
    public static void imprimirList(List<String> listaMeses) {
        System.out.println("LISTA DE MESES");
        System.out.print("\tMeses del año: " + listaMeses);
        
    }
	
}
