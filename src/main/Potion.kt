class Potion(id, usable, desc, name, var healing : Int) : Item(id, usable, desc, name) {
    fun usePotion(player : Player){
        if (usable && healing > 0){
            println("You use the $name potion")
            player.hp = player.hp + healing
        }
    }
}