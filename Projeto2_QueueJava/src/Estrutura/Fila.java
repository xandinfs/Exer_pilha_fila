package Estrutura;

import Basica.Processo;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Fila {
    private Queue<Processo> fila;

    public Fila() {
        fila = new LinkedList<>();
    }

    public void adicionar(Processo processo) {
        fila.add(processo);
        System.out.println("Processo adicionado!");
    }

    public Processo remover() {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia!");
            return null;
        }

        return fila.remove();
    }

    public Processo verificar() {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia!");
            return null;
        }

        return fila.peek();
    }

    public void mostrar() {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia!");
            return;
        }

        System.out.println("\n--- FILA ---");

        for (Processo processo : fila) {
            System.out.println(processo);
        }
    }

    public void inverter() {
        Stack<Processo> pilha = new Stack<>();

        while (!fila.isEmpty()) {
            pilha.push(fila.remove());
        }

        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }

        System.out.println("Fila invertida!");
    }
}
