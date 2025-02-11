public class Arrays {
    public static void main(String[] args) {
        OperacionesConArrays op = new OperacionesConArrays();

        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println(op.mostrarElementos(a));
        System.out.println("La suma de los elementos del arreglo es: " + op.sumarElementos(a));
        System.out.println("El promedio de los elementos del arreglo es: " + op.promedioElementos(a));
    }

    }
    

