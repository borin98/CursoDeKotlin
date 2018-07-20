package Pacotes

import java.util.*

fun myPackage ( ) = println("Olá")
fun myPackage2 (  ) = println("Olá visitante")

fun main ( args : Array < String > )
{
    // pegando o dia do sistema
    val calendar : Calendar = Calendar.getInstance()
    println("Ano : ${ calendar.get ( Calendar.YEAR ) }")



}