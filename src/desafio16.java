import java.util.Arrays;
import java.util.List;

public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 16 - Agrupar os números em pares e ímpares:
        List<Integer> listaPares = numeros.stream()
                .filter(numero -> numero % 2 == 0) // Filtra os números que são pares
                .toList();
        List<Integer> listaImpares = numeros.stream()
                .filter(numero -> numero % 2 != 0) // Filtra os números que são ímpares
                .toList();

        System.out.println("Lista de números pares: " + listaPares + " e lista de números ímpares: " + listaImpares);
    }
}
