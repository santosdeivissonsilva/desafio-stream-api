import java.util.Arrays;
import java.util.List;

public class desafio01 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 01 - Mostre a lista na ordem numérica:
        List<Integer> listaNumerosOrdenados = numeros.stream()
                .sorted() // Ordena a lista em ordem crescente
                .toList(); // Converte o stream para uma lista
        System.out.println("Lista ordem numérica: " + listaNumerosOrdenados);
    }
}