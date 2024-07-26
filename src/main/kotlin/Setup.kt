fun playerCreation() : Player {
    return Player(hp = 30, xp = 0, mana = 30, level = 1, attack = 10)
}
fun monsterCreation() : Creature {
    return Creature(hp = 30, xp = 10, attack = 10, level = 0)
}