import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class desafio05 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 05 - Calcule a média dos números maiores que 5:
        Predicate<Integer> isMaior5 = numero -> numero > 5;
        double mediaNumerosMaior5 = numeros.stream()
                .filter(isMaior5)
                .reduce(0, Integer::sum) / numeros.stream().filter(isMaior5).count();
        System.out.println("Média dos números maiores que 5: " + mediaNumerosMaior5);
    }
}
