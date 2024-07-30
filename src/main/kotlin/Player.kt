class Player(name : String, hp : Int,xp : Int,level : Int,attack : Int, var mana : Int, var inv : MutableList<Item>, position: Position) : Creature(name,hp,xp,attack,level,position) {
    fun levelup(){
        if (xp >= 30){
            xp = 0
            level++
        }
    }
    fun openInv(){
        inv.forEachIndexed{ index, item ->
            println("${index+1}) ${item.name}")
       }
    }

    fun usePotion() {
        openInv()
        println("Choose which item to use: ")
        readln().lowercase().trim()
    }
}
