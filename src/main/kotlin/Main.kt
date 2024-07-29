fun main(){
    val potionNames = listOf("Greater healing potion", "Minor healing potion", "Healing potion")
    val s = spawnPotions(potionNames)
    s.forEach {
        println(it.name)
    }
    val playerName = playerName()
    val player = playerCreation(playerName)
    val monster = monsterCreation(playerName)
    combat(monster,player)
}