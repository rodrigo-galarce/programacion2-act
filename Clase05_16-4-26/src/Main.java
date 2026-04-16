import Implementacion.PilaDinamica;
import Implementacion.PilaEstatica;
import Interfaces.PilaTDA;
import java.util.Random;

void main() {

    PilaEstatica pila1 = new PilaEstatica();
    pila1.inicializarPila();
    Random rand = new Random();
    for (int i = 0; i < PilaEstatica.MAX; i++) {
        pila1.apilar(rand.nextInt(100));
        System.out.print(pila1.tope() + " ");
    }

    // pila auxiliar para no perder el orden
    // al pasar de Pila 1 -> Aux, el orden se invierte
    PilaEstatica pilaAux = new PilaEstatica();
    pilaAux.inicializarPila();

    // while(!pila.pilaVacia()) para vaciarla completamente
    while (!pila1.pilaVacia()) {
        pilaAux.apilar(pila1.tope());
        pila1.desapilar();
    }

    // Al pasar de Aux -> Pila 2 (Dinamica), el orden se invierte de nuevo
    // quedando igual al original.
    PilaTDA pila2 = new PilaDinamica();
    pila2.inicializarPila();

    System.out.println("\n\nContenido en Pila Dinamica (Mismo orden):");
    while (!pilaAux.pilaVacia()) {
        pila2.apilar(pilaAux.tope());
        System.out.print(pila2.tope() + " ");
        pilaAux.desapilar();
    }
}