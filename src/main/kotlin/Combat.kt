import java.util.*

fun combat(creature: Creature, player: Player){
    while (creature.hp > 0 && player.hp > 0){
        checkInput(creature, player)
    }
    println("You killed the monster! You gain ${creature.xp} xp!")
    player.xp += creature.xp
    player.levelup()
}
fun checkInput(creature: Creature, player: Player){
    println("${player.name}'s HP : ${player.hp}, Monster HP : ${creature.hp}")
    println("Choose your action:")
    println("1) Attack")
    println("2) Use potion")
    println("3) Open inventory")
    when(readlnOrNull()?.lowercase()?.trim()){
        "1" -> player.attack(player,creature)
        "attack" -> player.attack(player,creature)
        "2" -> player.usePotion(player)
        "potion" -> player.usePotion(player)
        "3" -> player.openInv()
        "open inventory" -> player.openInv()
    }
}