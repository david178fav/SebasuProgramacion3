
public class Ejecutar {

    public static void main(String[] args) {
        System.out.println("hola mundo UNIAJC!");
        int[] a = { 2, 5, 8, 3, 1, 10, 11 };
        System.out.println(sumaParesImparesArreglo(a));
    }

    public static String sumaParesImparesArreglo(int[] a) {
        int sumaPares = 0, sumaImpares = 0;

        String cad = "";

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sumaPares += a[i];
            } else {
                sumaImpares += a[i];
            }
        }

        cad = "La suma de los números pares = " + sumaPares + " suma de los números impares = " + sumaImpares;
        return cad;
    }

    public static String sumaExtremos(int[] a) {
        String cad= "";
        if (a.length%2==0){
            for (int i=0; i< a.length/2; i++){
                cad += (a[i] + (a[a.length-1]))+"";
            }
        }else{
            cad+="arreglo impar";
        }
        return cad;


    }

}