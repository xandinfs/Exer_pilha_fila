package Estrutura;

import Basica.Processo;

public class Pilha {
    private Processo[] pilha;
    private int topo;

    public Pilha(int capacidade) {
        pilha = new Processo[capacidade];
        topo = -1;
    }

    public void empilhar(Processo processo) {
        if (topo == pilha.length - 1) {
            System.out.println("Pilha cheia!");
            return;
        }

        topo++;
        pilha[topo] = processo;
        System.out.println("Processo empilhado!");
    }

    public Processo desempilhar() {
        if (topo == -1) {
            System.out.println("Pilha vazia!");
            return null;
        }

        Processo processo = pilha[topo];
        pilha[topo] = null;
        topo--;

        return processo;
    }

    public Processo verificarTopo() {
        if (topo == -1) {
            System.out.println("Pilha vazia!");
            return null;
        }

        return pilha[topo];
    }

    public void imprimir() {
        if (topo == -1) {
            System.out.println("Pilha vazia!");
            return;
        }

        System.out.println("\n--- PILHA ---");

        for (int i = topo; i >= 0; i--) {
            System.out.println(pilha[i]);
        }
    }
}
