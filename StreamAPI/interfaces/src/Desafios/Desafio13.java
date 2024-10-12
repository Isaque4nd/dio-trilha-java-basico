package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio13 {
    
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        List<Integer> numerosEntre1e5 = numeros.stream()
            .distinct()
            .filter(numero -> numero > 0 && numero < 5) 
            .collect(Collectors.toList());

        System.out.println(numerosEntre1e5);
    }
}
