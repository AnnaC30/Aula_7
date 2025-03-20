package Aula_7.Atividade_3;

import Aula_7.Atividade_1.Pilha;
import Aula_7.Atividade_2.Empregado;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha(5);

        System.out.println("Cadastro de Empregados");
        System.out.println("---------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEmpregado " + (i + 1) + ":");

            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            Empregado empregado = new Empregado(matricula);
            empregado.setNome(nome);
            empregado.setSalario(salario);

            try {
                pilha.adicionar(empregado);
                System.out.println("Empregado adicionado à pilha com sucesso!");
            } catch (IllegalStateException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();

        System.out.println("\nEmpregados na pilha:");
        while (pilha.getNumElements() > 0) {
            Empregado empregado = (Empregado) pilha.remover();
            System.out.println(empregado.toString());
        }
    }
}