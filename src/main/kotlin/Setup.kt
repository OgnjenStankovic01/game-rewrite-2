import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import java.io.File
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


val cardinalDirection = listOf("North", "South", "West", "East")
var allMonsters : MutableList<Creature> = mutableListOf()
val gson = Gson()

fun playerName() : String{
    println("Type in your name : ")
    return readln()
}
fun playerCreation(name : String) : Player {
    return Player(name,hp = 30, xp = 0, mana = 30, level = 1, attack = 10, inv = mutableListOf(), position = Position(0,0))
}

fun monsterCreation() = runBlocking {
    val jsonContent = async(Dispatchers.IO){
        File("C:\\Users\\OgnjenStankovic\\Documents\\Godotgame\\game-rewrite-2\\src\\main\\resources\\Monsters.json").readText()
    }
    val monster = async(Dispatchers.Default){
        val monsterTypeList = object : TypeToken<MutableList<Creature>>() {}.type
        Gson().fromJson<MutableList<Creature>>(jsonContent.await(), monsterTypeList)
    }
    allMonsters = monster.await()
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