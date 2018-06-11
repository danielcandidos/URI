package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var jogos = 0
    var winInter = 0
    var winGremio = 0

    var newGrenal = 1

    while(newGrenal == 1) {
        val golsInter = input.nextInt()
        val golsGremio = input.nextInt()

        when {
            golsInter > golsGremio -> winInter += 1
            golsGremio > golsInter -> winGremio +=1
        }
        jogos += 1

        while (true){
            println("Novo grenal (1-sim 2-nao)")
            val response = input.nextInt()
            if ((response == 1) or (response == 2)){
                newGrenal = response
                break
            }
        }
    }

    val empates = jogos - (winInter + winGremio)

    println("$jogos grenais")
    println("Inter:$winInter")
    println("Gremio:$winGremio")
    println("Empates:$empates")

    when {
        winInter > winGremio -> println("Inter venceu mais")
        winGremio > winInter -> println("Gremio venceu mais")
        else -> println("Nao houve vencedor")
    }
}