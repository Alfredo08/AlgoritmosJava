public class StringAEntero {
    public static int stoi( String texto ){

        for( int i = 0; i < texto.length(); i ++ ){
            System.out.println( texto.charAt( i ) - '0' );
            if( texto.charAt( i ) - '0' < 0 || texto.charAt( i ) - '0' > 9 ){
                System.out.println( "No se pudo convertir el string" );
                return 0;
            }
        }

        int acumulado = 0;

        for( int i = 0; i < texto.length(); i ++ ){
            int suma =  (texto.charAt( i ) - '0') * potencia( 10, texto.length() - 1 - i );
            acumulado += suma;
        }

        return acumulado;
    }

    public static int potencia( int num, int pot ){
        int resultado = 1;

        for( int i = 0; i < pot; i ++ ){
            resultado *= num;
        }

        return resultado;
    }
    public static void main( String args[] ){
        String texto = "12345";
        int resultado = stoi( texto );
        System.out.println( resultado );
    }
}

// Crear una función que recibe como parámetro un string
// Esta función debe de transformar el string a número entero y retornarlo como valor
// En caso de que el string contenga algún carácter que no es un número, 
// imprimir “No se pudo convertir el string” y retornar un 0
// BONUS: la función transforma de string a double