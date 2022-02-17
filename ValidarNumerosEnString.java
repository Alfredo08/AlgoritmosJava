
/*
    Crear una función que recibe como parámetro un string. Esta función se encarga de
    validar que el string contenga únicamente números. No hacer uso de casting o métodos
    existentes que conviertan un string a número. Utilizar la tabla de ASCII
*/
public class ValidarNumerosEnString{

    public static boolean validaString( String texto ){

        for( int i = 0; i < texto.length(); i ++ ){
            int numero = texto.charAt( i );

            if( (numero < 48 || numero > 57) && numero != 46 ){
                return false;
            }
        }

        return true;
    }
    public static void main( String args[] ){
        String texto = "82736374.234";
        System.out.println( validaString( texto ) );
    }
}