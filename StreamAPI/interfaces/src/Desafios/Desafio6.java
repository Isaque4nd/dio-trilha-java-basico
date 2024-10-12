package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio6 {
    
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, -10, 15, -4, -3);

        List<Integer> numerosMaioresQueDez = numeros.stream()
            .filter(numero -> numero > 10) 
            .collect(Collectors.toList()); 
            
            if(!numerosMaioresQueDez.isEmpty()) {
                System.out.println("O números maiores que 10 são: " + numerosMaioresQueDez);
            } else {
                System.out.println("Não existem números maiores que 10.");
            }

            
    }
}
