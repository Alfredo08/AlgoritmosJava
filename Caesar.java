public class Caesar {
    public static String decodificar( String input, int shift, boolean encode ){
        char letras[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        if( shift >= -25 && shift <= 25 ){
            String resultado = "";
            input = input.toUpperCase();

            if( !encode ){
                shift *= -1;
            }
            for( int i = 0; i < input.length(); i ++ ){
                char letra = input.charAt( i );
                if( letra == '?' || letra == '¿' || letra == '¡' || letra == '!' || letra == '.' || letra == ',' || letra == ' ' ){
                    resultado += letra;
                }
                else{
                    int indice = letra - 'A';
                
                    if( shift >= 0 ){
                        if( indice + shift <= 25 ){
                            resultado += letras[ indice + shift ];
                        }
                        else{
                            resultado += letras[ indice + shift - 25 - 1 ];
                        }
                    }
                    else{
                        if( indice + shift >= 0 ){
                            resultado += letras[ indice + shift ];
                        }
                        else{
                            resultado += letras[ 25 + indice + shift + 1 ];
                        }
                    }
                }
                
            }
            if( encode ){
                System.out.println( "Encodificando " + input );
            }
            else{
                System.out.println( "Decodificando " + input );
            }
            return resultado;
        }
        else{
            return "No se puede encodificar/decodifcar debido a un recorrimiento incorrecto";
        }
    }

    public static void main( String args[] ){
        String input = "¿HOLA, COMO ESTAS?";
        int shift = 3;
        System.out.println( decodificar(input, shift, true) );
    }
}
