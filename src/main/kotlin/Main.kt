fun main(){
    val playerName = playerName()
    val player = playerCreation(playerName)
    val monster = monsterCreation(playerName)
    combat(monster,player)
}