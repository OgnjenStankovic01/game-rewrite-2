fun explore(player: Player, fighting : Boolean){
    while (player.hp > 0 && !checkPosition(player, allMonsters)){
        println("Choose where to move: ")
        printForEach(cardinalDirection) {"${cardinalDirection.iterator()} $it"}
        when(readlnOrNull()?.lowercase()?.trim()){
            "1" -> player.position.moveX(true)
            "north" -> player.position.moveX(true)
            "2" -> player.position.moveX(false)
            "south" ->  player.position.moveX(false)
            "3" -> player.position.moveY(false)
            "west" -> player.position.moveY(false)
            "4" -> player.position.moveY(true)
            "east" -> player.position.moveY(true)
        }
    }
    if (checkPosition(player,allMonsters) && player.hp > 0) {
       TODO()
    }
}
fun checkPosition(player: Player, monsters : MutableList<Creature>) : Boolean{
    monsters.forEach{
        if (it.position.positionEquality(player.position)){
            return true
        }
    }
  return false
}
