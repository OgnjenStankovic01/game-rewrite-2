class Player(hp : Int,xp : Int,level : Int,attack : Int, var mana : Int) : Creature(hp,xp,attack,level) {
    fun levelup(){
        if (xp >= 30){
            xp = 0
            level++
        }
    }
}

