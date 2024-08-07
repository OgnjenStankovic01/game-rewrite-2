fun main(){
    val potionNames = listOf("Greater healing potion", "Minor healing potion", "Healing potion")
    val s = spawnPotions(potionNames)
    val playerName = playerName()
    val player = playerCreation(playerName)
    s.forEach {
        player.inv.add(it)
    }
    monsterCreation()
    explore(player)
}