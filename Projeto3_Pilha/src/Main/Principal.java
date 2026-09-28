package Main;

import Basica.Processo;
import Estrutura.Pilha;

public class Principal {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(10);

        pilha.empilhar(new Processo(1, "Documento 1"));
        pilha.empilhar(new Processo(2, "Documento 2"));
        pilha.empilhar(new Processo(3, "Documento 3"));
        pilha.empilhar(new Processo(4, "Documento 4"));

        pilha.imprimir();

        System.out.println("\nTopo da pilha:");
        System.out.println(pilha.verificarTopo());

        System.out.println("\nDesempilhando:");
        System.out.println(pilha.desempilhar());

        pilha.imprimir();
    }
}
