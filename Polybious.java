
import java.util.Collection;
import java.util.HashMap;

public class Polybious {
    public static String cipher( String texto, boolean cifrado ){
        HashMap<String, String> codigos = new HashMap<String, String>();
        String letras[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String numeros[] = {"11", "21", "31", "41", "51", "12", "22", "32", "42", "42", "52", "13", "23", "33", "43", "53", "14", "24", "34", "44", "54", "15", "25", "35", "45", "55"};

        for( int i = 0; i < letras.length; i ++ ){
            codigos.put( letras[i], numeros[i] );
            if( !numeros[i].equals( "42" ) ){
                codigos.put( numeros[i], letras[i] );
            }
        }

        // Encodificar el texto
        String resultado = "";
        if( cifrado ){
            texto = texto.toUpperCase();
            for( int i = 0; i < texto.length(); i ++ ){
                String letra = texto.charAt( i ) + "";
                if( letra.equals("?") || letra.equals("¿") || letra.equals("¡") || letra.equals("!") || letra.equals(".") || letra.equals(",") || letra.equals(" ") ){
                    resultado += letra;
                }
                else{
                   resultado += codigos.get( letra ); 
                }              
            }
        }
        else{
            // Decodificar el texto (numeros)
            String arregloCodigo [] = texto.split( "([.,!¿¡?:;'\"-]|\\s)+" ) ; // Hacer el split con los demás símbolos de puntuación

            // Validar que los números tengan su pareja de columna/renglon
            System.out.println( arregloCodigo.length );
            for( int i = 0; i < arregloCodigo.length; i ++ ){
                if ( arregloCodigo[i].length() % 2 == 1 ){
                    return "Hay un error con el cifrado, no se puede decifrar.";
                }
            }
            
            for( int i = 0; i < texto.length(); i += 2 ){
                if( texto.charAt( i ) == ' ' || texto.charAt( i ) == '?' || texto.charAt( i ) == '¿' || texto.charAt( i ) == '¡' || texto.charAt( i ) == '!' || texto.charAt( i ) == '.' || texto.charAt( i ) == ','  ){
                    resultado += texto.charAt( i );
                    i --;
                }
                else{
                    resultado += codigos.get( texto.substring( i, i + 2) );
                }   
            }
        }
        return resultado;
    }

    public static void main( String[] args ){
        System.out.println( cipher( "32431311, ¿31432343 5134441134?", false ) );
    }
}
