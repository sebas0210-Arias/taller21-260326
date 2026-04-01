public class Lista {
    Nodo cabeza;

    public Lista() {
        cabeza = null;
    }

    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public long sumar() {
        long suma = 0;
        Nodo actual = cabeza;

        while (actual != null) {
            suma += actual.valor;
            actual = actual.siguiente;
        }

        return suma;
    }
}


