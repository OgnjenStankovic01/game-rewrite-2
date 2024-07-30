open class Creature (var name : String,var hp : Int, var xp : Int, var attack : Int, var level : Int, val position: Position) {
    fun attack(attacker: Creature,defender : Creature){
        if (attacker is Player){
            defender.hp -= attacker.attack
        }
    }
}