fun explore(player: Player){
    while (player.hp > 0){
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
        }
        allMonsters.forEach{
            if (it.position == player.position) {
                combat(it,player)
            }
        }
    }
}
fun checkPosition(player: Player, monsters : MutableList<Creature>) : Boolean{
    monsters.forEach{
        if (it.position == player.position){
            return true
        }
    }
  return false
}
