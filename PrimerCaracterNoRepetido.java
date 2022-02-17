import java.util.HashMap;
/*
    Crear una funcion que reciba como parámetro un string. Esta función se encarga
    de retornar el primer caracter que no se encuentre repetido en el string. En caso
    de que todos los caracteres se repitan, retornar un null.

    Ejemplo:
        "Holla me gusta mucho programare." => 'l'
*/
public class PrimerCaracterNoRepetido{

    public static char encuentraCaracterNoRepetido( String texto ){
        HashMap<Character, Integer> letras = new HashMap<Character, Integer>();
        texto = texto.toLowerCase();

        for( int i = 0; i < texto.length(); i ++ ){
            char letra = texto.charAt(i);
            if ( letras.get( letra ) == null ){
                letras.put( letra, 1 );
            }
            else{
                int conteo = letras.get( letra );
                conteo ++;
                letras.put( letra, conteo );
            }
        }
        /*
        for( char letra : letras.keySet() ){
            System.out.println( letra + " : " + letras.get( letra ) );
        } */

        for( int i = 0; i < texto.length(); i ++ ){
            if( letras.get(texto.charAt(i)) == 1 ){
                return texto.charAt(i);
            }
        }

        return ' ';
    }
    public static void main( String args[] ){
        char resultado = encuentraCaracterNoRepetido("Holla me gusta mucho programare.");
        System.out.println( resultado );
    }
}