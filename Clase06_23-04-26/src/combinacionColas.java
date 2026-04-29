public ColaPrioridad combinacionColas(ColaPrioridad CP1, ColaPrioridad CP2) {

    ColaPrioridad CP3 = new ColaPrioridad();
    CP3.InicializarColaPrioridad();

    ColaPrioridad aux = new ColaPrioridad();
    aux.InicializarColaPrioridad();

    int x, p;

    // se procesa CP1
    while (!CP1.ColaVacia()) {
        x = CP1.Primero();
        p = CP1.Prioridad();
        CP1.Desacolar();

        CP3.AcolarPrioridad(x, p);
        aux.AcolarPrioridad(x, p);
    }

// se restaura CP1 para que “quede intacta”
    while (!aux.ColaVacia()) {
        x = aux.Primero();
        p = aux.Prioridad();
        aux.Desacolar();

        CP1.AcolarPrioridad(x, p);
    }

// lo mismo con CP2
    while (!CP2.ColaVacia()) {
        x = CP2.Primero();
        p = CP2.Prioridad();
        CP2.Desacolar();

        CP3.AcolarPrioridad(x, p);
        aux.AcolarPrioridad(x, p);
    }

    while (!aux.ColaVacia()) {
        x = aux.Primero();
        p = aux.Prioridad();
        aux.Desacolar();
        CP2.AcolarPrioridad(x, p);
    }

    return CP3;
}
