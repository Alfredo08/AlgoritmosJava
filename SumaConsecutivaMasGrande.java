public class SumaConsecutivaMasGrande {
    
    public static int sumaConsecutiva( int numeros [] ){

        int acumulado = numeros[0];
        int conteo = 0;

        for( int i = 0; i < numeros.length; i ++ ){
            conteo += numeros[i];
            if ( conteo > acumulado ){
                acumulado = conteo;
            }
            if ( conteo < 0 ){
                conteo = 0;
            }
        }

        return acumulado;
    }
    public static void main( String args [] ){
        int numeros [] = { 4, 6, -6, 7, 1, -2 };

        System.out.println( sumaConsecutiva( numeros ) );
    }
}

