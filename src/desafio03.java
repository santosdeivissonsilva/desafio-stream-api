import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class desafio03 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 03 - Verifique se todos os números da lista são positivos:
        Predicate<Integer> isNegativo = numero -> numero < 0;

        List<Integer> listaNumerosNegativos = numeros.stream()
                .filter(isNegativo)
                .toList();

        boolean possuiNegativos;
        if (listaNumerosNegativos.isEmpty()) {
            possuiNegativos = false;
        } else {
            possuiNegativos = true;
        }

        System.out.println("A lista contém números negativos? " + possuiNegativos);
    }
}