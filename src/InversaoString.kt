import java.util.*

fun inverterStr ( str : String ) : String
{

    val tam = ( str.length - 1 ) downTo 0
    var aux = ""

    for ( i in tam )
    {

        aux += str[i]

    }

    return aux

}

fun main(args : Array<String> )
{

    val scan : Scanner = Scanner(System.`in`)
    val str : String

    print("Digite uma String : ")
    str = scan.nextLine().trim()

    val resp = inverterStr( str )

    println("Valor da string : $str ")
    println("Valor da string invertida : $resp")

}