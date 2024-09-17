class Potion(id : Int, usable : Boolean, desc : String, name : String, var healing : Int) : Item(id, usable, desc, name) {
    fun usePotion(player : Player){
        if (usable && healing > 0){
            println("You use the $name potion")
            player.hp += healing
            player.inv.remove(this)
        }
    }
}