import java.util.Arrays;
import java.util.List;

public class Desafio04 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 04 - Remova todos os valores ímpares:
        List<Integer> listaNumerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0) // Filtra os números que são pares
                .toList(); // Converte o stream para uma lista

        List<Integer> listaNumerosImpares = numeros.stream()
                .filter(numero -> numero % 2 != 0) // Filtra os números que são ímpares
                .toList(); // Converte o stream para uma lista

        System.out.println("Lista de números pares: " + listaNumerosPares);
        System.out.println("Lista de números ímpares: " + listaNumerosImpares);
    }
}