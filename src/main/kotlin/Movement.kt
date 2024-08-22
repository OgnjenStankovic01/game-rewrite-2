fun explore(player: Player){
    while (player.hp > 0){
        val overworld = Overworld(5, 5, allMonsters)
        overworld.drawMap()
        println("Choose where to move: (X = ${player.position.x}, Y=${player.position.y})")
        printForEach(cardinalDirection) { it }
        when(readlnOrNull()?.lowercase()?.trim()){
            "1" -> player.position.moveX(true)
            "north" -> player.position.moveX(true)
            "2" -> player.position.moveX(false)
            "south" ->  player.position.moveX(false)
            "3" -> player.position.moveY(false)
            "west" -> player.position.moveY(false)
            "4" -> player.position.moveY(true)
            "east" -> player.position.moveY(true)
            else -> println("Invalid direction, try again")
        }
        val encounteredCreature = allMonsters.find { it.position == player.position }
        if (encounteredCreature != null) {
            combat(encounteredCreature, player)
            if (encounteredCreature.hp <= 0) {
                allMonsters.remove(encounteredCreature)
            }
        }
    }
}
