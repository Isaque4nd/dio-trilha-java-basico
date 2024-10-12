package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        boolean naoSeRepetem = numeros.stream()
            .distinct()
            .count() == numeros.size(); // Verifica se todos são distintos

        if (naoSeRepetem) {
            System.out.println("Todos os números são distintos? " + naoSeRepetem);
        } else {
            System.out.println("Há números duplicados");
        }
    }
}
