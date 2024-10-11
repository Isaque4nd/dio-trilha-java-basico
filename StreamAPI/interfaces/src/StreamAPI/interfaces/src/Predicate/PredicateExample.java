package StreamAPI.interfaces.src.Predicate;

import java.util.Arrays;
import java.util.List;

public class PredicateExample {
    
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "Kotlin", "Python", "JavaScript", "C#", "GO", "C++");


        //Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
            .filter(n -> n.length() > 5)
            .forEach(System.out::println);
    }
}
