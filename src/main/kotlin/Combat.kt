fun combat(creature: Creature, player: Player){
    while (creature.hp > 0 && player.hp > 0 && creature != player){
        checkInput(creature, player)
        if (creature.hp > 0){
            creature.attack(creature,player)
            if (player.hp <= 0){
                println("Oh dear, you are dead!")
                break
            }
        }
        TURNS++
    }
    if (creature.hp <= 0) {
        println("You killed the monster! You gain ${creature.xp} xp!")
        player.xp += creature.xp
        player.levelup()
        TURNS = 0
    }
}
fun checkInput(creature: Creature, player: Player){
    println("Turn : $TURNS")
    println("${player.name}'s HP : ${player.hp}, ${creature.name} HP : ${creature.hp}")
    println("Choose your action:")
    println("1) Attack")
    println("2) Use potion")
    println("3) Cast spell")
    when(readlnOrNull()?.lowercase()?.trim()){
        "1" -> player.attack(player,creature)
        "attack" -> player.attack(player,creature)
        "2" -> player.usePotion(player)
        "potion" -> player.usePotion(player)
        "3" -> player.castSpell(player,creature)
        "open inventory" -> player.openInv()
    }
}