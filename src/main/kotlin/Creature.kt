open class Creature (var name : String,var hp : Int, var xp : Int, var attack : Int, var level : Int, val position: Position, val icon: String) {
    open fun attack(attacker: Creature, defender : Creature){
        if (defender is Player){
            generateBoolean().let {
                if (it){
                    println("The ${attacker.name} attacks you!")
                    defender.hp -= attacker.attack
                }
                else {
                    println("The monster missed!")
                }
            }
        }
    }
}