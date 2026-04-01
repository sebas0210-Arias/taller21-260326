import java.util.Scanner;

public class Taller21260326 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Lista lista = new Lista();

        for (int i = 0; i < n - 1; i++) {
            lista.insertar(sc.nextInt());
        }

        long sumaLista = lista.sumar();

        long sumaTotal = (long) n * (n + 1) / 2;

        long faltante = sumaTotal - sumaLista;

        System.out.println(faltante);

        sc.close();
    }
}
