import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class desafio02 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 02 - Imprima a soma dos números pares da lista:
        Predicate<Integer> isPar = numero -> numero % 2 == 0;
        BinaryOperator<Integer> somar = Integer::sum;

        List<Integer> listaNumerosPares = numeros.stream()
                .filter(isPar) // Filtra os números que são pares
                .toList(); // Converte o stream para uma lista

        int resultadoSoma = listaNumerosPares.stream()
                .reduce(0, somar);

        System.out.println("A soma dos números pares é: " + resultadoSoma);
    }
}
