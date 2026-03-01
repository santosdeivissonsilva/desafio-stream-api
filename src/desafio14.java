import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 14 - Encontrar o maior número primo da lista:
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

        int maiorNumeroPrimo = numeros.stream()
                .filter(isPrimo) // Filtra os números que são primos
                .max(Integer::compare) // Encontra o maior número primo
                .orElse(0); // Retorna 0 caso não encontre nenhum número primo

        System.out.println("Maior número primo da lista: " + maiorNumeroPrimo);

    }
}
