package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algo: ");
        String input = scanner.nextLine();
        System.out.println("Você digitou: " + input);
    }
}