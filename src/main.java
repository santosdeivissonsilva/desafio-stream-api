import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 01 - Mostre a lista na ordem numérica:
        List<Integer> listaNumerosOrdenados = numeros.stream().sorted().toList();

        // Desafio 02 - Imprima a soma dos números pares da lista:
        Predicate<Integer> isPar = numero -> numero % 2 == 0;
        BinaryOperator<Integer> somar = Integer::sum;

        List<Integer> listaNumerosPares = numeros.stream().filter(isPar).toList(); // Desafio 04 - Remova todos os valores ímpares:
        int resultadoSoma = listaNumerosPares.stream().reduce(0, somar);

        // Desafio 03 - Verifique se todos os números da lista são positivos:
        Predicate<Integer> isPositivo = numero -> numero > 0;

        List<Integer> listaNumerosPositivos = numeros.stream()
        .filter(isPositivo)
        .toList();

        // Desafio 05 - Calcule a média dos números maiores que 5:
        Predicate<Integer> isMaior5 = numero -> numero > 5;

        List<Integer> listaNumerosMaior5 = numeros.stream().filter(isMaior5).toList();

        // Desafio 6 - Verificar se a lista contém algum número maior que 10:
        boolean isMaior10 = numeros.stream().allMatch(numero -> numero > 10);

        // Desafio 7 - Encontrar o segundo número maior da lista:
        Integer segundoMaiorNumero = listaNumerosOrdenados.stream()
                .distinct() // Retirar números repetidos
                .sorted(Comparator.reverseOrder()) // Invertendo a ordem
                .skip(1) // Pulando o primeiro número (maior da lista)
                .findFirst() // Pegando o próximo número
                .orElse(null); // Retorna null caso não encontre nenhum número


        System.out.println("Lista ordem numérica: " + listaNumerosOrdenados);
        System.out.println("A soma dos números pares é: " + resultadoSoma);
        System.out.println("Lista dos números positivos: " + listaNumerosPositivos);
        System.out.println("Lista de números pares: " + listaNumerosPares);
        System.out.println("Lista dos números maiores do que 5: " + listaNumerosMaior5);
        System.out.println("Existem números na lista maiores do que 10? " + isMaior10);
        System.out.println("Segundo maior número da lista" + segundoMaiorNumero);

    }
}