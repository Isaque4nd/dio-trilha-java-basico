package StreamAPI.interfaces.src.Consumer;

import java.util.Arrays;
import java.util.List;

public class ConsumerExample {
    
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 10, 11, 12, 1112);

    /*  Consumer<Integer> ImprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }; */

        numeros.stream().forEach(n -> {
            if (n % 2 ==0) {
                System.out.println(n);
            }
        });
    }
}
