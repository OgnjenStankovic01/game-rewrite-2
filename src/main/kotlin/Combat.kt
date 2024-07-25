import java.util.*

fun combat(creature: Creature, player: Player){
    while (creature.hp > 0 && player.hp > 0){
        println("Player's HP : ${player.hp}, Monster HP : ${creature.hp}")
        println("Choose your action:")
        println("1) Attack")
        val input = readln().trim().lowercase(Locale.getDefault())
        if (input == "1" || input == "attack") {
            player.attack(creature)
        }
        else println("Not a valid option")
    }
}