open class Creature (var name : String,var hp : Int, var xp : Int, var attack : Int, var level : Int, val position: Position, val icon: String) {
    fun attack(attacker: Creature,defender : Creature){
            defender.hp -= attacker.attack
    }
}