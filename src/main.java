import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 01 - Mostre a lista na ordem numérica:
        List<Integer> ordenado = numeros.stream().sorted().toList();

        // Desafio 02 - Imprima a soma dos números pares da lista:
        Predicate<Integer> isPar = numero -> numero % 2 == 0;
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        List<Integer> numerosPares = numeros.stream().filter(isPar).toList(); // Desafio 04 - Remova todos os valores ímpares:
        int resultadoSoma = numerosPares.stream().reduce(0, somar);

        // Desafio 03 - Verifique se todos os números da lista são positivos:
        Predicate<Integer> isPositivo = numero -> numero > 0;

        List<Integer> listaNumerosPositivos = numeros.stream()
        .filter(isPositivo)
        .collect(Collectors.toList());

        System.out.println("Lista ordem numérica: " + ordenado);
        System.out.println("A soma dos números pares é: " + resultadoSoma);
        System.out.println("Lista dos números positivos: " + listaNumerosPositivos);
        System.out.println("Lista de números pares: " + numerosPares);
        
    }
}