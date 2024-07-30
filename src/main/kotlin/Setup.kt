val cardinalDirection = listOf("North", "South", "West", "East")
var allMonsters : MutableList<Creature> = mutableListOf()

fun playerName() : String{
    println("Type in your name : ")
    return readln()
}
fun playerCreation(name : String) : Player {
    return Player(name,hp = 30, xp = 0, mana = 30, level = 1, attack = 10, inv = mutableListOf(), position = Position(0,0))
}
fun monsterCreation(name : String) : Creature {
    val monster = Creature(name.reversed(), hp = 30, xp = 10, attack = 10, level = 0, position = Position(1,1))
    allMonsters.add(monster)
    return monster
}

fun spawnPotions(names : List<String>): MutableList<Potion> {
    var potions : MutableList<Potion> = mutableListOf()
    names.forEachIndexed{index, s ->
        if (s.contains("Greater")){
            potions.add(Potion(index,true,"dsec", s, 20))
        }
        else {
            potions.add(Potion(index,true,"dsec", s, 10))
        }
    }
    return potions
}
fun printForEach(list: List<String>, format: (String) -> String){
    list.forEachIndexed{index, s ->
        println(format(s))
    }
}