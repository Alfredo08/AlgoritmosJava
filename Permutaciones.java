public class Permutaciones {

}
/*

"abc"

permutacion( palabra, acumulado )
RONDA 1
permutacion( "abc", "" )
if ( palabra.length() == 0 )
    return acumulado
else
    ciclo 0 a la longitud de la palabra
    ch = 'a'  caracter en indice i
    restoLetras = "bc"
    permutacion( restoLetras, acumulato + ch )

    PENDIENTE
    ch = 'b'
    restoLetras = "ac"

    ch = 'c'
    restoLetras = "ab"

RONDA 2
permutacion( "bc", "a")
if ( palabra.length() == 0 )
    return acumulado
else
    ciclo 0 a la longitud de la palabra
    ch = 'b'  caracter en indice i
    restoLetras = "c"
    permutacion( "c", 'a' + 'b' )

    PENDIENTE
    ch = 'c'
    restoLetras = 'b'
    permutacion( "b", "a" + "c")

RONDA 3
permutacion( "c", "ab" )
if ( palabra.length() == 0 )
    return acumulado
else
    ciclo 0 a la longitud de la palabra
    ch = 'c'  caracter en indice i
    restoLetras = ""
    permutacion( "", "ab" + 'c' ) 
    
RONDA 4
permutacion( "", "abc" )
if ( palabra.length() == 0 )
    System.out.println( acumulado ) ===> "abc"
    
    
RONDA 5
permutacion( "b", "ac")
if ( palabra.length() == 0 )
    return acumulado
else
    ciclo 0 a la longitud de la palabra
    ch = 'b'  caracter en indice i
    restoLetras = ""
    permutacion( "", "ac" + 'b' ) 
    
RONDA 6
permutacion( "", "acb" )
if ( palabra.length() == 0 )
    System.out.println( acumulado ) ===> "acb"
    */


