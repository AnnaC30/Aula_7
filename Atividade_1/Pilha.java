package Aula_7.Atividade_1;

public class Pilha {
    private Object[] elementos;
    private int numElements;

    public Pilha(int num) {
        elementos = new Object[num];
        numElements = 0;
    }

    public int getNumElements() {
        return numElements;
    }

    public void adicionar(Object o) throws IllegalStateException {
        if (numElements == elementos.length) {
            throw new IllegalStateException("Pilha cheia");
        }
        elementos[numElements] = o;
        numElements++;
    }

    public Object remover() {
        if (numElements == 0) {
            throw new IllegalStateException("Pilha vazia");
        }
        numElements--;
        Object removido = elementos[numElements];
        elementos[numElements] = null;
        return removido;
    }
}