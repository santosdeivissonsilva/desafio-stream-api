import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 18 - Verificar se todos os números da lista são iguais:
        boolean todosIguais = numeros.stream()
                .allMatch(numero -> numero == numeros.get(0)); // Verifica se todos os números são iguais ao primeiro número da lista
                
        System.out.println("Todos os números da lista são iguais? " + todosIguais);
    }
}
