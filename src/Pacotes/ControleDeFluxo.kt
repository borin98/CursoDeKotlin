package Pacotes

import java.util.*

fun oqueAconteceu ( year : Int ) : String
{

    if ( year == 2017 )
    {

        return "Ano de 2017"

    }

    return "Ano diferente de 2017"

}

fun oqueAconteceuWhen ( year : Int ) : String = when ( year ) {

        2017 ->{

            "Ano de 2017"

        }
        2018, 2019, 2020 ->{

            " É um ano entre 2017 e 2020"

        }

        else -> "Não sei qual é o ano"

    }

fun whatHapnned ( year: Int ) : String
{

    when
    {

        year == 2017 -> return "Ano de 2017"
        else -> return "Ano diferente de 2017"

    }

}

fun controleFluxo ( )
{

    val calendar : Calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)

    println(oqueAconteceuWhen(year))
    println(whatHapnned(year))
}