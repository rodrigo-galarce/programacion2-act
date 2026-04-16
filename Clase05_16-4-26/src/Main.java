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
    }
    System.out.println(pila1.tope());

    PilaEstatica pilaAux = new PilaEstatica();
    pilaAux.inicializarPila();
    System.out.println("Pila aux: ");
    for (int i = 0; i < pila1.getCantidad(); i++) {
        pilaAux.apilar(pila1.tope());
        pila1.desapilar();
        System.out.println(pilaAux.tope());
    }

    PilaTDA pila2 = new PilaDinamica();
    pila2.inicializarPila();
    System.out.println("Pila dinamica: ");
    for (int i = 0; i < pilaAux.getCantidad(); i++) {
        pila2.apilar(pilaAux.tope());
        pilaAux.desapilar();
        System.out.println(pila2.tope());

    }

}