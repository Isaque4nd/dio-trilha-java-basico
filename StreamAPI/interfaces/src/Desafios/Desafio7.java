package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio7 {
    
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, -10, 15, -4, -3);

        List<Integer> numerosOrdenados = numeros.stream()
            .sorted()
            .distinct()
            .collect(Collectors.toList());

        int segundoMaior = numerosOrdenados.get(numerosOrdenados.size() - 2);

        System.out.println("O segundo maior número é: " + segundoMaior);
            
    }
}
