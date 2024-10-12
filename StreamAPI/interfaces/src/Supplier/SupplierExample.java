package Supplier;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    
    public static void main(String[] args) {
        //Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        List<String> listaSaudacoes = Stream.generate(() ->  "Olá, seja bem-vindo(a)!")
            .limit(5)
            .collect(Collectors.toList());

        listaSaudacoes.forEach(n -> System.out.println(n));
    }
}    

