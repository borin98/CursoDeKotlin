import java.util.*

// função similares as lambdas do java
fun helloCurto() = println("Hello")
fun toUpperCurto ( str: String ) : String = str.toUpperCase()

fun comparacaoMenor ( n1 : Int, n2: Int ) : Int =
        if ( n1 > n2 ) n1
            else n2

fun hello ( )
{

    println("Hello")

}

fun toUpper ( str : String ) : String
{

    return str.toUpperCase()

}

fun main ( args : Array < String > )
{

    hello()

    val scan = Scanner(System.`in`)

    print("Digite algo : ")
    val str = scan.nextLine().trim()
    val strMaiusculo = toUpper ( str )

    println("String sem modificação : $str")
    println("String com toUpper : $strMaiusculo")

    print("Digite um número : ")
    val n1 = scan.nextInt()

    print("Digite outro número : ")
    val n2 = scan.nextInt()

    println("O menor número é : ${comparacaoMenor(n1, n2)}")

}