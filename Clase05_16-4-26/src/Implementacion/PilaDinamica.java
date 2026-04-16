package Implementacion;

import Interfaces.PilaTDA;

public class PilaDinamica implements PilaTDA {
    private Node tope;

    @Override
    public void inicializarPila() {
        tope = null;
    }

    @Override
    public void apilar(int x) {
        Node node = new Node(x, tope);
        tope = node;
    }

    @Override
    public void desapilar() {
        if (!pilaVacia()) {
            tope = tope.getNext();
        }
    }

    @Override
    public int tope() {
        return tope.getData();
    }

    @Override
    public boolean pilaVacia() {
        return tope == null;
    }

}
