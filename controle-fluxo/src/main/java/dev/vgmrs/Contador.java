package dev.vgmrs;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int firstParam = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int secondParam = scanner.nextInt();

        try {
            countNumbers(firstParam, secondParam);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void countNumbers(int firstParam, int secondParam ) throws ParametrosInvalidosException {
        if (firstParam > secondParam) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int count = secondParam - firstParam;

        for (int i=0; i < count; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}