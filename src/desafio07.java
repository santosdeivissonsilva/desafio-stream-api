import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio07 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 7 - Encontrar o segundo número maior da lista:
        Integer segundoMaiorNumero = numeros.stream()
                .distinct() // Retirar números repetidos
                .sorted(Comparator.reverseOrder()) // Invertendo a ordem
                .skip(1) // Pulando o primeiro número (maior da lista)
                .findFirst() // Pegando o próximo número
                .orElse(null); // Retorna null caso não encontre nenhum número
        System.out.println("O segundo número maior da lista é: " + segundoMaiorNumero);
    }
}
