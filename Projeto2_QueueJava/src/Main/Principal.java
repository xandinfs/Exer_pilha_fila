package Main;

import Basica.Processo;
import Estrutura.Fila;

public class Principal {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adicionar(new Processo(1, "Documento 1"));
        fila.adicionar(new Processo(2, "Documento 2"));
        fila.adicionar(new Processo(3, "Documento 3"));
        fila.adicionar(new Processo(4, "Documento 4"));

        fila.mostrar();

        System.out.println("\nPrimeiro da fila:");
        System.out.println(fila.verificar());

        System.out.println("\nRemovendo:");
        System.out.println(fila.remover());

        fila.mostrar();

        fila.inverter();
        fila.mostrar();
    }
}
