/*
   Crear una función que reciba como parámetro un string. Esta función se encarga
   de returnar el caracter más repetido dentro del string. Si hay un empate retornar
   únicamente uno de ellos. 
   "Hola mea gusta mucho programaare." => 
*/

import java.util.HashMap;

public class CaracterMasRepetido{

   public static char encuentraCaracterMasRepetido( String texto ){
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
      int repeticiones = 0;
      char resultado = ' ';

      for( char letra : letras.keySet() ){
         if( repeticiones < letras.get( letra ) ){
            repeticiones = letras.get( letra );
            resultado = letra;
         }
      }

      return resultado;
   }
   public static void main( String args[] ){
      String texto = "Hola mea gusta mucho programaare.";
      System.out.println( "El caracter más repetido es: " + encuentraCaracterMasRepetido(texto ) );
   }
}