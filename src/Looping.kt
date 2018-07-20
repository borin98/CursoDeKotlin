fun main ( args : Array<String> )
{

    println("\n-------------- Laço com For -----------------------\n")

    val intervalo = 1..10

    for ( i in 1..10 )
    {

        println( i )

    }

    var index = 1

    println("\n-------------- Laço com While -----------------------\n")

    while (index < 10)
    {

        println(index)
        index++
        
    }

    println("\n-------------- Laço com Do -----------------------\n")
    index = 1

    do
    {
        println(index)
        index++

    }while (index < 10)

    println("\n-------------- Laço com For Invertido -----------------------\n")
    val intervaloInvertido = 100 downTo 1
    for ( i in intervaloInvertido )
    {

        println( i )

    }

}