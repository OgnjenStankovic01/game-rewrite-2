import java.util.*

fun combat(creature: Creature, player: Player){
    while (creature.hp > 0 && player.hp > 0){
        println("${player.name}'s HP : ${player.hp}, Monster HP : ${creature.hp}")
        println("Choose your action:")
        println("1) Attack")
        val input = readlnOrNull()?.lowercase()?.trim()
        if (input == "1" || input == "attack") {
            player.attack(player,creature)
        }
        else println("Not a valid option")
    }
    println("You killed the monster! You gain ${creature.xp} xp!")
    player.xp += creature.xp
    player.levelup()
}
fun checkInput(creature: Creature, player: Player){
    when(readlnOrNull()?.lowercase()?.trim()){
        "1" -> player.attack(player,creature)
        "attack" -> player.attack(player,creature)
        "2" -> player.usePotion()
        "potion" -> player.usePotion()
    }
}