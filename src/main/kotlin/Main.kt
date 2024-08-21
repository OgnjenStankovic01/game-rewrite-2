fun main(){
    monsterCreation()
    val potionNames = listOf("Greater healing potion", "Minor healing potion", "Healing potion")
    val s = spawnPotions(potionNames)
    val playerName = playerName()
    val player = playerCreation(playerName)
    allMonsters.add(player)
    s.forEach {
        player.inv.add(it)
    }
    explore(player)
}