package dev.vgmrs;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String name = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String agency = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int account = scanner.nextInt();

        System.out.print("Digite o saldo: ");
        String balanceStr = scanner.next().replace(",", ".");
        double balance = Double.parseDouble(balanceStr);

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + account + " e seu saldo " + balance + " já está disponível para saque");

        scanner.close();
    }
}