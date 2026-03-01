import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 17 - Filtrar os números primos da lista:
        Predicate<Integer> isPrimo = numero -> {
            if (numero <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }

            return true;
        };

        List<Integer> listaPrimos = numeros.stream()
                .filter(isPrimo) // Filtra os números que são primos
                .toList();

        System.out.println("Lista de números primos: " + listaPrimos);
    }
}
