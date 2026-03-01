import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 01 - Mostre a lista na ordem numérica:
        List<Integer> listaNumerosOrdenados = numeros.stream()
                .sorted()
                .toList();

        // Desafio 02 - Imprima a soma dos números pares da lista:
        Predicate<Integer> isPar = numero -> numero % 2 == 0;
        BinaryOperator<Integer> somar = Integer::sum;

        List<Integer> listaNumerosPares = numeros.stream()
                .filter(isPar)
                .toList(); // Desafio 04 - Remova todos os valores ímpares:

        int resultadoSoma = listaNumerosPares.stream()
                .reduce(0, somar);

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

        // Desafio 05 - Calcule a média dos números maiores que 5:
        Predicate<Integer> isMaior5 = numero -> numero > 5;

        double mediaNumerosMaior5 = numeros.stream()
                .filter(isMaior5)
                .reduce(0, Integer::sum) / numeros.stream().filter(isMaior5).count();

        // Desafio 6 - Verificar se a lista contém algum número maior que 10:
        boolean isMaior10 = numeros.stream()
                .allMatch(numero -> numero > 10);

        // Desafio 7 - Encontrar o segundo número maior da lista:
        Integer segundoMaiorNumero = listaNumerosOrdenados.stream()
                .distinct() // Retirar números repetidos
                .sorted(Comparator.reverseOrder()) // Invertendo a ordem
                .skip(1) // Pulando o primeiro número (maior da lista)
                .findFirst() // Pegando o próximo número
                .orElse(null); // Retorna null caso não encontre nenhum número

        // Desafio 8 - Soma dos dígitos de todos os números da lista:
        int listaDigitos = numeros.stream()
                .map(numero -> String.valueOf(numero)) // Converte o número para uma string
                .flatMap(numero -> Arrays.stream(numero.split(""))) // Converte a string para um stream de caracteres
                .mapToInt(Integer::parseInt) // Converte o caracter para um inteiro
                .sum(); // Soma todos os inteiros

        // Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        boolean todosDistintos = numeros.stream()
                .distinct() // Retira os números repetidos
                .count() == numeros.size(); // Verifica se o número de elementos é igual ao número de elementos da lista original


        // Desafio 10 - Agrupar os valores ímpares múltiplos de 3 ou de 5:
        List<Integer> listaImparesMultiplos3Ou5 = numeros.stream()
                .filter(numero -> numero % 3 == 0 || numero % 5 == 0) // Filtra os números que são múltiplos de 3 ou de 5
                .toList();

        System.out.println("Desafio 01 - Lista ordem numérica: " + listaNumerosOrdenados);
        System.out.println("Desafio 02 - A soma dos números pares é: " + resultadoSoma);
        System.out.println("Desafio 03 - A lista contém números negativos? " + possuiNegativos);
        System.out.println("Desafio 04 - Lista de números pares: " + listaNumerosPares);
        System.out.println("Desafio 05 - Média dos números maiores que 5: " + mediaNumerosMaior5);
        System.out.println("Desafio 06 - Existem números na lista maiores do que 10? " + isMaior10);
        System.out.println("Desafio 07 - Segundo maior número da lista: " + segundoMaiorNumero);
        System.out.println("Desafio 08 - Soma dos dígitos de todos os números da lista: " + listaDigitos);
        System.out.println("Desafio 09 - Todos os números da lista são distintos? " + todosDistintos);
        System.out.println("Desafio 10 - Lista de números ímpares múltiplos de 3 ou de 5: " + listaImparesMultiplos3Ou5);
    }
}