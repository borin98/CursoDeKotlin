import java.util.*

fun contaVogaisEConsoantes ( str : String )
{

    var vogais = "aeiou"
    var conso = 0
    var vogal = 0

    for ( letra in str )
    {
        if ( letra in vogais )
        {

            vogal += 1

        }

        else
        {

            conso += 1

        }

    }

    println ( "Número de vogais : $vogal " )
    println( "Número de consoantes : $conso " )

}

fun main (args : Array<String> )
{

    val scan : Scanner = Scanner(System.`in`)
    var str : String

    print("Digite uma String : ")
    str = scan.nextLine().trim()
    str = str.toLowerCase()
    contaVogaisEConsoantes ( str )



}