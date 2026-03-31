//commit
   import java.util.Scanner;

public class Taller21260326 {

    // Definición del nodo
    static class Nodo {
        int valor;
        Nodo siguiente;

        Nodo(int valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }
    // clase lista
static class Lista {
        Nodo cabeza;
        void insertar(int valor) {
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

        int sumar() {
            int suma = 0;
            Nodo actual = cabeza;

            while (actual != null) {
                suma += actual.valor;
                actual = actual.siguiente;
            }

            return suma;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Lista lista = new Lista();

        // leer n-1 números
        for (int i = 0; i < n - 1; i++) {
            lista.insertar(sc.nextInt());
        }
        int sumaLista = lista.sumar();

        long sumaTotal = (long) n * (n + 1) / 2;

        long faltante = sumaTotal - sumaLista;

        System.out.println(faltante);
    }
}
//no inicializa correctamente
        
     