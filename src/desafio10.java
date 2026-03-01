import java.util.Arrays;
import java.util.List;

public class desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 10 - Agrupar os valores ímpares múltiplos de 3 ou de 5:
        List<Integer> listaImparesMultiplos3Ou5 = numeros.stream()
                .filter(numero -> numero % 3 == 0 || numero % 5 == 0) // Filtra os números que são múltiplos de 3 ou de 5
                .toList();

        System.out.println("Lista de números ímpares múltiplos de 3 ou de 5: " + listaImparesMultiplos3Ou5);
    }
}
