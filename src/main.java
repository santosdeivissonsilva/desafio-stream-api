import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 01
        List<Integer> ordenado = numeros.stream().sorted().toList();

        // Desafio 02
        Predicate<Integer> isPar = numero -> numero % 2 == 0;

        List<Integer> numerosPares = numeros.stream()
                .filter(isPar)
                .toList();

        System.out.println(ordenado);
        System.out.println(numerosPares);
    }
}