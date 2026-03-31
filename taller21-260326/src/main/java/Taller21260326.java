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

        Nodo cabeza = null;
        Nodo actual = null;  
      //lista enlazada  
    for( int i=1; i <n-2;i++){
        int num= sc.nextInt();
         Nodo nuevo = new Nodo(num);
         
         if(cabeza==null){
             cabeza=nuevo;
             actual=nuevo;
           
         }else{
             actual.siguiente=nuevo;
             actual=nuevo;
            
         }
          long expected = (long) n * (n + 1) / 2;

    }
        
        
    }
}
