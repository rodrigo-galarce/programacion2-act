package Implementacion;

import Interfaces.PilaTDA;

public class PilaEstatica implements PilaTDA {
    public static final int MAX = 100;
    private int[] datos;
    private int cantidad; // variable auxiliar

    @Override
    public void inicializarPila() {
        datos = new int[MAX];
        cantidad = 0;
    }

    @Override
    public void apilar(int x) {
        if (cantidad < MAX) {
            for (int i = cantidad; i > 0; i--) {
                datos[i] = datos[i - 1]; // mueve a la derecha
            }
            datos[0] = x; //El tope siempre queda en 0
            cantidad++;
        }
    }

    @Override
    public void desapilar() {
        if (!pilaVacia()) {
            for (int i = 0; i < cantidad - 1; i++) {
                datos[i] = datos[i + 1]; // corre a la izquierda
            }
            cantidad--;
        }
    }

    @Override
    public boolean pilaVacia() {
        return cantidad == 0;
    }

    @Override
    public int tope() {
        return datos[0];
    }

    public int getCantidad() {
        return cantidad;
    }
}