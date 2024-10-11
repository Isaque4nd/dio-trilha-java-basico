package StreamAPI.interfaces.src.BinaryOperator;

import java.util.Arrays;
import java.util.List;

public class BinaryOperatorExample {
    
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        //BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        int resultado = numeros.stream()
            .reduce(0,  Integer::sum);

        System.out.println("A soma dos números é: " + resultado);
    }
}
