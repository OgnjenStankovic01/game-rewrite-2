class Player(name : String, hp : Int,xp : Int,level : Int,attack : Int, var mana : Int, var inv : MutableList<Item>) : Creature(name,hp,xp,attack,level) {
    fun levelup(){
        if (xp >= 30){
            xp = 0
            level++
        }
    }
    fun openInv(){
        inv.forEachIndexed{ index, item ->
            println("$index) ${item.name}")
       }
    }

    fun usePotion() {
        TODO("Not yet implemented")
    }
}
