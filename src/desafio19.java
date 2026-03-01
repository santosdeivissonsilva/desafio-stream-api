import java.util.Arrays;
import java.util.List;

public class desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 19 - Encontrar a soma dos números divisíveis por 3 e 5:
        int somaDivisiveis3E5 = numeros.stream()
            .filter(numero -> numero % 3 == 0 && numero % 5 == 0) // Filtra os números que são divisíveis por 3 e 5
            .reduce(0, Integer::sum); // Soma todos os números divisíveis por 3 e 5

        System.out.println("Soma dos números divisíveis por 3 e 5: " + somaDivisiveis3E5);
    }
}
