import java.util.Arrays;
import java.util.List;

public class desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 11 - Encontrar a soma dos quadrados de todos os números da lista:
        int somaQuadrados = numeros.stream()
                .map(numero -> numero * numero) // Calcula o quadrado de cada número
                .reduce(0, Integer::sum); // Soma todos os quadrados
                System.out.println("Soma dos quadrados de todos os números da lista: " + somaQuadrados);
    }
}
