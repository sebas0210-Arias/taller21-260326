
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Nodo cabeza = null;
        Nodo actual = null;  
        
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

    }
        
        
    }
}
