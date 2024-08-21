class Overworld(val sizeX : Int,val sizeY : Int, val creatureList : List<Creature>)
{
    fun drawMap(player: Player){
        for (x in 0..sizeX){
            for (y in 0..sizeY){
                var currentPosition = Position(x,y)
                allMonsters.forEach {
                    if (it.position == currentPosition){
                        print(" ${it.icon} ")
                    }
                    else print(" X ")
                }
            }
            println()
        }
    }
}