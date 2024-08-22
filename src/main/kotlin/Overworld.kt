class Overworld(val sizeX: Int, val sizeY: Int, val creatureList: List<Creature>) {

    fun drawMap() {
        for (x in 0 until sizeX) {
            for (y in 0 until sizeY) {
                val currentPosition = Position(x, y)
                val creature = creatureList.find { it.position == currentPosition }

                if (creature != null) {
                    print(" ${creature.icon} ")
                } else {
                    print(" X ")
                }
            }
            println()
        }
    }
}
