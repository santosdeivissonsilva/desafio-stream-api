import java.util.Arrays;
import java.util.List;

public class desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 13 - Filtrar os números que estão dentro de um intervalo (entre 5 e 10):
        List<Integer> listaIntervalo = numeros.stream()
                .filter(numero -> numero >= 5 && numero <= 10) // Filtra os números entre 5 e 10 inclusive
                .toList();
        System.out.println("Lista de números dentro do intervalo (entre 5 e 10): " + listaIntervalo);
    }
}
