fun playerName() : String{
    println("Type in your name : ")
    return readln()
}
fun playerCreation(name : String) : Player {
    return Player(name,hp = 30, xp = 0, mana = 30, level = 1, attack = 10)
}
fun monsterCreation(name : String) : Creature {
    return Creature(name.reversed(), hp = 30, xp = 10, attack = 10, level = 0)
}