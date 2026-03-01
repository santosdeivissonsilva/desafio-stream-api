import java.util.Arrays;
import java.util.List;

public class desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 15 - Verificar se a lista contém pelo menos um número negativo:
        boolean contemNegativo = numeros.stream()
                .anyMatch(numero -> numero < 0); // Verifica se a lista contém algum número negativo
        
        System.out.println("A lista contém pelo menos um número negativo? " + contemNegativo);
    }
}
