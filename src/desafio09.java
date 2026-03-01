import java.util.Arrays;
import java.util.List;

public class Desafio09 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        boolean todosDistintos = numeros.stream()
                .distinct() // Retira os números repetidos
                .count() == numeros.size(); // Verifica se o número de elementos é igual ao número de elementos da lista original
        System.out.println("Todos os números da lista são distintos? " + todosDistintos);
    }
}
