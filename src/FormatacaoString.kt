import java.util.*

// exemplo de como manusear strings

fun main ( args : Array < String > )
{

    val scan = Scanner ( System.`in` )

    println("Digite outra mensagem : ")
    val nome = scan.nextLine().trim()

    println("Você digitou $nome \n")

    // concatenando strings

    print("Digite outra mensagem : ")
    val nome2 = scan.nextLine().trim()

    print("Você digitou uma string de tamanho ${ nome2.length }")

}