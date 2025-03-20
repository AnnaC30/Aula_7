package Aula_7.Atividade_1;

public class Atividade1 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(3);

        try {
            pilha.adicionar("Primeiro");
            pilha.adicionar("Segundo");
            pilha.adicionar("Terceiro");

            System.out.println("Número de elementos: " + pilha.getNumElements());

            System.out.println("Removido: " + pilha.remover());
            System.out.println("Removido: " + pilha.remover());

            System.out.println("Número de elementos: " + pilha.getNumElements());

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}   