fun playerCreation() : Player {
 var creatureList = listOf(Player(hp = 30, xp = 0, mana = 30, level = 1, attack = 10))
    return creatureList[0]
}
fun monsterCreation() : Creature {
    var creatureList = listOf(Creature(hp = 30, xp = 10, attack = 10, level = 0))
    return creatureList[0]
}