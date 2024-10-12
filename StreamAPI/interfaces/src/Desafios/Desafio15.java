package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio15 {
    
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        List<Integer> existemNumerosNegativos = numeros.stream()
            .filter(numero -> numero < 0) 
            .collect(Collectors.toList());

        if(!existemNumerosNegativos.isEmpty()) {
            System.out.println("Existem números negativos eles são: " + existemNumerosNegativos);
        } else {
            System.out.println("Não existem números negativos");
        }

    }
}
