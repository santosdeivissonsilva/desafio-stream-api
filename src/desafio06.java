import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio06 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 6 - Verificar se a lista contém algum número maior que 10:
        Predicate<Integer> isMaior10 = numero -> numero > 10;
        boolean contemMaior10 = numeros.stream()
                .filter(isMaior10) // Filtra os números que são maiores que 10
                .count() > 0; // Verifica se a lista contém algum número maior que 10
        System.out.println("A lista contém algum número maior que 10? " + contemMaior10);
    }
}
