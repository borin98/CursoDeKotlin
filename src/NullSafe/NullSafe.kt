package NullSafe

fun erroProposital ( str : String? )
{

    // assumindo o erro, mesmo que o programa pare
    println(str!!.length)

}

fun main ( args : Array < String > )
{
    // validando a variável como nula
    val str : String? = null

    // printando o valor da string
    println(str?.length)

    if ( str != null )
    {

        println(str.length)

    }

    val n1 = NullExampleJava()
    // printando os atributos dela
    println(n1.age)
    println(n1.name)

    // printando o null point de n2
    val n2 = NullExampleJava.getInstance()
    println(n2?.age)
    println(n2?.name?.length)


    erroProposital ( str )

}