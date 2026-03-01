import java.util.Arrays;
import java.util.List;

public class desafio08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 8 - Soma dos dígitos de todos os números da lista:
        int listaDigitos = numeros.stream()
                .map(numero -> String.valueOf(numero)) // Converte o número para uma string
                .flatMap(numero -> Arrays.stream(numero.split(""))) // Converte a string para um stream de caracteres
                .mapToInt(Integer::parseInt) // Converte o caracter para um inteiro
                .sum(); // Soma todos os inteiros

        System.out.println("A soma dos dígitos de todos os números da lista é: " + listaDigitos);
    }
}
