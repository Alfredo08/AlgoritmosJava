
/*
    Escribir una función que recibe dos parámetros: el primero es un arreglo de números,
    el segundo es un número entero. Esta función debe de imprimir las parejas de números
    dentro del arreglo que sumen el número entero proporcionado.

    Ejemplo:
        [2, 6, 3, 9, 11] , 9
        (6,3)

        [2, 4, 3, 5, 6, -2, 4, 7, 8, 9] , 7
        (2,5) (4,3) (3,4) (-2,9)
*/
public class EncontrarParesDeNumeros{
    public static void encuentraPares( int numeros[], int num ){
        for( int i = 0; i < numeros.length - 1; i ++ ){
            for( int j = i + 1; j < numeros.length; j ++ ){
                if( numeros[i] + numeros[j] == num ){
                    System.out.print( "(" + numeros[i] + "," + numeros[j] + ") " );
                }
            }
        }
    }
    public static void main( String args[] ){
        int numeros[] = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        int num = 7;

        encuentraPares( numeros, num );
    }
}